import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class ProgrammingLanguageMain {

    public static void main(String[] args) {
        List<ProgrammingLanguage> list = new ArrayList<>();

        ProgrammingLanguage programmingLanguage = new ProgrammingLanguage(
                "Java", LocalDate.of(1994, 1, 1), "Джеймс Гослинг");
        list.add(programmingLanguage);

        ProgrammingLanguage oldestLanguage = list.stream()
                .min(Comparator.comparing(ProgrammingLanguage::getDateOfCreation))
                .orElse(null);

        System.out.println(programmingLanguage);



    }
}
