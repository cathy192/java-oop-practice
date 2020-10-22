package domain;

import java.util.ArrayList;

public class Rule {

    //카드의 합을 위해 숫자로 변환하는 메서드
    static int makeNum(Card card){
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
    //카드값의 합을 나타내는 함수
    public int sumOfCard(ArrayList<Card> cardList){
        int sum=0;
        for(int i=0;i<cardList.size();i++){
            sum+=makeNum(cardList.get(i));
        }
        return sum;
    }


}
