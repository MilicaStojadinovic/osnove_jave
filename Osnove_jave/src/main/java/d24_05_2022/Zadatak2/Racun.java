package d24_05_2022.Zadatak2;

public class Racun {
    private String brRacuna;
    private String imeIPrezime;
    private double stanje;

    public void Racun(double stanje) {
        this.stanje = stanje;
    }

    public String getBrRacuna() {
        return brRacuna;
    }

    public Racun(double stanje) {
        this.stanje = stanje;
    }

    public void setBrRacuna(String brRacuna) {
        this.brRacuna = brRacuna;
    }

    public String getImeIPrezime() {
        return imeIPrezime;
    }

    public void setImeIPrezime(String imeIPrezime) {
        this.imeIPrezime = imeIPrezime;
    }

    public double getStanje() {
        return stanje;
    }

    public void stanjeNaracunu(double prosledjenaVrednost) {
            stanje = stanje + prosledjenaVrednost;

    }

    public void print() {
        System.out.println(this.imeIPrezime + " - " + brRacuna);
        System.out.println("Stanje na racunu je: " + this.stanje + " RSD");
    }
}
