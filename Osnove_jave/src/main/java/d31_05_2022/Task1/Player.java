package d31_05_2022.Task1;

public class Player extends Person{
    private int playerNumber;
    private String playerPosition;
    private boolean captain;

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
    @Override
    public void print(){
        super.print();
        System.out.println("Player number: " + playerNumber + " - The position he/she plays: " + playerPosition);
        if (isCaptain()){
            System.out.println("The player is the team captain.");
        }else {
            System.out.println("The player is not the team captain.");
        }
    }
}
