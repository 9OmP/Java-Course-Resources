public class Account {
    private int acc_no;
    private double acc_balance;
    private String cust_name;
    private String cust_email;
    private int cust_phone;

    public Account(){
        System.out.println("Empty Constructor Called.");
    }
    public  Account(int acc_no, double acc_balance, String cust_name, String cust_email, int cust_phone){
        this.acc_no = acc_no;
        this.acc_balance = acc_balance;
        this.cust_name = cust_name;
        this.cust_email = cust_email;
        this.cust_phone = cust_phone;
        System.out.println("Bigger Constructor Called.");
    }

    public int getAcc_no() {
        return acc_no;
    }
    public void setAcc_no(int acc_no) {
        this.acc_no = acc_no;
    }
    public double getAcc_balance() {
        return acc_balance;
    }
    public void setAcc_balance(double acc_balance) {
        this.acc_balance = acc_balance;
    }
    public String getCust_email() {
        return cust_email;
    }
    public void setCust_email(String cust_email) {
        this.cust_email = cust_email;
    }
    public String getCust_name() {
        return cust_name;
    }
    public void setCust_name(String cust_name) {
        this.cust_name = cust_name;
    }
    public int getCust_phone() {
        return cust_phone;
    }
    public void setCust_phone(int cust_phone) {
        this.cust_phone = cust_phone;
    }

    public void deposit_funds(double funds){
        funds += getAcc_balance();
        setAcc_balance(funds);
        System.out.println("Deposit Complete.");
    }

    public void withdraw_funds(double funds){
        if (funds > getAcc_balance()){
            System.out.println("You have insufficient Balance.");
            return;
        }
        setAcc_balance(getAcc_balance() - funds);
        System.out.println("Withdrawal completed.");
    }
}
