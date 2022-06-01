package d30_05_2022.Task1;

import java.util.ArrayList;

public class Student {
    private int index;
    private String student;
    private String typeOfStudy;
    private ArrayList<Exam> exams = new ArrayList<>();

    public Student() {
    }

    public Student(int index,
                   String student,
                   String typeOfStudy) {
        this.index = index;
        this.student = student;
        this.typeOfStudy = typeOfStudy;
    }

    public int getIndex() {
        return index;
    }

    public String getStudent() {
        return student;
    }

    public String getTypeOfStudy() {
        return typeOfStudy;
    }

    public ArrayList<Exam> getExams() {
        return exams;
    }
    public void addExam (Exam ispit){
        this.exams.add(ispit);
    }
    public double average(){
        double sum = 0;
        int counter = 0;
        for (int i = 0; i < exams.size() ; i++) {
            if(exams.get(i).getGrade()>=6){
                sum = sum + exams.get(i).getGrade();
                counter ++;
            }
        }
        return sum/counter;
    }
    public void print (){
        System.out.println(this.index + " - " + this.student + " - " + this.typeOfStudy);
        System.out.println("Subjects:");
        for (int i = 0; i < exams.size() ; i++) {
            exams.get(i).print();
        }
        System.out.println("Average grade of passed exams: " + this.average());
        for (int i = 0; i < exams.size() ; i++) {
            if (exams.get(i).passedExam()){
                System.out.println("Exam - " + exams.get(i).getSubjectName() + " passed!");
            }else {
                System.out.println("Exam - " + exams.get(i).getSubjectName() + " failed!");
            }
        }

    }
}
