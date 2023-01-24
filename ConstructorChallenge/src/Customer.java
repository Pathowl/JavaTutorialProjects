public class Customer {
    private String name;
    private double creditLimit;
    private String mail;

    public Customer() {
        this("Nobody", "Nobody@com");
    }

    public Customer(String name, String mail) {
        this(name, 1000, mail);
    }
    public Customer(String name, double creditLimit, String mail){
        this.name = name;
        this.creditLimit = creditLimit;
        this.mail = mail;
    }

    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getMail() {
        return mail;
    }


}
