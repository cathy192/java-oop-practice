package domain;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class CardDeck {


    private  Cards cards;
    public CardDeck(Cards cards) {
        this.cards=cards;
        cards.makeDeck(types);


    }



    public  Cards getCards() {
        return cards;
    }


    private static final CardType[] types={
            CardType.HEART,CardType.SPADE,CardType.CLOVER,CardType.DIAMOND
    };


    static Card card;



    //카드 하나를 뽑아주는 메서드
    public  Card pickCard(){
        Card pick= cards.toList().get(0);
        removeCard();

        return pick;
    }


    //뽑은 카드 제거해주는 메서드
    public void removeCard(){

        cards.toList().remove(cards.toList().get(0));
        /*
        // Card pick = pickCard(cards);
        System.out.println(pick.getValue()+ pick.getShape());
        for(int i=0;i< cards.toList().size();i++){
            if(pick.getShape()== cards.toList().get(i).getShape() && pick.getValue()== cards.toList().get(i).getValue())
                cards.toList().remove(i);
            else continue;
        }*/
        //System.out.println(cards.contains(pick));


    }
    public void contains(){

    }


}