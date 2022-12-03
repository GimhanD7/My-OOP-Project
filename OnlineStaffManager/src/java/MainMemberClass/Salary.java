package MainMemberClass;





/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author GIMHANA
 */
public class Salary {
    private int Did;
    private String Dname;
    private String Dsalary;

    public int getDid() {
        return Did;
    }

    public void setDid(int Did) {
        this.Did = Did;
    }

    public String getDname() {
        return Dname;
    }

    public void setDname(String Dname) {
        this.Dname = Dname;
    }

    public String getDsalary() {
        return Dsalary;
    }

    public void setDsalary(String Dsalary) {
        this.Dsalary = Dsalary;
    }

    public Salary(int Did, String Dname, String Dsalary) {
        this.Did = Did;
        this.Dname = Dname;
        this.Dsalary = Dsalary;
    }

    public Salary(String Dname, String Dsalary) {
        this.Dname = Dname;
        this.Dsalary = Dsalary;
    }
    
    
    
}
