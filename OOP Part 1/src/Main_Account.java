public class Main_Account {

    public static void main(String[] args) {

        Account account = new Account(12345, 20000, "Om", "om@gmail.com", 951181044);
        System.out.println("Initial Bal: " + account.getAcc_balance());
        account.deposit_funds(10000);
        System.out.println("New Bal: " + account.getAcc_balance());
        account.withdraw_funds(5000);
        System.out.println("New Bal: " + account.getAcc_balance());
        account.withdraw_funds(10000);
        System.out.println("New Bal: " + account.getAcc_balance());
    }
}
