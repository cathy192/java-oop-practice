package domain;

public enum  CardType {

    HEART("하트","♡"),
    SPADE("스페이드","♤"),
    DIAMOND("다이아몬드","◇"),
    CLOVER("클로버","♧");

    String shape;
    String name;

     CardType(String shape, String name) {
        this.shape = shape;
        this.name = name;
    }

}
