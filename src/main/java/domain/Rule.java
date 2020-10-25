package domain;

import java.util.ArrayList;
import java.util.List;

public class Rule {

    private static final int A_NUMBER=1;
    private static final int J_NUMBER=11;
    private static final int Q_NUMBER=12;
    private static final int K_NUMBER=13;

    //카드의 합을 위해 숫자로 변환하는 메서드
    static private int makeNum(Card card){
        String value=card.getValue();
        int num=0;
        if(value=="A")
            num=A_NUMBER;
        else if(value=="J")
            num=J_NUMBER;
        else if(value=="Q")
            num=Q_NUMBER;
        else if(value=="K")
            num=K_NUMBER;
        else num=Integer.parseInt(value);
        return num;
    }
    //카드값의 합을 나타내는 함수
    public static int sumOfCard(List<Card> cardList){
        int sum=0;
        for(int i=0;i<cardList.size();i++){
            sum+=makeNum(cardList.get(i));
        }
        return sum;
    }
    //21을 넘으면 -1로
    private int overSum(int sum){
        if(sum>21){
            return -1;
        }
        else return sum;
    }
    //승자를 알려주는 메서드
    public void winner(Dealer dealer, Gamer gamer){
        int dealerSum, gamerSum;
        dealerSum=sumOfCard(dealer.openCard());
        gamerSum=sumOfCard(gamer.openCard());
        if(dealerSum>gamerSum)
            System.out.println("Winner is dealer");
        else if(dealerSum<gamerSum)
            System.out.println("Winner is Gamer");

        else if(dealerSum==gamerSum)
            System.out.println("Draw");

    }

}
