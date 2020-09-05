package student;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
class StudentDAO {

        private Connection con;
        public StudentDAO() throws SQLException {
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



    public void addstudent(StudentBean student) throws SQLException{
       
            String name=student.getName();
            String fname=student.getFname();
            String Rollno=student.getRollno();
            String classs=student.getSclass();
            String sql="INSERT into students(stname,fname,rollno,sclass) VALUES (?,?,?,?)";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, name);
            ps.setString(2, fname);
            ps.setString(3, Rollno);
            ps.setString(4, classs);
            ps.executeUpdate();
       
        }
    public ArrayList retriverecords() throws SQLException{
        ArrayList slist =new ArrayList();
        String sql="SELECT * FROM students";
        Statement statement= con.createStatement();
        ResultSet rs=statement.executeQuery(sql);
        while(rs.next()){
             StudentBean student= new StudentBean();
             String id=rs.getString("id");
             String name=rs.getString("stname");
             String fname=rs.getString("fname");
             String Rollno=rs.getString("rollno");
             String cl=rs.getString("sclass");
             student.setId(Integer.parseInt(id));
             student.setName(name);
             student.setFname(fname);
             student.setRollno(Rollno);
             student.setSclass(cl);
             slist.add(student);
        }
        return slist;
    
    
    }
    public boolean deleterecord(int id) throws SQLException{
        boolean status= false;
    String sql="DELETE FROM `students` WHERE id=?";
    PreparedStatement ps=con.prepareStatement(sql);
    ps.setInt(1, id);
    ps.executeUpdate();
    status=true;
    return status;
    }
     public void update( StudentBean bean1) throws SQLException{
    String sql="UPDATE students SET stname=?,fname=?,rollno=?,sclass=? WHERE id=?";
    PreparedStatement ps=con.prepareStatement(sql);
        ps.setInt(5, bean1.getId());
        ps.setString(1, bean1.getName());
        ps.setString(2, bean1.getFname());
        ps.setString(3, bean1.getRollno());
        ps.setString(4, bean1.getSclass());
        ps.executeUpdate();
        
}
     
    public StudentBean getsingle( int id) throws SQLException{
        String sql="SELECT * FROM students where id=?";
        PreparedStatement ps=con.prepareStatement(sql);
        ps.setInt(1, id);
        ResultSet rs = ps.executeQuery();
        StudentBean student1= new StudentBean();
        while(rs.next()){
             String name=rs.getString("stname");
             String fname=rs.getString("fname");
             String Rollno=rs.getString("rollno");
             String cl=rs.getString("sclass");
             student1.setId(id);
             student1.setName(name);
             student1.setFname(fname);
             student1.setRollno(Rollno);
             student1.setSclass(cl);
             
        }
            return student1;
    
    
    }
}