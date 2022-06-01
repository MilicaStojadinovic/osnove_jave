package d31_05_2022.Task2;

public class Person {
    protected String fullName;

    protected String yearOfBirth;

    public Person() {
    }

    public Person(String fullName,
                  String yearOfBirth) {
        this.fullName = fullName;
        this.yearOfBirth = yearOfBirth;
    }

    public String getFullName() {
        return fullName;
    }

    public String getYearOfBirth() {
        return yearOfBirth;
    }
    public void print (){
        System.out.println("Full name: " + fullName + " - Year of birth: " + yearOfBirth);

    }
}
