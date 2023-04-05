import java.util.Scanner;

class Q33 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int choice=0;
        int i=Integer.parseInt(args[0]);
        float f=Float.parseFloat(args[1]);
        double d=Double.parseDouble(args[2]);
        do{
            System.out.println("1.Addition");
            System.out.println("2.Subtraction");
            System.out.println("3.Multiplication");
            System.out.println("4.Division");
            System.out.println("5.exit");
            System.out.println("Enter your choice:");
            choice=sc.nextInt();
            switch(choice){
                case 1: System.out.println("sum: "+(i+f+d));
                        break;
                case 2: System.out.println("Subtraction: "+(i-f-d));
                        break;
                case 3: System.out.println("Multiplication: "+(i*f*d));
                        break;
                case 4: System.out.println("division: "+(i/f/d));
                        break;
            }

        }while(choice !=5);
        
    }    
}
