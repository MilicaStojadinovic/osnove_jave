package d30_05_2022.Task1;

public class Main {
    public static void main(String[] args) {
        Student student = new Student(1550,"Milica Stojadinovic","Osnovne akademske studije");
        student.addExam(new Exam("Mehanika - Statika",8,"Goran Janevski"));
        student.addExam(new Exam("Matematika 3",5,"Ljiljana Petkovic"));
        student.addExam(new Exam("Elektrotehnika",8,"Aca Stojkovic"));
        student.addExam(new Exam("Fizika",5,"Ljiljana Dragojevic"));
        student.addExam(new Exam("Baze podataka",9,"Dragan Stojkovic"));

        student.print();


    }
}
