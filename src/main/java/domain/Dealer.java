package domain;

import java.util.ArrayList;

import static domain.CardDeck.pickCard;

public class Dealer {

    public Dealer(ArrayList<Card> dealerCard) {
        this.dealerCard = dealerCard;
    }

    ArrayList<Card> dealerCard=new ArrayList<>();//딜러의 카드 리스트

    int makeNum(Card card){//딜러의 카드의 합을 위해 숫자로 변환하는 메서드
        String value=card.getValue();
        int num=0;
        if(value=="A")
            num=0;
        else if(value=="J")
            num=11;
        else if(value=="Q")
            num=12;
        else if(value=="K")
            num=13;
        else num=Integer.parseInt(value);
        return num;
    }
    public int sumOfCard(ArrayList<Card> cardList){//카드값의 합을 나타내는 함수
        int sum=0;
        for(int i=0;i<cardList.size();i++){
            sum+=makeNum(cardList.get(i));
        }
        return sum;
    }
    //카드를 뽑을지 아닐지 결정하는 메서드
    ArrayList<Card>  PickOrNot(int sum,ArrayList<Card> cardList){

        Card newCard;
        if(sum <=16){
            newCard=pickCard(cardList);
            dealerCard.add(newCard);
        }
        return dealerCard;
    }

    //딜러의 카드를 오픈하는 함수수
    void openard(){
        for(int i=0;i<dealerCard.size();i++){
            System.out.println(dealerCard.get(i)+ " ");
        }
        System.out.println(sumOfCard(dealerCard));

    }

}
