
package bankingapplication3;

public class CurrentAccount implements Account {

    private int accountNumber;
    private String accountName;
    private double balance;
    private double minimum;
    private String accountType = "CurrentAccount";

    public CurrentAccount(int accountNumber, String accountName, double balance) {
        this.accountNumber = accountNumber;
        this.accountName = accountName;
        this.balance = balance;
        this.minimum = 1000;
    }

    @Override
    public void deposit(double amount) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void withdraw(double amount) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public double getBalance() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public String getAccountType() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public int getAccountNumber() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public String getAccountName() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
