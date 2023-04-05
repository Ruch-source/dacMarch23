import java.text.SimpleDateFormat;
import java.util.*;
class Q1{
    void display()throws Exception{
        Scanner sc=new Scanner(System.in);

        System.out.println("enter date:");
        String str=sc.nextLine();
        
        System.out.println("enter pattern 1:");
        String pattern1=sc.nextLine();
        

        SimpleDateFormat sdf= new SimpleDateFormat("MM/dd/yyyy");
        Date date = sdf.parse(str);
        
        SimpleDateFormat obj = new SimpleDateFormat(pattern1);
        String format1 = obj.format(date);

        
        System.out.println("Format a:"+format1);
        
    }
    public static void main(String[] args)throws Exception{
        Q1 obj=new Q1();
        obj.display();
    }
}