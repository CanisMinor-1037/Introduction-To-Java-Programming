public class B4_16 {
    public static void main(String[] args) {
        String s1 = "Welcome to Java";
        String s2 = "Programming is fun";
        String s3 = "Welcome to Java";

        System.out.println("s1 == s2 is " + (s1 == s2));
        System.out.println("s2 == s3 is " + (s2 == s3));
        System.out.println("s1.equals(s2) is " + (s1.equals(s2)));
        System.out.println("s1.equals(s3) is " + (s1.equals(s3)));
        System.out.println("s1.compareTo(s2) is " + (s1.compareTo(s2)));
        System.out.println("s1.compareTo(s3) is " + (s1.compareTo(s3)));
        System.out.println("s2.compareTo(s2) is " + (s2.compareTo(s2)));
        System.out.println("s1.charAt(0) is " + (s1.charAt(0)));
        System.out.println("s1.indexOf('j') is " + (s1.indexOf('j')));
        System.out.println("s1.indexOf(\"to\") is " + (s1.indexOf("to")));
        System.out.println("s1.lastIndexOf('a') is " + (s1.lastIndexOf('a')));
        System.out.println("s1.lastIndexOf(\"o\",15) is " + (s1.lastIndexOf("o",15)));
        System.out.println("s1.length() is " + s1.length());
        System.out.println("s1.substring(5) is " + (s1.substring(5)));
        System.out.println("s1.substring(5,11) is " + (s1.substring(5, 11)));
        System.out.println("s1.startsWith(\"Wel\") is " + (s1.startsWith("Wel")));
        System.out.println("s1.endsWith(\"Java\") is " + (s1.endsWith("Java")));
        System.out.println("s1.toLowerCase() is " + (s1.toLowerCase()));
        System.out.println("s1.toUpperCase() is " + (s1.toUpperCase()));
        System.out.println("s1.concat(s2) is " + (s1.concat(s2)));
        System.out.println("s1.contains(s2) is " + (s1.contains(s2)));
        System.out.println("\"\\t Wel \\t\".trim() is " + ("\t Wel \t").trim());   
    }
}
