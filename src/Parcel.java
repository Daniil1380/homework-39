import java.time.Instant;
import java.util.Objects;

public class Parcel {

    private String departureCity;

    private String arrivalCity;

    private double weight;

    private Instant createdBy;

    public Parcel(String departureCity, String arrivalCity, double weight, Instant createdBy) {
        this.departureCity = departureCity;
        this.arrivalCity = arrivalCity;
        this.weight = weight;
        this.createdBy = createdBy;
    }

    @Override
    public String toString() {
        return "Parcel{" +
                "departureCity='" + departureCity + '\'' +
                ", arrivalCity='" + arrivalCity + '\'' +
                ", weight=" + weight +
                ", createdBy=" + createdBy +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Parcel parcel = (Parcel) o;
        return Double.compare(weight, parcel.weight) == 0 && Objects.equals(departureCity, parcel.departureCity) && Objects.equals(arrivalCity, parcel.arrivalCity) && Objects.equals(createdBy, parcel.createdBy);
    }

    @Override
    public int hashCode() {
        int result = Objects.hashCode(departureCity);
        result = 31 * result + Objects.hashCode(arrivalCity);
        result = 31 * result + Double.hashCode(weight);
        result = 31 * result + Objects.hashCode(createdBy);
        return result;
    }

    public String getDepartureCity() {
        return departureCity;
    }

    public void setDepartureCity(String departureCity) {
        this.departureCity = departureCity;
    }

    public String getArrivalCity() {
        return arrivalCity;
    }

    public void setArrivalCity(String arrivalCity) {
        this.arrivalCity = arrivalCity;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public Instant getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(Instant createdBy) {
        this.createdBy = createdBy;
    }
}
