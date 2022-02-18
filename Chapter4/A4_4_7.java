public class A4_4_7 {
    public static void main(String[] args) {
        String string1 = "test";
        String string2 = "test";
        if(string1 == string2){
            System.out.println("string1 and string2 are the same object");
        }
        else{
            System.out.println("string1 and string2 are different objects");
        }
        if(string1.equals(string2)){
            System.out.println("string1 and string2 have the same contents");
        }
        else{
            System.out.println("string1 and string2 are not equal");
        }
        String s1 = "Welcome to Java";
        String s2 = "Welcome to Java";
        String s3 = "Welcome to C++";
        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));
        System.out.println(s1.compareTo(s2));
        System.out.println(s1.compareTo(s3));

        String s = "Welcome to Java";
        System.out.println(s.startsWith("We"));
        System.out.println(s.startsWith("we"));
        System.out.println(s.endsWith("va"));
        System.out.println(s.contains("to"));
    }
}
