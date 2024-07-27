import java.time.Instant;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ParcelMain {

    private static final String BERLIN = "Berlin";

    public static void main(String[] args) {
        System.out.println(Instant.now().getEpochSecond());
        List<Parcel> parcels = new ArrayList<>();
        Parcel parcel1 = new Parcel("", "", 23.4, Instant.ofEpochSecond(1722100556));

        Parcel result = parcels.stream()
                .filter((parcel -> parcel.getArrivalCity().equals(BERLIN)))
                .max(Comparator.comparing(Parcel::getCreatedBy))
                .orElse(null);

        System.out.println(result);

    }
}
