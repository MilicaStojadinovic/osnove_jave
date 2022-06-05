package d03_06_2022;

public class GlassPackaging extends Packaging{
    private double deposit;
    private boolean payDeposit;
    private double basicPrice;


    public GlassPackaging(String barCode, String articleName,
                          double netWeight,
                          double grossWeight,
                          double deposit,
                          boolean payDeposit,
                          double basicPrice) {
        super(barCode, articleName, netWeight, grossWeight);
        this.deposit = deposit;
        this.payDeposit = payDeposit;
        this.basicPrice = basicPrice;
    }

    public double getDeposit() {
        return deposit;
    }

    public boolean isPayDeposit() {
        return payDeposit;
    }

    public double getBasicPrice() {
        return basicPrice;
    }

    @Override
    public double articlePrice() {
        if(isPayDeposit()){
            return basicPrice * 1.2 + deposit;
        }else {
            return basicPrice * 1.2;
        }
    }

    @Override
    public void print() {
        if(isPayDeposit()){
            System.out.println("Deposit must be paid, basic price is: " + basicPrice);
        }else {
            System.out.println("No deposit required, basic price is: " + basicPrice);
        }
        System.out.println("Total item price is: " + articlePrice());
    }
}
