package domain;

import java.util.List;

public class Cards  {
    private List<Card> cards;
    Cards(List<Card> cards){
        this.cards = cards;
    }

    List<Card> addCard(Card card){
        cards.add(card);
        return cards;
    }
    public int cardSize(){
        return cards.size();
    }
    public Card cardGet( int index){
        return cards.get(index);
    }
    public Card removeCard(int index){
        return cards.remove(index);
    }
    public boolean isEmpty(){
       return  cards.isEmpty();
    }


    /*
    public class Cards{
        private List<Card> cards;
        Cards(List <Card> cards){

        }
    }*/
}
