public class A4_4_3 {
    public static void main(String[] args) {
        /*String s1 = "s1";
        String s2 = "s2";
        String s3 = s1.concat(s2);
        System.out.println(s3);
        String s4 = s1 + s2;
        System.out.println(s4);*/
        String message = "Welcome " + "to " + "Java";
        String s = "Chapter" + 2;
        String s1 = "Supplement" + 'B';
        message += " and Java is fun";
        System.out.println(message);
        System.out.println(s);
        System.out.println(s1);
        
        int i = 1;
        int j = 2;
        System.out.println("i + j is " + i + j);
        System.out.println("i + j is " + (i+j));
    }
}
