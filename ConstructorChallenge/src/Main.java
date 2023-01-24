public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer("Patryk", 1000, "piesek@gmail.com");
        System.out.println(customer.getName());
        System.out.println(customer.getCreditLimit());
        System.out.println(customer.getMail());

        Customer secondCustomer = new Customer();
        System.out.println(secondCustomer.getName());
        System.out.println(secondCustomer.getCreditLimit());
        System.out.println(secondCustomer.getMail());

        Customer thirdCustomer = new Customer("Joe", "joe@mail.com");
        System.out.println(secondCustomer.getName());
        System.out.println(secondCustomer.getCreditLimit());
        System.out.println(secondCustomer.getMail());

    }
}