class Q19 {
 public static void main(String[] args) {
    
    System.out.println("size: "+Long.SIZE);
    System.out.println("bytes: "+Long.BYTES);
    System.out.println("max value: "+Long.MAX_VALUE);
    System.out.println("min value: "+Long.MIN_VALUE);

    long value=376783;
    String str=String.valueOf(value);
    Long l1=Long.valueOf(value);
    Long l2=Long.valueOf(str);

    String binary=Long.toBinaryString(value);
    String octal=Long.toOctalString(value);
    String hex=Long.toHexString(value);

    System.out.println("binary: "+binary);
    System.out.println("Octal: "+octal);
    System.out.println("Hexadecimal: "+hex);

    Long value2 =new Long(6527628);
   byte b=value2.byteValue();
   short s=value2.shortValue();
   int i=value2.intValue();
   long l=value2.longValue();
   float f=value2.floatValue();
   double d=value2.doubleValue();

   long num1=373888;
   long num2=6383992;
   System.out.println("max: "+Long.max(num1, num2));
   System.out.println("min: "+Long.min(num1, num2));
   System.out.println("sum: "+Long.sum(num1, num2));   


 }   
}
