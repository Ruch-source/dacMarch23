import java.util.Scanner;

class BmiCalculator{
    private double height;
    private double weight;

    BmiCalculator(){
        this.height=0;
        this.weight=0;
    }
    public void setHeight(Double height){
        this.height=height;
    }
    public void setWeight(Double weight){
        this.weight=weight;
    }

    public Double getHeight(){
        return this.height;
    }
    public Double getWeight(){
        return this.weight;
    }
    public Double getBmi(Double height,Double weight){
        return weight/(height * height);
    }
}
class test{
    BmiCalculator obj=new BmiCalculator();
    Scanner sc= new Scanner(System.in);
    void acceptRecord(){
        System.out.println("enter height    :");
        obj.setHeight(sc.nextDouble());
        System.out.println("enter weight    :");
        obj.setWeight(sc.nextDouble());
    }
    void printRecord(){
        // System.out.println(obj.getHeight());
        // System.out.println(obj.getWeight());
        System.out.println("BMI :"+obj.getBmi(obj.getHeight(),obj.getWeight()));
    }
    int menuList(){
        System.out.println("0.Exit");
        System.out.println("1.Accept Record");
        System.out.println("2.Get BMI");
        System.out.println("Enter your choice");
        return sc.nextInt();

    }
}
class Program2{
    public static void main(String[] args) {
        test t1=new test();
        int choice;
        while((choice=t1.menuList())!=0){
            switch (choice) {
                case 1: t1.acceptRecord(); 
                        break;
                case 2: t1.printRecord();
                        break;
            }
        }
    }
}