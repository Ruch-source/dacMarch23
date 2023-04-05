class Q1718 {
    public static void main(String[] args) {
        Integer value =new Integer(3);
        byte b=value.byteValue();
        short s=value.shortValue();
        int i=value.intValue();
        long l=value.longValue();
        float f=value.floatValue();
        double d=value.doubleValue();

        int x=12;
        int y=23;
        System.out.println("max: "+Integer.max(x, y));
        System.out.println("min: "+Integer.min(x, y));
        System.out.println("Sum: "+Integer.sum(x, y));

    }    
}
