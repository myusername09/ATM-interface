import java.util.Scanner;

public class ATM 
{
  static int balance = 0;
  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int choice;
    
    System.out.println("Welcome to the ATM");
    
    do {
      System.out.println("Please select an option:");
      System.out.println("1. Check balance");
      System.out.println("2. Withdraw");
      System.out.println("3. Deposit");
      System.out.println("4. Exit");
      
      choice = sc.nextInt();
      
      switch (choice) {
        case 1:
          checkBalance();
          break;
        case 2:
          withdraw(sc);
          break;
        case 3:
          deposit(sc);
          break;
        case 4:
          System.out.println("Thank you for using the ATM");
          break;
        default:
          System.out.println("Invalid choice");
          break;
      }
    } while (option != 4);
  }
  
  private static void checkBalance() 
  {
    System.out.println("Your current balance is: " + balance);
  }
  
  private static void withdraw(Scanner input) 
  {
    System.out.println("Enter amount to withdraw:");
    int amount = sc.nextInt();
    
    if (amount <= balance) 
    {
      balance -= amount;
      System.out.println("Withdrawal successful");
    } else 
    {
      System.out.println("Insufficient balance");
    }
  }
  
  private static void deposit(Scanner input)
   {
    System.out.println("Enter amount to deposit:");
    int amount = sc.nextInt();
    
    balance += amount;
    System.out.println("Deposit successful");
  }
}

