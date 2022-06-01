package d30_05_2022.Task2;

import java.util.ArrayList;

public class Sheet {
    private ArrayList<Combination>combinations=new ArrayList<>();
    public void addCombination(Combination combination) {
        if (combinations.size()<7){
        this.combinations.add(combination);
        }
    }
    public void print (){
        for (int i = 0; i <combinations.size() ; i++) {
          combinations.get(i).print();
        }
    }
    public boolean winCombination (Combination combination){
        int counter = 0;
        for (int i = 0; i < combinations.size() ; i++) {
            if (combinations.get(i).sameCombinations(combination)){
                counter ++;
            }
        }
        if (counter > 0) {
            return true;
        } else {
            return false;
        }
    }

}
