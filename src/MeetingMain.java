import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

import static java.time.temporal.ChronoField.MINUTE_OF_DAY;
import static java.time.temporal.ChronoField.SECOND_OF_DAY;

public class MeetingMain {

    public static void main(String[] args) {
        List<Meeting> list = new ArrayList<>();
        Meeting meeting1 = new Meeting("", "", LocalDateTime.of(LocalDate.now(), LocalTime.of(23, 45)));
        Meeting meeting2 = new Meeting("", "", LocalDateTime.of(LocalDate.now(), LocalTime.of(22, 30)));
        Meeting meeting3 = new Meeting("", "", LocalDateTime.of(LocalDate.now(), LocalTime.of(21, 15)));
        Meeting meeting4 = new Meeting("", "", LocalDateTime.of(LocalDate.now(), LocalTime.of(20, 0)));

        list.add(meeting1);
        list.add(meeting2);
        list.add(meeting3);
        list.add(meeting4);

        int sum = list.stream()
                .map(meeting -> meeting.getMeetingTime().toLocalTime())
                .map(localTime -> localTime.get(SECOND_OF_DAY))
                .reduce((first, second) -> first + second)
                .orElse(0);

        int average = sum / list.size();

        LocalTime localTime = LocalTime.ofSecondOfDay(average);

        System.out.println(localTime);


    }
}
