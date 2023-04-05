public class Q15 {
    public static void main(String[] args) {
        System.out.println("size: "+Integer.SIZE);
        System.out.println("bytes: "+Integer.BYTES);
        System.out.println("max vale: "+Integer.MAX_VALUE);
        System.out.println("min value: "+Integer.MIN_VALUE);

        int value=67;
        String str= String.valueOf(value);
        Integer i1=Integer.valueOf(value);
        Integer i2= Integer.valueOf(str);
        System.out.println(str);
        System.out.println(i1);
        System.out.println(i2);
        
        String binary= Integer.toBinaryString(value);
        String octal= Integer.toOctalString(value);
        String hex= Integer.toHexString(value);
        System.out.println("binary: "+binary);
        System.out.println("octal: "+octal);
        System.out.println("hex: "+hex);

    }
}
