class Date {

    private int mon;
    private int date;
    private int yr;

    public Date(int mon, int date, int yr) {
        this.mon = mon;
        this.date = date;
        this.yr = yr;
    }

    public int gmon() {
        return mon;
    }

    public void smon(int mon) {
        this.mon = mon;
    }

    public int gday() {
        return date;
    }

    public void sday(int date) {
        this.date = date;
    }

    public int gyear() {
        return yr;
    }

    public void syear(int yr) {
        this.yr = yr;
    }

    public void printDate() {
        System.out.println(mon + "/" + date + "/" + yr);
    }
}

public class pr13 {

    public static void main(String[] args) {
        Date date1 = new Date(7, 18, 2024);
        Date date2 = new Date(12, 25, 2024);

        date1.printDate();
        date2.printDate();

        date1.smon(8);
        date1.sday(20);
        date1.syear(2025);

        System.out.println("\n::::::::::Updated dates::::::::::");
        date1.printDate();
        date2.printDate();
        System.out.println("\n Made by: Heli Patel-23DIT044");
    }
}
