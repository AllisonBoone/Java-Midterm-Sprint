package library.patrons;

// Created the Employee class.
public class Employee extends Patron{
    private String employeeId;
    private String department;

    // Created the constructor.
    public Employee(String name, String address, String phoneNumber, String employeeId, String department){
        super(name, address, phoneNumber);
        this.employeeId = employeeId;
        this.department = department;
    }

    // Created abstract method for patron type.
    public String getPatronType(){
        return "Employee";
    }

    // Created getter and setter methods.
    public String getEmployeeId(){
        return employeeId;
    }

    public void setEmployeeId(String employeeId){
        this.employeeId = employeeId;
    }

    public String getDepartment(){
        return department;
    }

    public void setDepartment(String department){
        this.department = department;
    }

    // Created toSting method.
    public String toString() {
        return "Employee{" +
                "name='" + getName() + '\'' +
                ", address='" + getAddress() + '\'' +
                ", phoneNumber='" + getPhoneNumber() + '\'' +
                ", employeeId='" + employeeId + '\'' +
                ", department='" + department + '\'' +
                ", borrowedItems=" + getBorrowedItems() +
                '}';
    }
}
