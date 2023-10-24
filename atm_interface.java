import java.util.*;
class atm{
  protected int bal;

  public atm(){
    bal = 0;
  }

  public atm(int a){
    bal = a;
  }

  public void withdraw(int amount){
    if(amount > bal)
      System.out.println("Insufficient Balance");
    else{
      bal -= amount;
      System.out.println("Balance updated");
    }
  }

  public void deposit(int amount){
    bal += amount;
    System.out.println("Deposited Amount: " +amount);
    System.out.println("Balance updated");
  }

  public void checkBalance(){
    System.out.println("Balance: " + bal);
  }
}  
class user extends atm{
  String name, idno;

  public user(){
    super();
    name = "";
    idno = "";
  }

  public user(int b, String n, String id){
    super(b);
    name = n;
    idno = id;
  }
}
public class atm_interface{
  public static void main(String args[]){
  Scanner sc = new Scanner(System.in);
  int choice, bal, ch;
  String n, id;
  try{
    System.out.println("Enter balance of user: ");
    bal = sc.nextInt();
    System.out.println("Enter Name and ID number of the user: ");
    n=sc.next();
    id=sc.next();
    do{
    System.out.println("Enter 1 for withdraw, \n2 for deposit, & \n3 for Balance check: ");
    choice = sc.nextInt();
    user obj = new user(bal, n, id);
    switch (choice){
      case 1:
      obj.withdraw(sc.nextInt());
      break;
      case 2:
      obj.deposit(sc.nextInt());
      break;
      case 3:
      obj.checkBalance();
      break;
      default:
      System.out.println("Invalid input");
      }
      System.out.println("\nDo you want to continue? press 1");
      ch = sc.nextInt();
    }while(ch == 1);
    }finally{
    sc.close();
    }
  }
}