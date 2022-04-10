public class DeckOfCards {
    public static void main(String[] args) {
        int[] deck = new int[52];
        String[] suits = {"Spades♠", "Hearts♥", "Diamonds♦", "Clubs♣"};
        String[] ranks = {"Ace","2","3","4","5","6","7","8","9","10","Jack","Queen","King"};

        //Initialize the cards
        for(int i=0;i<deck.length;i++){
            deck[i] = i;
        }

        //Shuffle the Cards
        int index, temp;
        for(int i=0;i<deck.length;i++){
            //Generate the index randomly
            index = (int)(Math.random()*deck.length);
            temp = deck[i];
            deck[i] = deck[index];
            deck[index] = temp;
        }

        //Display the first 4 cards
        String suit, rank;
        for(int i=0;i<4;i++){
            suit = suits[deck[i]/13];
            rank = ranks[deck[i]%13];
            System.out.println("Card number " + deck[i] + ": " + rank + " of " + suit);
        }
    }
}
