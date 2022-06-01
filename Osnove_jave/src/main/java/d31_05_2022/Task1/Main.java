package d31_05_2022.Task1;

public class Main {
    public static void main(String[] args) {

        Player goalkeeper = new Player("David de Gea","07/11/1990",1,"goalkeeper",false);
        Player defender = new Player("Diogo Dalot","18/03/1999",20,"defender",false);
        Player midfielder = new Player("Nemanja Matic","01/08/1988",31,"midfilder",false);
        Player captain = new Player("Harry Maguire","05/03/1993",5,"defender",true);

        Coach coach = new Coach("Erik ten Hag","02/02/1970",15,"football coach");

        goalkeeper.print();
        System.out.println();
        defender.print();
        System.out.println();
        midfielder.print();
        System.out.println();
        captain.print();
        System.out.println();
        coach.print();
    }
}
