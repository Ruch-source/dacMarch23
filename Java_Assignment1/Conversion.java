class test{
    /**
     * Display function - return type is void 
     */
    void display(){
        System.out.println("Ruchika");
    }
}
public class Conversion {
    public static void main(String[] args) {
        boolean value=false;
        String str= String.valueOf(value);
        Boolean b1= Boolean.valueOf(value);
        boolean b2=Boolean.parseBoolean(str);
        Boolean b3=Boolean.valueOf(str);

        System.out.println(str);
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
        System.out.println(str);
        test t=new test();
        t=null;
       // t=null;
         t.display();
       
    }
}
