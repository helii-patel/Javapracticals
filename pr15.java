public class pr15 {

    private double r;
    private double i;

    public pr15(double r, double i) {
        this.r = r;
        this.i = i;
    }

    public double getR() {
        return r;
    }

    public double getI() {
        return i;
    }

    public pr15 add(pr15 o) {
        return new pr15(this.r + o.r, this.i + o.i);
    }

    public pr15 sub(pr15 o) {
        return new pr15(this.r - o.r, this.i - o.i);
    }

    public pr15 mul(pr15 o) {
        double rp = this.r * o.r - this.i * o.i;
        double ip = this.r * o.i + this.i * o.r;
        return new pr15(rp, ip);
    }

    public pr15 div(pr15 o) {
        double den = o.r * o.r + o.i * o.i;
        double rp = (this.r * o.r + this.i * o.i) / den;
        double ip = (this.i * o.r - this.r * o.i) / den;
        return new pr15(rp, ip);
    }

    @Override
    public String toString() {
        if (i >= 0) {
            return r + " + " + i + "i";
        } else {
            return r + " - " + (-i) + "i";
        }
    }

    public static void main(String[] args) {
        pr15 n1 = new pr15(4, 5);
        pr15 n2 = new pr15(2, 3);

        pr15 sum = n1.add(n2);
        pr15 diff = n1.sub(n2);
        pr15 prod = n1.mul(n2);
        pr15 quot = n1.div(n2);

        System.out.println("n1: " + n1);
        System.out.println("n2: " + n2);
        System.out.println("Sum: " + sum);
        System.out.println("Diff: " + diff);
        System.out.println("Prod: " + prod);
        System.out.println("Quot: " + quot);
        System.out.println("\n Made by: Heli Patel-23DIT044");
    }
}