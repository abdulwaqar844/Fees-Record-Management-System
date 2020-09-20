package student;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class FeesDAO {

        private Connection con;
        public FeesDAO() throws SQLException {
        establishconnection();
    }

    private void establishconnection() throws SQLException {
    try {
        Class.forName("com.mysql.jdbc.Driver");
        String url="jdbc:mysql://localhost:3306/students?zeroDateTimeBehavior=convertToNull";
        String pass="root";
        String user="";
        con=DriverManager.getConnection(url,pass,user);
         
    } catch (ClassNotFoundException ex) {
    }
    }
 public ArrayList feesrecord(int sid) throws SQLException{
        ArrayList slist =new ArrayList();
        String sql="SELECT * FROM feesdetails where stid =?";
        PreparedStatement ps=con.prepareStatement(sql);
        ps.setInt(1, sid);
        ResultSet rs = ps.executeQuery();
        while(rs.next()){
            FeesBean fees= new FeesBean();
            String month=rs.getString("month");
            int amount=rs.getInt("amount");            
            Date paiddate = rs.getDate("paiddate");
            String stid=rs.getString("stid");
            String fid=rs.getString("id");
            fees.setId(Integer.parseInt(fid));
            fees.setStid(Integer.parseInt(stid));
            fees.setMonth(month);
            fees.setAmount(amount);
            fees.setPaiddate(paiddate);
            slist.add(fees);
        }
        return slist;
 }
 public void addfee(FeesBean fees ) throws SQLException{
 String sql="INSERT INTO feesdetails (`month`,amount,paiddate,stid) VALUES (?,?,?,?)";
 PreparedStatement preparedStatement=con.prepareStatement(sql);
 preparedStatement.setString(1,fees.getMonth());
 preparedStatement.setInt(2,fees.getAmount());
 preparedStatement.setDate(3, (Date) fees.getPaiddate());
  preparedStatement.setInt(4,fees.getStid());
  preparedStatement.executeUpdate();
 
 }
 
    public boolean deleterecord(int feesid) throws SQLException{
    boolean status= false;
    String sql="DELETE FROM `feesdetails` WHERE id=?";
    PreparedStatement ps=con.prepareStatement(sql);
    ps.setInt(1, feesid);
    ps.executeUpdate();
    status=true;
    return status;
    }
 
 
 
 
 
 
 
 
 
 
 
 
 
 
}