package d30_05_2022.Task2;

import java.util.ArrayList;

public class Combination {
    private String idCombination;
    private ArrayList<Integer> numbers = new ArrayList<>();

    public Combination(String IDCombination, int one, int two,
                       int tree, int four, int five, int six, int seven) {
        this.idCombination = IDCombination;
        numbers.add(one);
        numbers.add(two);
        numbers.add(tree);
        numbers.add(four);
        numbers.add(five);
        numbers.add(six);
        numbers.add(seven);
    }

    public String getIdCombination() {
        return idCombination;
    }

    public ArrayList<Integer> getNumbers() {
        return numbers;
    }
    public void print (){
        System.out.println("ID: " + idCombination);
        System.out.println("Numbers: " + numbers);
    }
    public boolean sameCombinations (Combination combination){
        int counter = 0;
        for (int i = 0; i <numbers.size() ; i++) {
            if(this.numbers.get(i) == combination.numbers.get(i)){
                counter++;
            }
        }
        if (counter == 7){
            return true;
        }else {
            return false;
        }

    }
}
