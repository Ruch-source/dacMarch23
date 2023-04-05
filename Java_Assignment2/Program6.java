import java.util.*;

class Bank{
    private String name;
    private static long accountNumber;
    private long accountBalance;        
    
    static{
        accountNumber=1200000100;
    } 
    Bank(){
        accountBalance=0;
        
    }   
    Bank(String name){
        this();
        this.name=name;
    }

    String getName(){
        return this.name;
    }
    static long getAccountNumber(){
        return ++Bank.accountNumber;
    }
    long getAccountBalance(){
        return this.accountBalance;
    }

    void setAccountBalance(long accountBalance){
        this.accountBalance=accountBalance;
    }
}
class BankTest{
    Bank b;
    Scanner sc=new Scanner(System.in);
    void createAccount(){
        sc.nextLine();
        System.out.println("Enter name");
        b=new Bank(sc.nextLine());
        System.out.println("Account number  :"+b.getAccountNumber());
    }

    void depositeMoney(){
        System.out.println("Enter the amount   : ");
        b.setAccountBalance(b.getAccountBalance()+sc.nextLong());
        System.out.println("MONEY HAS BEEN DEPOSITED SUCESSFULLY");
    }
    void withDrawMoney(){

        System.out.println("Enter the amount:    ");
        long withDrawMoney=sc.nextLong();
        if(b.getAccountBalance()<withDrawMoney)
            System.out.println("Insufficient Balance");
        else{
            b.setAccountBalance(b.getAccountBalance()-withDrawMoney);
            System.out.println("MONEY HAS BEEN DEBITED SUCESSFULLY");
        }
            
    }
    void displayAccountBalance(){
        System.out.println("Balance :"+b.getAccountBalance());
    }
    void displayInformation(){
        System.out.println("Account Holder's Name   :"+b.getName());
        System.out.println("Account Number          :"+Bank.getAccountNumber());
        System.out.println("Account Balance         :"+b.getAccountBalance());
    }
    int menuList(){
        System.out.println("0.Exit");
        System.out.println("1.Create Account");
        System.out.println("2.Deposite Money");
        System.out.println("3.Withdraw Money");
        System.out.println("4.Check Balance");
        System.out.println("5.Diplay Information");
        System.out.println("Enter your choice   :");
        return sc.nextInt();
    }
}
class Program6 {
    public static void main(String[] args) {
        int choice;
        BankTest bt=new BankTest();
        while((choice=bt.menuList())!=0){
            switch(choice){
                case 1:bt.createAccount();
                        break;
                case 2:bt.depositeMoney();
                        break;
                case 3:bt.withDrawMoney();
                        break;
                case 4:bt.displayAccountBalance();
                        break;
                case 5:bt.displayInformation();
                        break;
            }
        }
    }
    
}
