package d18_05_2022;

public class SmartAirConditioningMain1 {
    public static void main(String[] args) {
        SmartAirConditioning1 sac1 = new SmartAirConditioning1();
        sac1.marka = "Samsung";
        sac1.temperatura = "16 - 35";
        sac1.mod = "hladi/greje";

        SmartAirConditioning1 sac2 = new SmartAirConditioning1();
        sac2.marka = "Gree";
        sac2.temperatura = "16 - 35";
        sac2.mod = "hladi/greje";

        System.out.println("Smart Air Conditioning marke: " + sac1.marka );
        System.out.print( "Opseg temperature" + " [ " + sac1.temperatura + " ]");
        System.out.println("- Mod [ " +sac1.mod + " ]");

        System.out.println();

        System.out.println("Smart Air Conditioning marke: " + sac2.marka );
        System.out.print( "Opseg temperature" + " [ " + sac2.temperatura + " ]");
        System.out.println("- Mod [ " +sac2.mod + " ]");





    }
}
