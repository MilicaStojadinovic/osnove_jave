package d16_05_2022;

public class Zadatak4 {
    // 4.Metoda prima dva parametra N i karakter za stampu. Metoda stampa N karaktera.
//Ako se za N prosledi 5 i za karakter prosledi npr kosa crta (/) stampa se=>
// / / / / /
    public static void main(String[] args) {
        stampaKaratkera(5, "/");
    }

    static void stampaKaratkera(int n, String karater) {
        for (int i = 0; i < n; i++) {
            System.out.print(karater + " ");
        }
    }
}
