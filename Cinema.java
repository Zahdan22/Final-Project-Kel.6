import java.util.ArrayList;
import java.util.List;

public class Cinema {
    private List<Schedule> schedules;

    public Cinema() {
        this.schedules = new ArrayList<>();
    }

    public void addSchedule(Schedule schedule) {
        schedules.add(schedule);
    }

    public void showAllSchedules() {
        System.out.println("\n🎬 Movie Schedules:");
        for (Schedule s : schedules) {
            s.showScheduleInfo();
            System.out.println("--------------------");
        }
    }

    public List<Schedule> getSchedules() {
        return schedules;
    }
}
