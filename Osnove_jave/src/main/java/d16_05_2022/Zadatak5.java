package d16_05_2022;

public class Zadatak5 {
    // 5.(Za vezbanje )Napisati funkciju koja za pronalazi koliko ima celih brojeve izmedju brojeva M i N.
//
//Primer izvrsenja:
//izbroji(5, 10) ima za rezultat 4. Kako? 5 6 7 8 9 10
//izbroji(-5, 1) ima za rezultlat 5 . Kako? -5 -4 -3 -2 -1 0 1
    public static void main(String[] args) {
        int br = izbroji(-5, 1);
        System.out.println("Izmedu ima " + br + " cela broja.");
    }

    static int izbroji(int m, int n) {
        int brojac = 0;
        for (int i = m + 1; i < n; i++) {
            brojac++;
        }
        return brojac;

    }
}
