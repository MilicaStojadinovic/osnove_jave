package d02_06_2022;

public class Storekeeper extends Worker{
    public Storekeeper(String fullName) {
        super(fullName);
    }

    private double avgSectorSalary (){
        double avgSalary = 0;
        for (int i = 0; i <sectors.size() ; i++) {
            avgSalary += sectors.get(i).getSectorSalary();
        }
        return avgSalary/sectors.size() * 0.5;

    }
    @Override
    public double salary() {
        double salary = 0;
        for (int i = 0; i <sectors.size() ; i++) {
            salary = avgSectorSalary() * sectors.size();
        }
        return salary ;
    }
}
