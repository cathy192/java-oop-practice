package domain;

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
               // System.out.println(card.getShape()+card.getValue());
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
    public static Card pickCard(ArrayList<Card> cardList){
        int index= cardList.size();
        int valueIndex=(int)(Math.random()*index+1);

        return cardList.get(valueIndex);
    }


    //뽑은 카드 제거해주는 메서드
    public static ArrayList<Card> removeCard(ArrayList<Card> cards,Card pick){

       // Card pick = pickCard(cards);
        System.out.println(pick.getValue()+ pick.getShape());
        for(int i=0;i< cards.size();i++){
            if(pick.getShape()== cards.get(i).getShape() && pick.getValue()== cards.get(i).getValue())
                cards.remove(i);
            else continue;
        }
        System.out.println(cards.contains(pick));
        return cards;

    }


}
