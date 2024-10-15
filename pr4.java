
public class pr4 {

    public static void main(String[] args) {

        String[] appliance = {"Motor", "Fan", "Tubelight", "Wires", "All others"};
        int[] productCodes = {1, 2, 3, 4, 5};
        double[] prices = {1600.0, 1800.0, 700.0, 1200.0, 1900.0};

        Bill(appliance, productCodes, prices);
    }

    public static void Bill(String[] appliance, int[] productCodes, double[] prices) {
        double totalBill = 0.0;

        System.out.printf("%-15s %-12s %-10s %-8s %-12s%n", "Product Name", "Product Code", "Price", "Tax", "Total Price");

        for (int i = 0; i < productCodes.length; i++) {
            String str = appliance[i];
            int code = productCodes[i];
            double price = prices[i];
            double taxRate = getTaxRate(code);
            double tax = price * taxRate / 100;
            double totalPrice = price + tax;

            totalBill += totalPrice;

            System.out.printf("%-15s %-12d %-10.2f %-8.2f %-12.2f%n", str, code, price, tax, totalPrice);
        }

        System.out.println("Total Bill: " + totalBill);
        System.out.println("\n Made by:Heli Patel-23DIT044");
    }

    public static double getTaxRate(int productCode) {
        switch (productCode) {
            case 1:
                return 8.0;
            case 2:
                return 12.0;
            case 3:
                return 5.0;
            case 4:
                return 7.5;
            default:
                return 3.0;
        }
    }
}