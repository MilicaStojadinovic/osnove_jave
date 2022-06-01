package d31_05_2022.Task2;

public class Main {
    public static void main(String[] args) {
        Card yellow = new Card("yellow");
        Card red = new Card("red");
        Player goalkeeper = new Player("David de Gea", "07/11/1990", 1, "goalkeeper", false);
        Player defender = new Player("Diogo Dalot", "18/03/1999", 20, "defender", false);
        goalkeeper.addCard(yellow);
        goalkeeper.addCard(yellow);
        goalkeeper.addCard(red);
        defender.addCard(red);
        goalkeeper.print();
        System.out.println();
        defender.print();




    }
}
