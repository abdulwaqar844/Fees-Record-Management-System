package student;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
public class ControllerServlet extends HttpServlet {
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, SQLException {
        RequestDispatcher rs=null;
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        StudentDAO studentdao= new StudentDAO();
        FeesDAO feesdao= new FeesDAO();

        String action=request.getParameter("action");
        String msg=null;
        switch(action){
            case "newrecord":
                response.sendRedirect("addstudent.jsp");
            break;
            case "addstudent":
                String name=request.getParameter("sname");
                String fname=request.getParameter("fname");
                String rollno=request.getParameter("rollno");
                String sclass=request.getParameter("class");
                StudentBean beans= new StudentBean();
                beans.setName(name);
                beans.setFname(fname);
                beans.setRollno(rollno);
                beans.setSclass(sclass);
                studentdao.addstudent(beans);
                response.sendRedirect("index.jsp");
                break;              
            case "list":
                ArrayList studentlist = studentdao.retriverecords();
                request.setAttribute("list", studentlist);
                rs= request.getRequestDispatcher("showstudent.jsp");
                rs.forward(request , response);
                break;
            case "delete":
              int id=Integer.parseInt(request.getParameter("id"));
                boolean status= studentdao.deleterecord(id);
                 ArrayList studentlist1 = studentdao.retriverecords();
                request.setAttribute("list", studentlist1);
                rs= request.getRequestDispatcher("showstudent.jsp");
                rs.forward(request , response);
                break;
            case "update":
                int id2=Integer.parseInt(request.getParameter("id"));
                StudentBean sBean=studentdao.getsingle(id2);
                request.setAttribute("student", sBean);
                rs=request.getRequestDispatcher("updatestudent.jsp");
                rs.forward(request, response);
                break;
            case "updating":
                String id1=request.getParameter("id");
                String n=request.getParameter("sname");
                String f=request.getParameter("fname");
                String r=request.getParameter("rollno");
                String c=request.getParameter("class");
                out.print(id1+n+f+r+c);
                StudentBean bean1= new StudentBean();
                bean1.setId(Integer.parseInt(id1));
                bean1.setName(n);
                bean1.setFname(f);
                bean1.setRollno(r);
                bean1.setSclass(c);
                out.print(bean1);
                studentdao.update(bean1);
                response.sendRedirect("index.jsp");
                break;
            case "feesdetail":
                int sid=Integer.parseInt(request.getParameter("id"));
                ArrayList fees = feesdao.feesrecord(sid);
                request.setAttribute("list", fees);
                rs= request.getRequestDispatcher("FeesDetails.jsp");
                rs.forward(request , response); 
                break;
            case "addfees":
                String month=request.getParameter("month");
                int amount=Integer.parseInt(request.getParameter("amount"));
                Date date=Date.valueOf(request.getParameter("paiddate"));
                int stid=Integer.parseInt(request.getParameter("stid"));
                FeesBean feesbean= new FeesBean();
                feesbean.setAmount(amount);
                feesbean.setMonth(month);
                feesbean.setPaiddate(date);
                feesbean.setStid(stid);
                feesdao.addfee(feesbean);
                response.sendRedirect("index.jsp");
                break;
        
        }
    }
     @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (SQLException ex) {
            Logger.getLogger(ControllerServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (SQLException ex) {
            Logger.getLogger(ControllerServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    @Override
    public String getServletInfo() {
        return "Short description";
    }
}