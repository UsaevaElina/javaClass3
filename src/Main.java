public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        int result = service.calculate(1000000, 1, 9.99);
        System.out.println(result);

        int result2 = service.calculate(1000000, 2, 9.99);
        System.out.println(result2);

        int result3 = service.calculate(1000000, 3, 9.99);
        System.out.println(result3);

    }
}