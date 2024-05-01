public class Main{
    public static void main(String[] args) {

        Student s1=new Student("Nishitha", 23);
        System.out.println(s1.getStudentDetails());
        System.out.println("--------------------------------");

        ResearchStudent rS1= new ResearchStudent("Chunky",18,"AI");
        System.out.println(rS1.getStudentDetails());
        System.out.println("--------------------------------");

        Student s2= new ResearchStudent("Thanush", 21, "IT");
        System.out.println(s2.getStudentDetails());
        System.out.println("--------------------------------");

        PhD phd1= new PhD("Roshini", 30,"BZC","ChemicalTheme");
        System.out.println(phd1.getStudentDetails());
        System.out.println("--------------------------------");

        Student s3= new PhD("Ganesh",29,"CSE","The Man");
        System.out.println(s3.getStudentDetails());
        System.out.println("--------------------------------");

        Student s4= new Student("Bablu",14);
        System.out.println(s4.getStudentDetails());
        System.out.println("--------------------------------");

    }
}
class Student{
    private String studentName;
    private int studentAge;

    public Student(String studentName, int studentAge) {
        this.studentName = studentName;
        this.studentAge = studentAge;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getStudentAge() {
        return studentAge;
    }

    public void setStudentAge(int studentAge) {
        this.studentAge = studentAge;
    }
    public String getStudentDetails(){
        return "Student Name is::" +this.getStudentName()+"\n" + "Student Age is::" +this.getStudentAge();
    }

}
class ResearchStudent extends Student{
    private String researchArea;

    public ResearchStudent(String studentName, int studentAge, String researchArea) {
        super(studentName, studentAge);
        this.researchArea = researchArea;
    }

    public String getResearchArea() {
        return researchArea;
    }

    public void setResearchArea(String researchArea) {
        this.researchArea = researchArea;
    }

    public String getStudentDetails(){
        return super.getStudentDetails()+"\n" + "ResearchArea::"+researchArea;
    }
}

class PhD extends ResearchStudent{
    protected String Thesis;

    public PhD(String studentName, int studentAge, String researchArea, String thesis) {
        super(studentName, studentAge, researchArea);
        Thesis = thesis;
    }

    public String getStudentDetails(){
        return super.getStudentDetails() +"\n" +"Thesis Name::" + this.Thesis;
    }
}