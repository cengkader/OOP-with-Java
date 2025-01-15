package Exercise2;

public class StudentInfo {
    private int id;
    private String name;
    private String surname;
    private int midterm;
    private int finalGrade;

    public StudentInfo(int id, String name, String surname, int midterm, int finalGrade){
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.midterm = midterm;
        this.finalGrade = finalGrade;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getMidterm() {
        return midterm;
    }

    public void setMidterm(int midterm) {
        this.midterm = midterm;
    }

    public int getFinalGrade() {
        return finalGrade;
    }

    public void setFinalGrade(int finalGrade) {
        this.finalGrade = finalGrade;
    }

    public float computeAverage(){
        return (0.4f * this.midterm + 0.6f * this.finalGrade);
    }

}
