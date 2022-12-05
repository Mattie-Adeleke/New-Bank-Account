public class SavingsAccount {
  int balance;

  public SavingsAccount(int initialBalance) {
    balance = initialBalance;
  }

  public void checkBalance() {
    System.out.println("Your balance is " + balance);
  }

  public void deposit(int amountToDeposit) {
    balance += amountToDeposit;
    System.out.println("You deposited " + amountToDeposit);
  }

  public void withdraw(int amountToWithdraw) {
    balance -= amountToWithdraw;
    System.out.println("You just withdrew " + amountToWithdraw);
  }

  public static void main(String[] args) {
    SavingsAccount savings = new SavingsAccount(25000);
    // Check balance:
    savings.checkBalance();
    savings.deposit(1500);
    savings.checkBalance();
    savings.withdraw(5000);
    savings.checkBalance();
    
  }
}