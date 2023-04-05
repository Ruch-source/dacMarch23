class Bytec {

    public static void main(String[] args) {
        // System.out.println(Byte.SIZE);
        // System.out.println(Byte.BYTES);
        // System.out.println(Byte.MIN_VALUE);
        // System.out.println(Byte.MAX_VALUE);
        byte value=5;
        String str1=Byte.toString(value);
        Byte b1=Byte.valueOf(value);
        Byte b2=Byte.valueOf(str1);
        System.out.println(str1);
        System.out.println(b1);
        System.out.println(b2);

       
    }    
}
