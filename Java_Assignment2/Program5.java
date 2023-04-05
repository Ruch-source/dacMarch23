import java.util.*;
class TelepBill{
    private String name;
    private String phone_no;
    private int noOfCalls;
    private int duration;

    TelepBill(String name, String phone_no){
        this.name=name;
        this.phone_no=phone_no;
    }
    int getNoOfCalls(){
        return this.noOfCalls;
    }
    int getDuration(){
        return this.duration;
    }

    void setNoOfCalls(int noOfCalls){
        this.noOfCalls=noOfCalls;
    }
    void setDuration(int duration){
        this.duration=duration;
    }
    
}
class BillTest{
    TelepBill tb;
    Scanner sc=new Scanner(System.in);
    
    void acceptRecord(){
       
        sc.nextLine();
        System.out.println("Enter name  :");
        String name=sc.nextLine();
        System.out.println("Enter phone no:");
        String phone_no=sc.nextLine();
        tb=new TelepBill(name, phone_no);
        System.out.println("Enter the number of calls   :");
        tb.setNoOfCalls(sc.nextInt());
        System.out.println("Enter the duration   :");
        tb.setDuration(sc.nextInt());

    }
 
    double calculateBill(){
        if(tb.getNoOfCalls()<=100)
            return tb.getNoOfCalls()*0.5+10;
        else
             return 100*0.5+(tb.getNoOfCalls()-100)*0.25+10;
    }

    int menuList(){
        System.out.println("0.Exit");
        System.out.println("1.addRecord");
        System.out.println("2.Calculate Bill");
        System.out.println("Enter choice:");
        return sc.nextInt();
    }
}
class Program5 {
    public static void main(String[] args) {
        BillTest bt1=new BillTest();
        int choice;
        while((choice=bt1.menuList())!=0){
            switch(choice){
                case 1:bt1.acceptRecord();
                        break;
                
                case 2:System.out.println("Bill Amount  :"+bt1.calculateBill()+"$");
                         break; 
            }
        }
    }
}
