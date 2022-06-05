package d02_06_2022;

public class Manager extends Worker {

    public Manager(String fullName) {
        super(fullName);
    }

    @Override
    public double salary() {
        double salary = 0;
        for (int i = 0; i <sectors.size() ; i++) {
            salary += sectors.get(i).getSectorSalary();
        }
       return salary;
    }
}
