public class bankAccount {
    private String accountNumber;
    private double balance;
    private String name;
    private String mail;
    private String phoneNumber;

    public bankAccount() {
        this("56789", 2.50, "Default name", "Default address", "Default phone");
        System.out.println("Empty constructor called");
    }

    public bankAccount(String accountNumber, double balance, String name, String mail, String phoneNumber){
        System.out.println("Account constructor with parameters called");
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.name = name;
        this.mail = mail;
        this.phoneNumber = phoneNumber;

    }

    public bankAccount(String name, String mail, String phoneNumber) {
        this("99999", 1000.55, name, mail, phoneNumber);
//        this.name = name;
//        this.mail = mail;
//        this.phoneNumber = phon eNumber;
    }

    public String getAccountNumber(){
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public String getName() {
        return name;
    }

    public String getMail() {
        return mail;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public void deposit(double amountDeposit){
        balance += amountDeposit;
        System.out.println("Deposit done, new amount: " + balance + "$");
    }
    public void withdraw(double amountWithdraw){
        if (balance - amountWithdraw < 0){
            System.out.println("Not enough funds! You only have: " + balance + "$ in Your account!");

        }else {
            balance -= amountWithdraw;
            System.out.println("Withdrawal done, remaining balance: " + balance + "$");
        }
    }
    public void showBalance(){
        System.out.println("Your balance is: " + balance);
    }
    public void accountDetails(){
        System.out.println("Balance = " + balance +
                " Mail = " + mail +
                " Name = " + name +
                " Phone Number = " + phoneNumber +
                " Account Number = " + accountNumber);
    }
}
