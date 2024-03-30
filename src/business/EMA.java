/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business;
import java.sql.Date;

/**
 *
 * @author User
 */
public class EMA {
    
    private int Emp_ID;
    private String Name;
    private String Dep;
    private String Des;
    private String Gen;
    private String status;
    private String Cno;
            
    public EMA() {
    }

    public EMA(int Emp_ID, String Name, String Dep, String Des, String Gen,String status,String Cno) {
        this.Emp_ID = Emp_ID;
        this.Name = Name;
        this.Dep=Dep;
        this.Des=Des;
        this.Gen=Gen;
        this.status=status;
        this.Cno=Cno;
    }

    public int getEmpolyee_ID() {
        return Emp_ID;
    }

    public void setEmpolyee_ID(int Emp_ID) {
        this.Emp_ID = Emp_ID;
    }


    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getDep() {
        return Dep;
    }

    public void setDep(String Dep) {
        this.Dep = Dep;
    }

    public String getDes() {
        return Des;
    }

    public void setDes(String Des) {
        this.Des = Des;
    }

    public String getGen() {
        return Gen;
    }

    public void setGender(String gen) {
        this.Gen = Gen;
    }
    
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    public String getContactno() {
        return Cno;
    }

    public void setContactno(String Cno) {
        this.Cno = Cno;
    }

    public String get() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
}
