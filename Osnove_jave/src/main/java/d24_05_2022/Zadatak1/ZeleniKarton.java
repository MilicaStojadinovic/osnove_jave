package d24_05_2022.Zadatak1;

public class ZeleniKarton {
    private String imeIPrezime;
    private int brIndeksa;
    private String nazivPredmeta;
    private String Profesor;
    private int ocena;

    public ZeleniKarton(String imeIPrezime,
                        int brIndeksa,
                        String nazivPredmeta,
                        String profesor,
                        int ocena) {
        this.imeIPrezime = imeIPrezime;
        this.brIndeksa = brIndeksa;
        this.nazivPredmeta = nazivPredmeta;
        Profesor = profesor;
        this.ocena = ocena;
    }

    public String getImeIPrezime() {
        return imeIPrezime;
    }

    public int getBrIndeksa() {
        return brIndeksa;
    }

    public String getNazivPredmeta() {
        return nazivPredmeta;
    }

    public String getProfesor() {
        return Profesor;
    }

    public int getOcena() {
        return ocena;
    }

    public void setOcena(int ocena) {
        this.ocena = ocena;
    }
    public boolean ispit(){
        return this.ocena > 5;
    }

    public void print(){
        System.out.println(this.nazivPredmeta + " - " + this.ocena);
        System.out.println("Student: " + this.imeIPrezime + ", " + this.brIndeksa);
        System.out.println("Profesor: " + this.Profesor);
    }
}
