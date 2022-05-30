package d24_05_2022.Zadatak1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<ZeleniKarton>niz= new ArrayList<ZeleniKarton>();
        ZeleniKarton zk1 = new ZeleniKarton("Milica Stojadinovic",1550,
                "Matematika 1","Ljiljana Jovic",7);
        niz.add(zk1);
        ZeleniKarton zk2 = new ZeleniKarton("Milica Stojadinovic",1550,
                "Matematika 2","Ljiljana Jovic",8);
        niz.add(zk2);
        ZeleniKarton zk3 = new ZeleniKarton("Milica Stojadinovic",1550,
                "Matematika 3","Ljiljana Jovic",5);
        niz.add(zk3);
        ZeleniKarton zk4 = new ZeleniKarton("Milica Stojadinovic",1550,
                "Mehanika 1","Goran Janevski",7);
        niz.add(zk4);
        ZeleniKarton zk5 = new ZeleniKarton("Milica Stojadinovic",1550,
                "Mehanika fluida","Goran Petrovic",5);
        niz.add(zk5);
        ZeleniKarton zk6 = new ZeleniKarton("Milica Stojadinovic",1550,
                "Mehanika Kinematika","Goran Janevski",10);
        niz.add(zk6);
        ZeleniKarton zk7 = new ZeleniKarton("Milica Stojadinovic",1550,
                "Mehanika Dinamika","Dragan Jovicic",9);
        niz.add(zk7);
        ZeleniKarton zk8 = new ZeleniKarton("Milica Stojadinovic",1550,
                "Numericka matematika","Ljiljana Zivic",6);
        niz.add(zk8);
        ZeleniKarton zk9 = new ZeleniKarton("Milica Stojadinovic",1550,
                "Elektrotehnika","Aca Petrovic",5);
        niz.add(zk9);
        ZeleniKarton zk10 = new ZeleniKarton("Milica Stojadinovic",1550,
                "Fizika","Svetlana Kostic",9);
        niz.add(zk10);


        for (int i = 0; i < niz.size() ; i++) {
            niz.get(i).print();
            if(niz.get(i).ispit()){
                System.out.println("Student je polozio ispit." );
            }else {
                System.out.println("Student nije polozio ispit.");
            }
        }
        double ps = 0;
        for (int i = 0; i < niz.size() ; i++) {
            ps = ps + niz.get(i).getOcena();
        }
        System.out.println("Prosecna ocena svih ispita je: " + ps/ niz.size());
        int brojac=0;
        int po = 0;
        for (int i = 0; i < niz.size() ; i++) {
            if (niz.get(i).ispit()){
                po = po + niz.get(i).getOcena();
                brojac ++;
            }
        }
        System.out.println("Prosecna ocena polozenih ispita je: " + po/brojac);
    }
}
