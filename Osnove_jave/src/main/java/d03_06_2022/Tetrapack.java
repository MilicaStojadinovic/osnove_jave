package d03_06_2022;

public class Tetrapack extends Packaging {
    private boolean recycling;
    private double basicPrice;


    public Tetrapack(String barCode,
                     String articleName,
                     double netWeight,
                     double grossWeight,
                     boolean recycling,
                     double basicPrice) {
        super(barCode, articleName, netWeight, grossWeight);
        this.recycling = recycling;
        this.basicPrice = basicPrice;
    }

    public boolean isRecycling() {
        return recycling;
    }

    public double getBasicPrice() {
        return basicPrice;
    }

    @Override
    public double articlePrice() {
        if (isRecycling()) {
            return (packageWeight() * 1.5) + basicPrice;
        }else {
            return basicPrice;
        }
    }

    @Override
    public void print() {
        if(isRecycling()){
            System.out.println("Packaging is for recycling, basic price is: " + basicPrice);
        }else {
            System.out.println("Packaging is not for recycling, basic price is: " + basicPrice);
        }
        System.out.println("Total item price is: " + articlePrice());
    }
}
