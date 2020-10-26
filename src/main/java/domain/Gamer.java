package domain;

import domain.myEception.NoCardException;

import java.util.ArrayList;
import java.util.List;

public class Gamer implements Player{
    List<Card> gamerCard =new ArrayList<>();//플레이어의 카드 리스트

    public Gamer(List<Card> playerCard) {
        this.gamerCard = playerCard;
    }

    @Override
    public void addCard(Card card) {
        gamerCard.add(card);
    }

    @Override
    public List<Card> openCard() {

        if(gamerCard.isEmpty())
            throw new NoCardException("보여줄 카드가 없습니다");
        return this.gamerCard;
    }
}
