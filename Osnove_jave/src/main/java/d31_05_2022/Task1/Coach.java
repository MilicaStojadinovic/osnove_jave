package d31_05_2022.Task1;

public class Coach extends Person{
    private int yearOfExperience;
    private String coachJob;

    public Coach(String fullName,

                 String yearOfBirth,
                 int yearOfExperience,
                 String coachJob) {
        super(fullName, yearOfBirth);
        this.yearOfExperience = yearOfExperience;
        this.coachJob = coachJob;
    }

    @Override
    public void print (){
        super.print();
        System.out.println("Years of experience: " + yearOfExperience + " - Type of coaching job is: " + coachJob);
    }

}
