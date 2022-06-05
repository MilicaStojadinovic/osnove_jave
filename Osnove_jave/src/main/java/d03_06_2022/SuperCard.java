package d03_06_2022;

public class SuperCard {
    private int cardNumber;
    private String ownerFullName;
    private double discount;

    public SuperCard() {
    }

    public SuperCard(int cardNumber,
                     String ownerFullName,
                     double discount) {
        this.cardNumber = cardNumber;
        this.ownerFullName = ownerFullName;
        this.discount = discount;
    }

    public int getCardNumber() {
        return cardNumber;
    }

    public String getOwnerFullName() {
        return ownerFullName;
    }

    public double getDiscount() {
        return discount;
    }
    public void print(){
        System.out.println("Card number: " + cardNumber + ", Owner full name: " + ownerFullName);
    }
}
