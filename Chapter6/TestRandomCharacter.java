public class TestRandomCharacter {
    /**Main Method */
    public static void main(String[] args) {
        final int NUMBER_OF_CHARS = 175;
        final int CHARS_PER_LINE = 25;

        //Print Random characters between 'a' and 'z', 25 chars per line
        char ch;
        for(int i=0;i<NUMBER_OF_CHARS;i++){
            ch = RandomCharacter.getRandomDigitCharacter();
            if((i+1)%CHARS_PER_LINE==0){
                System.out.println(ch);
            } else {
                System.out.print(ch);
            }
        }
    }
}
