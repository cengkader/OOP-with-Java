package Exercise2;

public class Main {
    public static void main(String[] args){

        StudentInfo s1 = new StudentInfo(1,"Jack", "Sparrow", 90, 80);
        StudentInfo s2 = new StudentInfo(2,"Harry", "Potter", 70, 80);

        System.out.println("Informations of Students:");
        System.out.println("id \t" + "name \t" + "surname \t" + "midterm \t" + "final \t" + "average \t");
        System.out.println(s1.getId() + " \t" + s1.getName() + " \t" + s1.getSurname() + " \t"+ s1.getMidterm() + " \t" + s1.getFinalGrade() + " \t" +s1.computeAverage());
        System.out.println(s2.getId() + " \t" + s2.getName() + " \t" + s2.getSurname() + " \t"+ s2.getMidterm() + " \t" + s2.getFinalGrade() + " \t" +s2.computeAverage());
    }
}
