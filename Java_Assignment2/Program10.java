import java.util.*;

import javax.lang.model.util.ElementScanner6;
class Credit{
    private int creditHistory;
    private int creditUtilization;
    private boolean paymentHistory;

    Credit(){
        this.creditHistory=0;
        this.creditUtilization=0;
        this.paymentHistory=false;
    }
    int getCreditHistory(){
        return this.creditHistory;
    }
    int getCreditUtilization(){
        return this.creditUtilization;
    }
    boolean getPaymentHistory(){
        return this.paymentHistory;
    }
    void setCreditHistory(int creditHistory){
        this.creditHistory=creditHistory;
    }
    void setCreditUtilization(int creditUtilization){
        this.creditUtilization=creditUtilization;
    }
    void setPaymentHistory(boolean paymentHistory){
        this.paymentHistory=paymentHistory;
    }
}
class CreditTest{
    Credit c=new Credit();
    Scanner sc=new Scanner(System.in);
    void acceptRecord(){
        System.out.println("Enter Credit history    :");
        c.setCreditHistory(sc.nextInt());
        System.out.println("Enter Credit utilization    :");
        c.setCreditUtilization(sc.nextInt());
        System.out.println("Enter Credit Payment history    :");
        c.setPaymentHistory(sc.nextBoolean());
    }
    int calculateCreditScore(){
        if(c.getPaymentHistory()==true)
            return c.getCreditHistory()*15 + c.getCreditUtilization()*30+55;
        else
            return c.getCreditHistory()*15 + c.getCreditUtilization()*30+35;
        
    }
}
class Program10 {
    public static void main(String[] args) {
        CreditTest ct=new CreditTest();
        ct.acceptRecord();
        System.out.println("Credit Score: "+ct.calculateCreditScore());
    }
}
