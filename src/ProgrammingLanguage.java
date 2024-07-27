import java.time.LocalDate;
import java.util.Objects;

public class ProgrammingLanguage {

    private String name;

    private String author;

    private LocalDate dateOfCreation;

    public ProgrammingLanguage(String name, LocalDate dateOfCreation, String author) {
        this.name = name;
        this.dateOfCreation = dateOfCreation;
        this.author = author;
    }

    @Override
    public String toString() {
        return "ProgrammingLanguage{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", dateOfCreation=" + dateOfCreation +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ProgrammingLanguage that = (ProgrammingLanguage) o;
        return Objects.equals(name, that.name) && Objects.equals(author, that.author) && Objects.equals(dateOfCreation, that.dateOfCreation);
    }

    @Override
    public int hashCode() {
        int result = Objects.hashCode(name);
        result = 31 * result + Objects.hashCode(author);
        result = 31 * result + Objects.hashCode(dateOfCreation);
        return result;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDateOfCreation() {
        return dateOfCreation;
    }

    public void setDateOfCreation(LocalDate dateOfCreation) {
        this.dateOfCreation = dateOfCreation;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
