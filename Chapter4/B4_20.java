public class B4_20 {
    public static void main(String[] args) {
        String s1 = "Welcome";
        String s2 = "welcome";
        Boolean isEqual1 = s1.equals(s2);
        Boolean isEqual2 = s1.equalsIgnoreCase(s2);
        int x1 = s1.compareTo(s2);
        int x2 = s1.compareToIgnoreCase(s2);
        Boolean b1 = s1.startsWith("AAA");
        Boolean b2 = s1.endsWith("AAA");
        int x3 = s1.length();
        char x4 = s1.charAt(0);
        String s3 = s1.concat(s2);
        String s4 = s1.substring(1);
        String s5 = s1.substring(1,4);
        String s6 = s1.toLowerCase();
        String s7 = s1.toUpperCase();
        String s8 = s1.trim();
        int x5 = s1.indexOf('e');
        int x6 = s1.lastIndexOf("abc");
    }
}
