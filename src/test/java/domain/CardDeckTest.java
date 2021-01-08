package domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static domain.CardDeck.*;
import static domain.CardType.HEART;
import static org.junit.Assert.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;

public class CardDeckTest {


    @Test
    @DisplayName("초기화 테스트")
    public void initializedTest() {

        List<Card> cardList= new ArrayList<>();
        Cards cards = new Cards(cardList);
        CardDeck cardDeck = new CardDeck(cards); // 체크할 카드 묶음
        for( Card c : cardDeck.getCards().toList()){
            if(c.equals(new Card("A",HEART))){
                System.out.println("찾음");
                break;
            }
        }

        for(int i=0;i<52;i++) {
            System.out.println("cardDeck[ " + (i+1) + "] :" + cardDeck.getCards().toList().get(i).getValue()+", shape:"+cardDeck.getCards().toList().get(i).getShape());

        }
        boolean check = false; //일치하는지 확인하기 위한 변수
        CardType[] types = CardType.values(); //카드의 모양의 리스트가 들어있는 변수

        for (int i = 0; i < types.length; i++) {
            CardType cardType = types[i];
            for (int j = 0; j < 14; j++) {
                Card card = new Card(String.valueOf(j+1), cardType); //각 카드의 객체를 만듬

              //  System.out.println("card value: " + card.getValue()+",card shape : "+card.getShape());
               // check = cardDeck.getCards().toList().contain(card); //제대로 값이 들어가져있는지 테스트
                //System.out.println("check["+j+"]: " +check);
               // assertEquals(check, true);
            }
        }
        System.out.println(" check= " + cardDeck.getCards().toList().contains(new Card(String.valueOf(2),HEART)));
    }


    @Test
    @DisplayName("랜덤 카드 뽑기 테스트")
    public  void pickTest(){
        List<Card> cardList= new ArrayList<>();
        Cards cards =new Cards(cardList);

        CardDeck deck = new CardDeck(cards);
        Card card = deck.pickCard(); //랜덤으로 카드 뽑음
        System.out.println(card.getValue());
        assertEquals(deck.getCards().toList().contains(card), true);//카드덱에 있는지 확이
    }


    @Test
    @DisplayName("뽑은 카드 제거 테스트")
    public void removedTest(){
        List<Card> cardList= new ArrayList<>(); //카드 뽑은 뒤 카드덱
        Cards cards = new Cards(cardList);
        CardDeck deck = new CardDeck(cards);

        Card pick = deck.pickCard(); //뽑은 카드
        System.out.println("pick:"+pick.getValue());
        assertEquals( deck.getCards().toList().contains(pick),false );
        deck.removeCard();//카드 뽑은뒤 카드덱
        assertEquals(false, cards.toList().contains(pick));
    }



}
