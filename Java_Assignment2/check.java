import java.util.*;
import java.text.*;

class check{
    public static void main(String[] args)throws Exception {
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter Date as Date/Month/Year   :");
        String str=sc.nextLine();
        
        System.out.println("Enter Pattern");
        String pattern=sc.nextLine();

        SimpleDateFormat abc=new SimpleDateFormat("dd/MM/yyyy");
        Date date = abc.parse(str);

        SimpleDateFormat xyz=new SimpleDateFormat(pattern);
        String dateformat= xyz.format(date);
        System.out.println(dateformat);
    }
}
 