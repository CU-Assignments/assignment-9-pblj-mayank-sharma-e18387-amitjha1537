public class TestTransaction {
    public static void main(String[] args) {
        BankService service = new BankServiceImpl();
        service.transfer(1, 2, 500.0);
    }
}