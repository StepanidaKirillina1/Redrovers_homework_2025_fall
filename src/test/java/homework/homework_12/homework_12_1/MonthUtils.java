package homework.homework_12.homework_12_1;

public class MonthUtils {
    static Month january = new Month("January", 31, 17);
    static Month february = new Month("February", 28, 20);
    static Month march = new Month("March", 31, 21);
    static Month april = new Month("April", 30, 22);
    static Month may = new Month("May", 31, 18);
    static Month june = new Month("June", 30, 21);
    static Month july = new Month("July", 31, 22);
    static Month august = new Month("August", 31, 22);
    static Month september = new Month("September", 30, 21);
    static Month october = new Month("October", 31, 23);
    static Month november = new Month("November", 30, 21);
    static Month december = new Month("December", 31, 20);

    public static Month[] getAllMonths() {
        return new Month[]{
            january,
            february,
            march,
            april,
            may,
            june,
            july,
            august,
            september,
            october,
            november,
            december
        };
    }

    public static Month[] getMonthsOfFirstHalfOfYear() {
        return new Month[]{
                january,
                february,
                march,
                april,
                may,
                june
        };
    }

    public static Month[] getMonthsOfSecondHalfOfYear() {
        return new Month[]{
                july,
                august,
                september,
                october,
                november,
                december
        };
    }
}
