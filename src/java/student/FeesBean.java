/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student;

import java.io.Serializable;
import java.util.Date;


/**
 *
 * @author ABDUL WAQAR
 */
public class FeesBean implements  Serializable{
    private int id;
    private int stid;
    private String month;
    private  int amount;
    private  Date paiddate;

    public FeesBean() {
        
    }

    public int getStid() {
        return stid;
    }

    public void setStid(int stid) {
        this.stid = stid;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public Date getPaiddate() {
        return paiddate;
    }

    public void setPaiddate(Date date) {
        paiddate = date;
    }
    
    
}
