package domain;

import java.util.ArrayList;

public class CardDeck {

    ArrayList<Card> cards= new ArrayList<>();
    Card card;

    ArrayList<Card> initializeCards(ArrayList<Card> cards){
        CardType[] types = CardType.values();
        String value;
        for(int i=0;i<types.length;i++){
            for(int j=0;j<14;j++){
                if(j==0)
                    value="A";
                if(i==11)
                    value="J";
                if(i==12)
                    value="Q";
                if(i==13)
                    value="K";
                else value=Integer.toString(j);

                card.setShape(types[i]);
                card.setValue(value);
                cards.add(card);
            }
        }
        return cards;
    }

}
