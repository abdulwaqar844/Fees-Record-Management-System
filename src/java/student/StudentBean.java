/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student;

import java.io.Serializable;

public class StudentBean implements Serializable {
    private int id;
    private String name;
    private String fname;
    private String rollno;
    private String sclass;

    public StudentBean() {
        name = "";
        fname = "";
        rollno = "";
        sclass = "";
    }

    public int getId() {
        return id;
    }

    public void setId(int i) {
        id = i;
    }

    public String getName() {
        return name;
    }

    public void setName(String n) {
        name = n;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String f) {
        fname = f;
    }

    public String getRollno() {
        return rollno;
    }

    public void setRollno(String r) {
        rollno = r;
    }

    public String getSclass() {
        return sclass;
    }

    public void setSclass(String c) {
        sclass = c;
    }

  
}
