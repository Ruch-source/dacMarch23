import java.util.*;
class ElectricityBill{
    private String customerName;
    private double unitsConsumed;
    private double billAmount;

    ElectricityBill(String customerName , double unitsConsumed){
        this.customerName=customerName;
        this.unitsConsumed=unitsConsumed;
    }
    String getName(){
        return this.customerName;
    }
    double getUnitsConsumed(){
        return this.unitsConsumed;
    }
    double getBill(){
        if(unitsConsumed<=100)
            this.billAmount=this.unitsConsumed*5;
        else if(unitsConsumed<=300)
            this.billAmount=500+(this.unitsConsumed-100)*7;
        else
            this.billAmount=500+1400+(this.unitsConsumed-300)*10;
        return this.billAmount;
    }

}
class BillTest{
    Scanner sc=new Scanner(System.in);
    ElectricityBill eb;

    void addRecord(){
        sc.nextLine();
        System.out.println("Enter name  :");
        String name=sc.nextLine();
        System.out.println("Enter units Consumed    :");
        double unitsConsumed=sc.nextDouble();
        eb=new ElectricityBill(name, unitsConsumed);
    }
    void printRecord(){
        System.out.println("Name    :"+eb.getName());
        System.out.println("Name    :"+eb.getUnitsConsumed());
        System.out.println("Name    :"+eb.getBill());
    }
    int menuList(){
        System.out.println("0.Exit");
        System.out.println("1.add Record");
        System.out.println("2.print Record");
        System.out.println("Enter choice:");
        return sc.nextInt();
    }
}
class Program4 {
    public static void main(String[] args) {
        BillTest bt=new BillTest();
        int choice;
        while((choice=bt.menuList())!=0){
            switch(choice){
                case 1:bt.addRecord();
                        break;
                case 2: bt.printRecord();
                        break; 
            }
        }
    }
}
