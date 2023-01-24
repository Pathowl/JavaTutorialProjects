public class Main {
    public static void main(String[] args) {
//        bankAccount bankAccount = new bankAccount("1234", 1000.00, "Patryk Podlewski", "nigger@gmail.com", "(+48) 1230984901");


        bankAccount bankAccount = new bankAccount();
        System.out.println(bankAccount.getPhoneNumber());
        System.out.println(bankAccount.getBalance());



        bankAccount.deposit(300);
        bankAccount.withdraw( 1200);
        bankAccount.withdraw(150);

        bankAccount bankAccount1 = new bankAccount("Tim", "tim@mail.com", "12345");
        System.out.println("AccountNo: " + bankAccount1.getAccountNumber() + "; name " + bankAccount1.getName());

    }
}