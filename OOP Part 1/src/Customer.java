public class Customer {
    private String name;
    private int credit_limit;
    private String email;

    public Customer(){
        this("Default",  "default@gmail.com");
        System.out.println("No-args Parameter Constructor Called.");
    }

    public Customer(String name, String email){
        this(name, 99999, email);
        System.out.println("2 Parameter Constructor Called.");
    }

    public Customer(String name, int credit_limit, String email){
        this.name = name;
        this.credit_limit = credit_limit;
        this.email = email;
        System.out.println("3 Parameter Constructor Called.");
        System.out.println(this.name+ " " + this.credit_limit + " " + this.email);
    }

    public String getEmail() {
        return email;
    }
    public int getCredit_limit() {
        return credit_limit;
    }
    public String getName() {
        return name;
    }
}
