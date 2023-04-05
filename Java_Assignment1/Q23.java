import javax.print.FlavorException;

class Q23{
    public static void main(String[] args) {
    System.out.println("size: "+Float.SIZE);
    System.out.println("bytes: "+Float.BYTES);
    System.out.println("max value: "+Float.MAX_VALUE);
    System.out.println("min value: "+Float.MIN_VALUE);

    float value=3.56f;
    String str=String.valueOf(value);
    Float f1=Float.valueOf(value);
    Float f2=Float.valueOf(str);
    String hex=Float.toHexString(value);
    System.out.println(hex);

    Float value2=new Float(3.45f);
    byte b=value2.byteValue();
    int i=value2.intValue();
    short d=value2.shortValue();
    long l=value2.longValue();
    float f=value2.floatValue();
    double d=value2.doubleValue(); 

    float num1=34.33f;
    float num2=34.42f;
    System.out.println("min: "+Float.min(num1,num2));
    System.out.println("max: "+Float.max(num1, num2));
    System.out.println("sum: "+Float.sum(num1, num2));
    
    }
    


}