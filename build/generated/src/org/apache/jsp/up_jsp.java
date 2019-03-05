package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class up_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
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
      out.write("<link rel=\"stylesheet\" href=\"css/style_1.css\">\n");
      out.write("   \n");
      out.write("  ");

      if(session.getAttribute("name")==null)
      {
      response.sendRedirect("login.jsp");
      }
      
  String name="",email="",mob="",msg="",dob="",ll="";
  name=(String)session.getAttribute("name");
  email=(String)session.getAttribute("id");
mob=request.getParameter("cmt");
ll=request.getParameter("tab");
dob=request.getParameter("se");
if(name==null)name="guest";
try
         {
           Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection( "jdbc:mysql://localhost:3306/ki", "root", "12345");
String du = "tab_"+ll;
           ResultSet rs ;
          Statement stmt = con.createStatement();
          stmt.executeUpdate( 
			    "INSERT INTO "+du+" " +
    "VALUES ('"+name+"','"+email+"','"+mob+"')");
                    

      out.write("\n");
      out.write("<script>alert(\"Pleace upload your recipes\");</script>  \n");

			RequestDispatcher rd=request.getRequestDispatcher("se.jsp?tab="+ll);
			rd.include(request, response);

                            con.close();   }
 catch(SQLException ex)
{
      out.write("\n");
      out.write("<script>alert(\"Somthing went wrong please try again\");</script>  \n");
     RequestDispatcher rd=request.getRequestDispatcher("up.jsp?tab="+ll);
			rd.include(request, response);

	out.println("SQLException : "+ex.getMessage());
}
                               
               			


  
  
  
  
  
  
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
