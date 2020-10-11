package domain;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class CardDeck {

    public CardDeck() {
        initializeCards(cards);
    }

    static ArrayList<Card> cards= new ArrayList<>();

    public  ArrayList<Card> getCards() {
        return cards;
    }

    public  void setCards(ArrayList<Card> cards) {
        CardDeck.cards = cards;
    }
public void addCards(Card card){
        this.cards.add(card);
}
    static Card card;

    //모든 카드들에 값과 모양을 넣어주는 메서드
    public static ArrayList<Card> initializeCards(ArrayList<Card> cards){
        CardType[] types = CardType.values();
        String value;
        for(int i=0;i<types.length;i++){
            for(int j=0;j<14;j++){
                CardType type=null;
               value= makeValue(j);
               type=types[i];
                card=new Card(value,type);
                cards.add(card);
                System.out.println(card.getShape()+card.getValue());
            }
        }
        return cards;
    }
    //숫자에 따라 카드의 값을 결정해주는 메서드
    static String makeValue(Integer j){
        String value;
        if(j==0)
            value="A";
        else if(j==11)
            value="J";
        else if(j==12)
            value="Q";
        else if(j==13)
            value="K";
        else value=Integer.toString(j);

        return value;
    }
    //카드 하나를 뽑아주는 메서드
    Card pickCard(){
        Card randomCard = null;
        CardType shape=RandomShape();
        String value=RandomValue();
        randomCard.setValue(value);
        randomCard.setShape(shape);

        return randomCard;
    }
    //랜덤으로 뽑아질 카드의 모양을 지정해주는 메서드
    CardType RandomShape(){
        CardType shape = null;
        int shapeIndex=(int)(Math.random()*3);
        if(shapeIndex==0) shape=CardType.HEART;
        else if(shapeIndex==1) shape=CardType.SPADE;
        else if(shapeIndex==2) shape=CardType.DIAMOND;
        else if(shapeIndex==3) shape=CardType.CLOVER;

        return shape;
    }
    //랜덤으로 뽑아질 카드의 값을 지정해주는 메서드
    String RandomValue(){
        String value;
        int valueIndex=(int)(Math.random()*13+1);
        value=makeValue(valueIndex);
        return value;
    }



}
