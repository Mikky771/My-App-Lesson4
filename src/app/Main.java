package app;

public class Main {

    static String product;
    static double quota;
    static double price;
    private final static String CURRENCY = "EUR";

    public static void main(String[] args) {
        product = "smartphone";
        quota = 5;
        price = 486.13;
        double cost = quota * price;
        double total = cost * 5;
        System.out.println("Product # " + product );
        System.out.printf("Sales by day is %s %.2f%n", CURRENCY, cost);
        System.out.printf("Total sales for 5 days is %s %.2f", CURRENCY, total);

        product = "laptop";
        quota = 8;
        price = 187.26;
        double costL = quota * price;
        double totalL = cost * 7;
        System.out.println("\nProduct # " + product );
        System.out.printf("Sales by day is %s %.2f%n", CURRENCY, costL);
        System.out.printf("Total sales for 7 days is %s %.2f", CURRENCY, totalL);
    }
}
