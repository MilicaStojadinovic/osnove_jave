package d16_05_2022;

public class Zadatak3 {
    // 3.Zadatak
//Napisati metodu koja stampa podatke o korisniku u formatu:
    //JMBG: [jmbg]
    //Ime: [ime]
    //Prezime: [prezime]
    //God. rodjenja: [god]
    //Aktivan: [true/false]
//Metoda prima jmbg, ime, prezime, god rodjenja i da li je aktivan kao parametre metode.
    public static void main(String[] args) {
        podaciOKorisniuku("372819130140", "Milica", "Stojadinovic", 27, false);
    }

    static void podaciOKorisniuku(String jmbg, String ime, String prezime, int god, boolean aktivan) {
        System.out.println("JMBG: " + jmbg);
        System.out.println("Ime: " + ime);
        System.out.println("Prezime: " + prezime);
        System.out.println("God. rodjenja: " + god);
        if (aktivan) {
            System.out.println("Aktivan: " + true);
        } else {
            System.out.println("Aktivan: " + false);
        }
    }
}
