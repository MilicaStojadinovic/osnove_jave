package d19_05_2022;

public class ProizvodMain {
    public static void main(String[] args) {
        Proizvod p1 = new Proizvod();

        p1.naziv = "Mleko";
        p1.cena = 159.99;
        p1.tezina = 1500;
        p1.stampa();
        p1.povecajCenu(9);
        System.out.println("Posle povecanja rezultat je: " + p1.cena);
        double popust1 = p1.vratiCenuSaPopustom(30);
        System.out.println("Cena posle obracunatog popusta je: " + popust1 + "RSD");
        int postarina1 = p1.racunajPostarinu();
        System.out.println("Postarina za vas proizvod je: " + postarina1);

        System.out.println();

        Proizvod p2 = new Proizvod();

        p2.naziv = "Pavlaka";
        p2.cena = 229.99;
        p2.tezina = 700;
        p2.stampa();
        p2.povecajCenu(10);
        System.out.println("Posle povecanja rezultat je: " + p2.cena);
        double popust2 = p2.vratiCenuSaPopustom(30);
        System.out.println("Cena posle obracunatog popusta je: " + popust2 + "RSD");
        int postarina2 = p2.racunajPostarinu();
        System.out.println("Postarina za vas proizvod je: " + postarina2);



    }
}
