package domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.ArrayList;

import static domain.CardDeck.initializeCards;
import static domain.CardDeck.makeValue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;

public class CardDeckTest {


    @Test
    @DisplayName("초기화 테스트")
    public void initializedTest(){

       ArrayList<Card> cards= new ArrayList<>();
       CardDeck cardDeck = new CardDeck();
        boolean check=false;
        Card card=null;
        CardType cardType=null;
        CardType[] types = CardType.values();
        for(int i=0;i<types.length;i++){
            cardType=types[i];
            for(int j=0;j<14;j++){
                System.out.println(j);
                card=new Card(makeValue(j),cardType);
                cardDeck.addCards(card);
                cards.add(card);
                System.out.println(card.getShape()+" "+card.getValue());
                check=cardDeck.getCards().contains(card);
                assertSame(check,true);

            }
        }








    }

    @Test
    @DisplayName("랜덤 카드 뽑기 테스트")
    public  void pickTest(){

    }

}
