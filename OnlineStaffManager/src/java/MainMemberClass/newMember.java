package MainMemberClass;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author GIMHANA
 */
public class newMember {
    private String Mid;
    private String FirstName;
    private String LastName;
    private String Address;
    private String Age;
    private String PhoneNo;
    private String Email;
    private String Position;
    private String DepartmentID;
    private String UserName;
    private String Password;

    public newMember(String Mid, String FirstName, String LastName, String Address, String Age, String PhoneNo, String Email, String Position, String DepartmentID, String UserName, String Password) {
        this.Mid = Mid;
        this.FirstName = FirstName;
        this.LastName = LastName;
        this.Address = Address;
        this.Age = Age;
        this.PhoneNo = PhoneNo;
        this.Email = Email;
        this.Position = Position;
        this.DepartmentID = DepartmentID;
        this.UserName = UserName;
        this.Password = Password;
    }

    public String getMid() {
        return Mid;
    }

    public String getFirstName() {
        return FirstName;
    }

    public String getLastName() {
        return LastName;
    }

    public String getAddress() {
        return Address;
    }

    public String getAge() {
        return Age;
    }

    public String getPhoneNo() {
        return PhoneNo;
    }

    public String getEmail() {
        return Email;
    }

    public String getPosition() {
        return Position;
    }

    public String getDepartmentID() {
        return DepartmentID;
    }

    public String getUserName() {
        return UserName;
    }

    public String getPassword() {
        return Password;
    }

    public newMember(String FirstName, String LastName, String Address, String Age, String PhoneNo, String Email, String Position, String DepartmentID, String UserName, String Password) {
        this.FirstName = FirstName;
        this.LastName = LastName;
        this.Address = Address;
        this.Age = Age;
        this.PhoneNo = PhoneNo;
        this.Email = Email;
        this.Position = Position;
        this.DepartmentID = DepartmentID;
        this.UserName = UserName;
        this.Password = Password;
    }
    

   
    
    
}
