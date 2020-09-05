package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import student.StudentBean;

public final class updatestudent_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Add New Record</title>\n");
      out.write("        <style>\n");
      out.write("            \n");
      out.write("            input{\n");
      out.write("                alignment-adjust: central;\n");
      out.write("                font-size: 28px;\n");
      out.write("            }\n");
      out.write("            \n");
      out.write("            body{\n");
      out.write("                \n");
      out.write("                color: blue;\n");
      out.write("                font-size: 22px;\n");
      out.write("                text-align: center;\n");
      out.write("                background-color: whitesmoke;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("       \n");
      out.write("        <div class=\"header\">\n");
      out.write("            <h2>Welcome to Fees Record Management System</h2>\n");
      out.write("            ");

            StudentBean sBean = (StudentBean)request.getAttribute("student");
            
            
            
      out.write("\n");
      out.write("            <h2>Update Student</h2>\n");
      out.write("            <form action=\"ControllerServlet\" method=\"post\"  >\n");
      out.write("                <input type=\"text\" name=\"sname\" placeholder=\"Student Name\" value=\"");
      out.print(sBean.getName() );
      out.write("\">\n");
      out.write("                <br>\n");
      out.write("                <input type=\"text\" name =\"fname\" placeholder=\"Father Name\" value =\"");
      out.print(sBean.getFname() );
      out.write("\" >\n");
      out.write("                <br>\n");
      out.write("                <input type=\"text\" name=\"rollno\" placeholder=\"Roll No\" value =\"");
      out.print(sBean.getRollno());
      out.write("\">\n");
      out.write("                <br>\n");
      out.write("                <input type=\"text\" name=\"class\" placeholder=\"Class\" value =\"");
      out.print(sBean.getSclass());
      out.write("\">\n");
      out.write("                <br>\n");
      out.write("                <input type=\"submit\" name=\"action\" value=\"updating\">\n");
      out.write("                \n");
      out.write("            \n");
      out.write("                \n");
      out.write("            </form>\n");
      out.write("            </div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
