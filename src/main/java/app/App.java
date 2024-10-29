package app;

import bank.Card;

public class App {
    public static void main(String[] args) {
        Card card = new Card(1);

        System.out.println(card.getPinCode());
    }
}
