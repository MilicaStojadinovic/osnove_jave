package d24_05_2022.Zadatak2;

public class Main {
    public static void main(String[] args) {
        Racun posiljalac = new Racun(22000);
        posiljalac.setImeIPrezime("Miljana Nikolic");
        posiljalac.setBrRacuna("170-289328923-23");


        Racun primalac = new Racun(15000);
        primalac.setImeIPrezime("Jovana Kostic");
        primalac.setBrRacuna("173-76328923-39");

        Transakcija transakcija = new Transakcija(posiljalac,primalac);
        transakcija.setIdTransakcije(4395);

        transakcija.prenos(2000);
        posiljalac.print();
        System.out.println();
        primalac.print();

    }
}
