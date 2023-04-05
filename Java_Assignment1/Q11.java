class Q11 {
    public static void main(String[] args) {
        
        for(int i=0;i<args[0].length();i++){
            if(Character.isDigit(args[0].charAt(i)))
                System.out.print(Character.getType(args[0].charAt(i)));

            if(Character.isLowerCase(args[0].charAt(i)))
                System.out.print(Character.toUpperCase(args[0].charAt(i)));
            
            if(Character.isUpperCase(args[0].charAt(i)))
                System.out.print(Character.toLowerCase(args[0].charAt(i)));
                
        }
        // if(Character.isDigit(args[0].charAt(0)))
        //         System.out.println(args[0].charAt(0)+" "+0);
    }    
}
