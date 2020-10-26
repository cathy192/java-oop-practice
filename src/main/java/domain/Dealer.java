package domain;

import domain.myEception.CardLimitExeption;
import domain.myEception.NoCardException;
import domain.myEception.OverSumExecption;

import java.util.ArrayList;
import java.util.List;


public class Dealer implements Player {


    public Dealer(ArrayList<Card> dealerCard) {

        this.dealerCard = dealerCard;
    }

    List<Card> dealerCard=new ArrayList<>();//딜러의 카드 리스트


    //카드를 뽑을지 아닐지 결정하는 메서드
    void  PickOrNot(Card card){

        if(Rule.sumOfCard(dealerCard) <=16){
            addCard(card);
        }
        else throw new OverSumExecption("카드합이 17이상입니다.");

    }


    @Override
    public void addCard(Card card) {
        if(!sizeCheck()){
            dealerCard.add(card);
        }
    }

    @Override
    public List<Card> openCard() {
        if(dealerCard.isEmpty())
            throw new NoCardException("보여줄 카드가 없습니다");
        return this.dealerCard;
    }
    //딜러의 카드리스트에 새로운 카드를 더하는 메서드
    public boolean sizeCheck(){
        System.out.println(dealerCard.size());
        if(dealerCard.size()>=3){
            throw new CardLimitExeption("더이상 추가할 수 없습니다");
        }
        else return false;
    }

}
