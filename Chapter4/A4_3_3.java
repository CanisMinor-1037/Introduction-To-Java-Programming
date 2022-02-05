public class A4_3_3 {
    public static void main(String[] args) {
        /*char ch1 = (char)0XAB0041;
        System.out.println(ch1);
        char ch2 = (char)65.25;
        System.out.println(ch2);
        int i = (int)'A';
        System.out.println(i);
        byte b1 = 'a';
        byte b2 = (byte)'\uFFF4';
        */
        int i = '2' + '3';
        System.out.println("i is " + i);
        int j = 2 + 'a';
        System.out.println("j is " + j);
        System.out.println(j + " is the Unicode for character "
            +(char)j);
        System.out.println("Chapter " + '2');        
    }
}
