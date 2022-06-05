package d03_06_2022;

public class Main {
    public static void main(String[] args) {
        ShoopingCart shoopingCart = new ShoopingCart();
        SuperCard superCard = new SuperCard(2345,"Milica Stojadinovic",20);
        shoopingCart.addPackaging(new GlassPackaging("328232-2823", "Beer", 0.7, 0.9, 20, true, 50));
        shoopingCart.addPackaging(new GlassPackaging("328232-2254", "Milk", 1, 1.3, 20, false, 70));
        shoopingCart.addPackaging(new GlassPackaging("328232-6245", "Juice", 1.7, 2, 20, false, 50));
        shoopingCart.addPackaging(new Tetrapack("328232-7256","Milkshake",0.3,0.4,true,30));
        shoopingCart.addPackaging(new Tetrapack("328232-3243","Cream",1,1.1,false,30));
        shoopingCart.addPackaging(new Tetrapack("328232-7245","Tomato",1,1.1,true,30));
        shoopingCart.removePackaging("328232-2254");
        double price = shoopingCart.fullShoopingCardPrice(superCard);
        System.out.println("Full price is: " + price);
        shoopingCart.print();




    }
}
