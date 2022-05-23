package d19_05_2022;

public class SmartAirConditioningMain {
    public static void main(String[] args) {
        SmartAirConditioning sac1 = new SmartAirConditioning();
        sac1.markaKlime = "Samsung";
        sac1.mod = "hladjenje";
        sac1.temperatura = "18";

        sac1.stampa();

        System.out.println("Mesecna potrosnja klime Samsung za izabrani mode je: " + sac1.mesecnaPotrosnjauKW()+ "kW/h");

        System.out.println("Mesecna potrosnja klime je: " +sac1.mesecnaPotrosnja() + " RSD");








    }
}
