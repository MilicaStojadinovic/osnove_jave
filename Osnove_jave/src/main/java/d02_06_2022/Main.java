package d02_06_2022;

public class Main {
    public static void main(String[] args) {
        Worker maneger = new Manager("Jovan Ilic");
        Worker storekeeper = new Storekeeper("Ivana Jovic");
        Sector one = new Sector("Managerial secotry",95000);
        Sector two = new Sector("Storekeeper",50000);
        maneger.sectorHire(one);
        storekeeper.sectorHire(two);
        maneger.salary();
        storekeeper.salary();
        System.out.println("Menager salary: " + maneger.salary());
        System.out.println("Storekeeper salary: " + storekeeper.salary());
    }
}
