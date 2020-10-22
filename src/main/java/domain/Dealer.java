package domain;

import java.util.ArrayList;
import java.util.List;

import static domain.CardDeck.pickCard;


public class Dealer implements Player {


    public Dealer(ArrayList<Card> dealerCard) {
        this.dealerCard = dealerCard;
    }

    List<Card> dealerCard=new ArrayList<>();//딜러의 카드 리스트


    //카드를 뽑을지 아닐지 결정하는 메서드
    List<Card>  PickOrNot(int sum,ArrayList<Card> cardList){
        Card newCard;
        if(sum <=16){
            newCard=pickCard(cardList);
            addCard(newCard);
        }
        return dealerCard;
    }
    //딜러의 카드리스트에 새로운 카드를 더하는 메서드
    void addCard(Card card){
        dealerCard.add(card);
    }


    @Override
    public List<Card> openCard() {

        return this.dealerCard;
    }

}
