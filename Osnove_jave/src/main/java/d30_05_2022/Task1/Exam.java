package d30_05_2022.Task1;

public class Exam {
    private String subjectName;
    private int grade;
    private String professor;

    public Exam() {
    }

    public Exam(String subjectName,
                int grade,
                String professor) {
        this.subjectName = subjectName;
        this.grade = grade;
        this.professor = professor;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public int getGrade() {
        return grade;
    }

    public String getProfessor() {
        return professor;
    }

    public boolean passedExam(){
        if(this.grade >=6 && this.grade <=10){
            return true;
        }else {
            return false;
        }
    }
    public void print(){
        System.out.println(subjectName + " - " + professor + " - " + grade);
    }
}
