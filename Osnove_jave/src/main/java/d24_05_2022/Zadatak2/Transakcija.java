package d24_05_2022.Zadatak2;

public class Transakcija {
    private int idTransakcije;
    private Racun kojiSaljeTransakciju;
    private Racun kojiPrimaTransakciju;

    public Transakcija() {

    }

    public Transakcija(Racun kojiSaljeTransakciju, Racun kojiPrimaTransakciju) {
        this.kojiSaljeTransakciju = kojiSaljeTransakciju;
        this.kojiPrimaTransakciju = kojiPrimaTransakciju;
    }

    public int getIdTransakcije() {
        return idTransakcije;
    }

    public void setIdTransakcije(int idTransakcije) {
        this.idTransakcije = idTransakcije;
    }

    public Racun getKojiSaljeTransakciju() {
        return kojiSaljeTransakciju;
    }

    public void setKojiSaljeTransakciju(Racun kojiSaljeTransakciju) {
        this.kojiSaljeTransakciju = kojiSaljeTransakciju;
    }

    public Racun getKojiPrimaTransakciju() {
        return kojiPrimaTransakciju;
    }

    public void setKojiPrimaTransakciju(Racun kojiPrimaTransakciju) {
        this.kojiPrimaTransakciju = kojiPrimaTransakciju;
    }
    private double provizija (double visinaTransakcije){
        if(visinaTransakcije<4500){
            return 45;
        } else if (visinaTransakcije>4500) {
            return 0.1;
        }else {
            return 0;
        }
    }
    public void prenos (int visinaTransakcije){
        if (kojiSaljeTransakciju.getStanje()>0){
            kojiSaljeTransakciju.stanjeNaracunu(-visinaTransakcije-provizija(visinaTransakcije));
        }
        kojiPrimaTransakciju.stanjeNaracunu(+visinaTransakcije);;
    }
}
