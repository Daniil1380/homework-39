import java.time.LocalDateTime;
import java.util.Objects;

public class Meeting {

    private String who;

    private String withWho;

    private LocalDateTime meetingTime;

    public Meeting(String who, String withWho, LocalDateTime meetingTime) {
        this.who = who;
        this.withWho = withWho;
        this.meetingTime = meetingTime;
    }

    @Override
    public String toString() {
        return "Meeting{" +
                "who='" + who + '\'' +
                ", withWho='" + withWho + '\'' +
                ", meetingTime=" + meetingTime +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Meeting meeting = (Meeting) o;
        return Objects.equals(who, meeting.who) && Objects.equals(withWho, meeting.withWho) && Objects.equals(meetingTime, meeting.meetingTime);
    }

    @Override
    public int hashCode() {
        int result = Objects.hashCode(who);
        result = 31 * result + Objects.hashCode(withWho);
        result = 31 * result + Objects.hashCode(meetingTime);
        return result;
    }

    public String getWho() {
        return who;
    }

    public void setWho(String who) {
        this.who = who;
    }

    public String getWithWho() {
        return withWho;
    }

    public void setWithWho(String withWho) {
        this.withWho = withWho;
    }

    public LocalDateTime getMeetingTime() {
        return meetingTime;
    }

    public void setMeetingTime(LocalDateTime meetingTime) {
        this.meetingTime = meetingTime;
    }
}
