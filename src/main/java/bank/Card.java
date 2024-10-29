package bank;

public class Card {
    private final int CARD_NUMBER;
    private int pinCode;

    public Card(int CARD_NUMBER, int pinCode) {
        this.pinCode = pinCode;
        this.CARD_NUMBER = CARD_NUMBER;
    }

    public int getCARD_NUMBER() {
        return CARD_NUMBER;
    }

    public int getPinCode() {
        return pinCode;
    }

    public void setPinCode(int pinCode) {
        this.pinCode = pinCode;
    }
}
