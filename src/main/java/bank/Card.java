package bank;

public class Card {
    private final int CARD_NUMBER;
    private String pinCode;

    public Card(int CARD_NUMBER) {
        this.pinCode = generatePinCode();
        this.CARD_NUMBER = CARD_NUMBER;
    }

    public int getCARD_NUMBER() {
        return CARD_NUMBER;
    }

    public String getPinCode() {
        return pinCode;
    }

    public void setPinCode(String pinCode) {
        this.pinCode = pinCode;
    }


    private String generatePinCode() {
        var pinCodeVal = 0;
        var generatedPin = "";

        for(int i=0; i < 4; i++) {
            pinCodeVal = (int) (Math.random() * 10);
            generatedPin += pinCodeVal;
        }
        return generatedPin;
    }
}
