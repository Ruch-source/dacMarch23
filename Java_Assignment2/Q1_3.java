import java.util.*;
import java.text.*;
class Q1_3{
    public static void main(String[] args)throws Exception {
        Scanner sc=new Scanner(System.in);

        System.out.println("enter year:");
        int year=sc.nextInt();
        System.out.println("enter month:");
        int month=sc.nextInt();
        System.out.println("enter year:");
        int day=sc.nextInt();
        System.out.println("enter hour:");
        int hour=sc.nextInt();
        System.out.println("enter min:");
        int min=sc.nextInt();
        System.out.println("enter sec:");
        int sec=sc.nextInt();
        sc.nextLine();
        System.out.println("enter pattern 1:");
        String pattern1=sc.nextLine();
        Date date=new Date(year, month, day, hour, min, sec);

        SimpleDateFormat obj = new SimpleDateFormat(pattern1);
        String format1 = obj.format(date);

        // SimpleDateFormat obj2 = new SimpleDateFormat(pattern2);
        // String format2 = obj2.format(date);

        // SimpleDateFormat obj3 = new SimpleDateFormat(pattern3);
        // String format3 = obj3.format(date);
        System.out.println("Format 1:"+format1);
        // System.out.println("Format 2:"+format2);
        // System.out.println("Format 3:"+format3);


    }
}