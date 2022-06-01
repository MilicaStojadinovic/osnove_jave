package d30_05_2022.Task2;

public class Main {
    public static void main(String[] args) {
        Combination combination1 = new Combination("902764",1,3,5,14,15,31,23);
        Combination combination2 = new Combination("902565",6,3,5,14,15,31,23);
        Combination combination3 = new Combination("902566",7,3,5,14,15,31,23);
        Combination combination4 = new Combination("902767",1,3,5,14,15,31,23);
        Combination winCombination = new Combination("902764",1,3,5,14,15,31,23);
        Sheet sheet1 = new Sheet();
        sheet1.addCombination(combination1);
        sheet1.addCombination(combination2);
        sheet1.addCombination(combination3);
        sheet1.addCombination(combination4);

        if (sheet1.winCombination(winCombination)){
            System.out.println("Winning combination.");
        }else{
            System.out.println("Losing combination.");
        }
        sheet1.print();
    }
}
