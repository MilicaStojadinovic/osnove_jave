package d18_05_2022;

public class ProizvodMain {
    public static void main(String[] args) {
        Proizvod p1 = new Proizvod();

        p1.naziv = "Vino";
        p1.cena = 1499.99;
        p1.tezina =1500;

        Proizvod p2 = new Proizvod();

        p2.naziv = "Viski";
        p2.cena = 2249.99;
        p2.tezina =1700;


        System.out.println(p1.naziv + ", " + p1.cena +" RSD" + ", " + p1.tezina + "g");
        System.out.println(p2.naziv + ", " + p2.cena +" RSD" + ", " + p2.tezina + "g");
    }
}
