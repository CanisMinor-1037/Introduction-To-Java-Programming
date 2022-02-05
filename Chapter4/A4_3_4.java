public class A4_3_4 {
    public static void main(String[] args) {
        char ch = 'a';
        if(ch>='A'&&ch<='Z'){
            System.out.println(ch + " is an uppercase letter");
        }
        else if(ch>='a'&&ch<='z'){
            System.out.println(ch + " is an lowercase letter");
        }
        else{
            System.out.println(ch + " is a numberic character");
        }
        System.out.println("isDigit('a') is " + Character.isDigit('a'));
        System.out.println("isLetter('a') is " + Character.isLetter('a'));
        System.out.println("isLowerCase('a') is " + Character.isLowerCase('a'));
        System.out.println("isUpperCase('a') is " + Character.isUpperCase('a'));
        System.out.println("toLowerCase('T') is " + Character.toLowerCase('T'));
        System.out.println("toUpperCase('q') is " + Character.toUpperCase('q'));
    }
}
