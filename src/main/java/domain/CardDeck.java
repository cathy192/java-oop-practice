package domain;

import java.util.ArrayList;
import java.util.List;

public class CardDeck {
    private static final int A_NUMBER=1;
    private static final int J_NUMBER=11;
    private static final int Q_NUMBER=12;
    private static final int K_NUMBER=13;
    public CardDeck() {
        makeDeck(types);
    }

    static List<Card> cards= new ArrayList<>();

    public  List<Card> getCards() {
        return cards;
    }


    private static final CardType[] types={
            CardType.HEART,CardType.SPADE,CardType.CLOVER,CardType.DIAMOND
    };
public void addCards(Card card){
        this.cards.add(card);
}
    static Card card;

    //모든 카드들에 값과 모양을 넣어주는 메서드
    public static void initializeCards(CardType type){
       // CardType[] types = CardType.values();
        String value;
            for(int j=1;j<14;j++){
               value= makeValue(j);
                card=new Card(value,type);
                cards.add(card);
               // System.out.println(card.getShape()+card.getValue());
            }
        }

    public void makeDeck(CardType types[] ){
        for(int i=0;i< types.length;i++){
            initializeCards(types[i]);
        }

    }
    //숫자에 따라 카드의 값을 결정해주는 메서드
    static String makeValue(Integer j){
        String value;
        if(j==A_NUMBER)
            value="A";
        else if(j==J_NUMBER)
            value="J";
        else if(j==Q_NUMBER)
            value="Q";
        else if(j==K_NUMBER)
            value="K";
        else value=Integer.toString(j);

        return value;
    }
    //카드 하나를 뽑아주는 메서드
    public static Card pickCard(){
        int index= cards.size()-1;
        int valueIndex=(int)(Math.random()*index+1);
        removeCard(cards.get(valueIndex));
        return cards.get(valueIndex);
    }


    //뽑은 카드 제거해주는 메서드
    public static void removeCard(Card pick){

       // Card pick = pickCard(cards);
        System.out.println(pick.getValue()+ pick.getShape());
        for(int i=0;i< cards.size();i++){
            if(pick.getShape()== cards.get(i).getShape() && pick.getValue()== cards.get(i).getValue())
                cards.remove(i);
            else continue;
        }
        System.out.println(cards.contains(pick));


    }


}
