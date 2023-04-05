public class Q27 {
    public static void main(String[] args) {
        System.out.println("size: "+Double.SIZE);
        System.out.println("bytes: "+Double.BYTES);
        System.out.println("max value: "+Double.MAX_VALUE);
        System.out.println("min value: "+Double.MIN_VALUE);

        double value=34.33;
        String str=String.valueOf(value);
        Double d1=Double.valueOf(value);
        Double d2=Double.valueOf(str);

        String hex=Double.toHexString(value);
        String binary=Long.toBinaryString(Double.doubleToLongBits(value));
        String octal= Long.toOctalString(Double.doubleToLongBits(value));

        System.out.println("Binary: "+binary);
        System.out.println("Octal:"+octal);
        System.out.println("Hexadecimal: "+hex);

        Double value2=new Double(45.12);
        byte b=value2.byteValue();
        short s=value2.shortValue();
        int i=value2.intValue();
        long l=value2.longValue();
        float f=value2.floatValue();
        double d=value2.doubleValue();

        double num1=534.2;
        double num2=432.5;
        System.out.println("min: "+Double.min(num1, num2));
        System.out.println("max: "+Double.max(num1, num2));
        System.out.println("sum: "+Double.sum(num1, num2));
        
    }
}
