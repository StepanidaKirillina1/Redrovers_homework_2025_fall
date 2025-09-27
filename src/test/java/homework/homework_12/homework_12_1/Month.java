package homework.homework_12.homework_12_1;

public class Month {
    private final String nameOfMonth;
    private final int totalDays;
    private final int workDays;


    public Month(String nameOfMonth, int totalDays, int workDays) {
        this.nameOfMonth = nameOfMonth;
        this.totalDays = totalDays;
        this.workDays = workDays;
    }

    public String getNameOfMonth() {
        return nameOfMonth;
    }

    public int getTotalDays() {
        return totalDays;
    }

    public int getWorkDays() {
        return workDays;
    }
}
