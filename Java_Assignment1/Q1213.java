class Q1213 {
    public static void main(String[] args) {
        System.out.println(Short.SIZE);
        System.out.println(Short.BYTES);
        System.out.println(Short.SIZE);
        System.out.println(Short.SIZE);
        short value=34;
        String str=String.valueOf(value);
        Short s1= Short.valueOf(value);
        Short s2=Short.valueOf(str);
        System.out.println(str);
        System.out.println(s1);
        System.out.println(s2);
    }
}
