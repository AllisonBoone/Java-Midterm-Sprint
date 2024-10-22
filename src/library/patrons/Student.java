package library.patrons;

// Created Student class.
public class Student extends Patron{
    private String studentId;
    private String gradeLevel;

    // Created the constructor.
    public Student(String name, String address, String phoneNumber, String studentId, String gradeLevel){
        super(name, address, phoneNumber);
        this.studentId = studentId;
        this.gradeLevel = gradeLevel;
    }

    // Created abstract method for patron type.
    public String getPatronType(){
        return "Student";
    }

    // Created getter and setter methods.
    public String getStudentId(){
        return studentId;
    }

    public void setStudentId(String studentId){
        this.studentId = studentId;
    }

    public String getGradeLevel(){
        return gradeLevel;
    }

    public void setGradeLevel(String gradeLevel){
        this.gradeLevel = gradeLevel;
    }

    // Created toString method.
    public String toString(){
        return "Student{" +
        "name='" + getName() + '\'' +
        ", address='" + getAddress() + '\'' +
        ", phoneNumber='" + getPhoneNumber() + '\'' +
        ", studentId='" + studentId + '\'' +
        ", gradeLevel='" + gradeLevel + '\'' +
        ", borrowedItems=" + getBorrowedItems() +
        '}';
    }
}
