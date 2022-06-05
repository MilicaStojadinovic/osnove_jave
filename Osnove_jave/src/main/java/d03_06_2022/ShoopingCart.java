package d03_06_2022;

import java.util.ArrayList;

public class ShoopingCart {
    private ArrayList<Packaging> packagings = new ArrayList<>();

    public void addPackaging(Packaging packaging) {
        this.packagings.add(packaging);
    }

    public void removePackaging(String barCode) {
        for (int i = 0; i < packagings.size(); i++) {
            if (packagings.get(i).barCode.equals(barCode)) {
                this.packagings.remove(i);
            }
        }
    }

    private double fullPackagingDiscountPrice(double discount) {
        int sumPrice = 0;
        for (int i = 0; i < packagings.size(); i++) {
            sumPrice += packagings.get(i).articlePrice();
        }
        return sumPrice - discount;
    }

    public double fullShoopingCardPrice(SuperCard superCard) {

        return fullPackagingDiscountPrice(superCard.getDiscount());

    }

    public void print() {
        for (int i = 0; i <packagings.size() ; i++) {
            packagings.get(i).print();
        }
    }
}
