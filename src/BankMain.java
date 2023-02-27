public class BankMain {

    public static void main(String[] args) {
        BankAccount account1 = new BankAccount("66454727762", 67000.00);
        BankAccount account2 = new BankAccount("15636363673", 200.00);

        System.out.println("Initial balance:");
        System.out.println("Account 1: " + account1.getBalance());

        System.out.println("Account 2: " + account2.getBalance());

        account1.deposit(100.00);
        account2.withdraw(50.00);

        System.out.println("Final balance:");
        System.out.println("Account 1: " + account1.getBalance());
        System.out.println("Account 2: " + account2.getBalance());
    }
}

