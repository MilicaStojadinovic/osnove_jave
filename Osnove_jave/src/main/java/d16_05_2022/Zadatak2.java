package d16_05_2022;

public class Zadatak2 {
    // 2.Napisati funkciju koja za dva jednocifrena broja koja su ulazni parametri funkcije
// vraca novu vrednost koja se formira kao na primeru:
//ako je prvi broj =2, a drugi =3 vraca novu vrednost 23.
//ako je prvi broj =6, a drugi =2 vraca novu vrednost 62.
    public static void main(String[] args) {

        int c = spojDvaBroja(75, 4);
        System.out.println("Spoj dva uneta broja je: " + c);
    }

    static int spojDvaBroja(int a, int b) {
        return a * 10 + b;
    }
}
