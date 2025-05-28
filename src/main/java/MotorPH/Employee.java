package MotorPH;
import java.util.*;

public class Employee {
    private int employeeNumber;
    private String firstName, lastName, birthday, address, phoneNo, position, status;

    //Constructor 
    public Employee(int employeeNumber, String firstName, String lastName, String birthday,
                    String address, String phoneNo, String position, String status) {
        this.employeeNumber = employeeNumber;
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthday = birthday;
        this.address = address;
        this.phoneNo = phoneNo;
        this.position = position;
        this.status = status;
    }

    // Getters
    public int getEmployeeNumber() { 
        return employeeNumber;
    }
    public String getFirstName() {
        return firstName; 
    }
    public String getLastName() { 
        return lastName; 
    }
    public String getBirthday() { 
        return birthday; 
    }
    public String getAddress() { 
        return address; 
    }
    public String getPhoneNo() { 
        return phoneNo; 
    }
    public String getPosition() { 
        return position; 
    }
    public String getStatus() { 
        return status; 
    }
    
    //Setters
    public void setEmployeeNumber(int employeeNumber) { 
        this.employeeNumber = employeeNumber; 
    }
    public void setFirstName(String firstName) { 
        this.firstName = firstName; 
    }
    public void setLastName(String lastName) { 
        this.lastName = lastName; 
    }
    public void setBirthday(String birthday) { 
        this.birthday = birthday; 
    }
    public void setAddress(String address) { 
        this.address = address; 
    }
    public void setPhoneNo(String phoneNo) { 
        this.phoneNo = phoneNo; 
    }
    public void setPosition(String position) { 
        this.position = position; 
    }
    public void setStatus(String status) { 
        this.status = status; 
    }

    public void displayEmployeeInfo() {
        //Prints employee number, name, and birthday.
    }
}

