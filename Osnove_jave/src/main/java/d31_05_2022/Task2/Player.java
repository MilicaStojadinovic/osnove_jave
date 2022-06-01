package d31_05_2022.Task2;

import java.util.ArrayList;

public class Player extends Person {
    private int playerNumber;
    private String playerPosition;
    private boolean captain;

    private ArrayList<Card> cards = new ArrayList<>();

    public Player() {
    }

    public Player(String fullName,
                  String yearOfBirth,
                  int playerNumber,
                  String playerPosition,
                  boolean captain) {
        super(fullName, yearOfBirth);
        this.playerNumber = playerNumber;
        this.playerPosition = playerPosition;
        this.captain = captain;
    }

    public int getPlayerNumber() {
        return playerNumber;
    }

    public String getPlayerPosition() {
        return playerPosition;
    }

    public boolean isCaptain() {
        return captain;
    }
    public void addCard (Card cards){
        this.cards.add(cards);
    }
    public int numYellowCards (){
        int counter = 0;
        for (int i = 0; i < cards.size() ; i++) {
            if(cards.get(i).getCardType().equals("yellow")){
                counter ++;
            }
        }
        return counter;
    }
    public int numRedCards (){
        int counter = 0;
        for (int i = 0; i < cards.size() ; i++) {
            if(cards.get(i).getCardType().equals("red")){
                counter ++;
            }
        }
        return counter;
    }

    @Override
    public void print(){
        super.print();
        System.out.println("Player number: " + playerNumber + " - The position he/she plays: " + playerPosition);
        if (isCaptain()){
            System.out.println("The player is the team captain.");
        }else {
            System.out.println("The player is not the team captain.");
        }
        System.out.println("Number of red cards: " + this.numRedCards());
        System.out.println("Number of yellow cards: " + this.numYellowCards());
    }
}
