public class A4_4_9 {
    public static void main(String[] args) {
        String msg = "Welcome to Java";
        System.out.println(msg.indexOf('W'));
        System.out.println(msg.indexOf('o'));
        System.out.println(msg.indexOf('o',5));
        System.out.println(msg.indexOf("come"));
        System.out.println(msg.indexOf("Java", 5));
        System.out.println(msg.indexOf("java", 5));
        System.out.println(msg.lastIndexOf('W'));
        System.out.println(msg.lastIndexOf('o'));
        System.out.println(msg.lastIndexOf('o',5));
        System.out.println(msg.lastIndexOf("come"));
        System.out.println(msg.lastIndexOf("Java",5));
        System.out.println(msg.lastIndexOf("Java"));

        String s = "Kim Jones";
        int k = s.indexOf(' ');
        String firstName = s.substring(0, k);
        String lastName = s.substring(k+1);
    }
}
