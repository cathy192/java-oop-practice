package domain;

import domain.myEception.CardLimitExeption;
import domain.myEception.NoCardException;


public class Dealer implements Player {


    public Dealer(Cards dealerCard) {

        this.dealerCard = dealerCard;
    }

    static Cards dealerCard;//딜러의 카드 리스트





    @Override
    public void addCard(Card card) {
        if(!sizeCheck()){
            dealerCard.addCard(card);
        }
    }

    @Override
    public Cards openCard() {
        if(dealerCard.isEmpty())
            throw new NoCardException("보여줄 카드가 없습니다");
        return dealerCard;
    }
    //딜러의 카드리스트에 새로운 카드를 더하는 메서드
    public boolean sizeCheck(){
        System.out.println(dealerCard.cardSize());
        if(dealerCard.cardSize()>=3){
            throw new CardLimitExeption("더이상 추가할 수 없습니다");
        }
        else return false;
    }

}
