import java.util.*;
class RationalNumber{
        private int num1 , num2,num3,num4;

        void setNum1(int num1){
            this.num1=num1;
        }
        void setNum2(int num2){
            this.num2=num2;
        }
        void setNum3(int num3){
            this.num3=num3;
        }
        void setNum4(int num4){
            this.num4=num4;
        }
        float getValue1(){
            return num1/num2;
        }
        float getValue2(){
            return num3/num4;
        }
}

class RationalTest{
    RationalNumber rn=new RationalNumber();
    Scanner sc=new Scanner(System.in);
    void acceptRecord(){
        System.out.println("Enter 1st Rational number   :");
        System.out.println("Enter numerator :");
        rn.setNum1(sc.nextInt());
        System.out.println("Enter Denomenator :");
        rn.setNum2(sc.nextInt());

        System.out.println("Enter 2nd Rational number   :");
        System.out.println("Enter numerator :");
        rn.setNum3(sc.nextInt());
        System.out.println("Enter Denomenator :");
        rn.setNum4(sc.nextInt());

    }
    void addition(){
        System.out.println("Addition    :"+(rn.getValue1()+rn.getValue2()));
    }
    void subtraction(){
        System.out.println("Subtraction    :"+(rn.getValue1()-rn.getValue2()));
    }
    void multiplicationtion(){
        System.out.println("Multiplication    :"+(rn.getValue1()*rn.getValue2()));
    }
    void division(){
        System.out.println("Division    :"+(rn.getValue1()/rn.getValue2()));
    }
    int menuList(){
        System.out.println("0.Exit");
        System.out.println("1.Addition");
        System.out.println("2.Subtraction");
        System.out.println("3.Multiplication");
        System.out.println("4.Division");
        System.out.println("Enter choicw    :");
        return sc.nextInt();
    }

}
class Program7 {
    public static void main(String[] args) {
        int choice;
        RationalTest rt=new RationalTest();
        rt.acceptRecord();
        while((choice=rt.menuList())!=0){
            switch(choice){
                case 1: rt.addition();
                        break;
                case 2: rt.subtraction();
                        break;
                case 3: rt.multiplicationtion();
                        break;
                case 4: rt.division();
                        break;
                    
            }
        }
    }
}
