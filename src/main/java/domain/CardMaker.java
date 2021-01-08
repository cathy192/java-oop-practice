package domain;

import java.util.List;


public class CardMaker {
   /* public static CardType[] types={
            CardType.HEART,CardType.SPADE,CardType.CLOVER,CardType.DIAMOND
    };

    Cards cards;

    public CardMaker(Cards cards) {
        this.cards = cards;
        makeDeck(types);
    }

    public void makeDeck(CardType types[] ){

        for(int i=0;i< types.length;i++){
            initializeCards(types[i]);
        };
    }

    public void initializeCards(CardType type){

        String value;
        Card card;
        for (int j = 1; j < 14; j++) {
            value = makeValue(j);
            card = new Card(value, type);
            cards.toList().add(card);

        }
    }

    public String makeValue(Integer j){
        String value;
        if(j==A_NUMBER.value)
            value="A";
        else if(j==J_NUMBER.value)
            value="J";
        else if(j==Q_NUMBER.value)
            value="Q";
        else if(j==K_NUMBER.value)
            value="K";
        else value=Integer.toString(j);

        return value;
    }

*/
}
