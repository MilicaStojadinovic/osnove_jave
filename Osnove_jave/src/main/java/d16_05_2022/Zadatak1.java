package d16_05_2022;

import java.util.Scanner;

public class Zadatak1 {
    //1.Napisati metodu stampajVrednostZa10Vecu u kojoj se stampa prosledjena vrednost za 10 veca.
// Iz main-a pozvati izvrsenje metode za razlicite vrednosti.
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Unesite N: ");
        int n = s.nextInt();
        stampajVrednostZa10Vecu(n);
    }

    static void stampajVrednostZa10Vecu(int n) {
        n = n * 10;
        System.out.println("Prosledjena vrednost uvecana 10 puta je: " + n);
    }
}

