package domain;

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
        return gamerCard;
    }
}
