package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class ress_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<title>Registration Form</title>\n");
      out.write("<script type=\"text/javascript\">\n");
      out.write(" function validate_form() {\n");
      out.write(" if (document.emp.emp_name.value == \"\") {\n");
      out.write(" alert(\"Please fill in the 'Your Employee Name' box.\");\n");
      out.write(" return false;\n");
      out.write("            }\n");
      out.write("  if (document.emp.num.value == \"\") {\n");
      out.write("   alert(\"Enter Employee Number\");\n");
      out.write("                return false;\n");
      out.write("            }\n");
      out.write("            alert(\"sucessfully Submitted\");\n");
      out.write(" \n");
      out.write(" \n");
      out.write(" \n");
      out.write("            if (!(/^\\w+([\\.-]?\\w+)*@\\w+([\\.-]?\\w+)*(\\.\\w{2,3})+$/).test\n");
      out.write("(document.emp.email_id.value)) {\n");
      out.write("                alert(\"You have entered an invalid email address!\")\n");
      out.write("                return (false)\n");
      out.write("            }\n");
      out.write("        }\n");
      out.write(" \n");
      out.write("        function isNumberKey(evt) {\n");
      out.write("            var charCode = (evt.which) ? evt.which : event.keyCode;\n");
      out.write("            if (charCode != 46 && charCode > 31 &&\n");
      out.write("                (charCode < 48 || charCode > 57)) {\n");
      out.write("                alert(\"Enter Number\");\n");
      out.write("                return false;\n");
      out.write("            }\n");
      out.write("            return true;\n");
      out.write("        }\n");
      out.write(" \n");
      out.write(" \n");
      out.write("        //-->\n");
      out.write("    </script>\n");
      out.write(" \n");
      out.write("<body bgcolor=\"#FFFFFF\">\n");
      out.write("    <form name=\"emp\" action=\"\" onsubmit=\"return validate_form();\" method=\"post\">\n");
      out.write("        <table align=\"center\" width=40% width=\"100%\" cellspacing=\"2\" cellpadding=\"2\" \n");
      out.write("border=\"5\">\n");
      out.write("            <tr>\n");
      out.write("                <td colspan=\"2\" align=\"center\"><b>Registration Form.</b></td>\n");
      out.write(" \n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td align=\"left\" valign=\"top\" width=\"41%\">User Name<span \n");
      out.write("style=\"color:red\">*</span></td>\n");
      out.write(" \n");
      out.write("                <td width=\"57%\"><input type=\"text\" value=\"\" name=\"User_name\" \n");
      out.write("size=\"24\"></td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td align=\"left\" valign=\"top\" width=\"41%\">Contact Number<span \n");
      out.write("style=\"color:red\">*</span></td>\n");
      out.write("                <td width=\"57%\">\n");
      out.write("                    <input type=\"text\" value=\"\" name=\"num\" onkeypress=\"return \n");
      out.write("isNumberKey(event)\" size=\"24\"></td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td align=\"left\" valign=\"top\" width=\"41%\"> User Address</td>\n");
      out.write(" \n");
      out.write("                <td width=\"57%\"><textarea rows=\"4\" maxlen=\"200\" name=\"S2\" \n");
      out.write("cols=\"20\"></textarea></td>\n");
      out.write("            </tr <tr>\n");
      out.write(" \n");
      out.write("            <td align=\"left\" valign=\"top\" width=\"41%\">Date Of Birth</td>\n");
      out.write("            <td width=\"57%\">\n");
      out.write("                \n");
      out.write("      <div>\n");
      out.write("        <h3 class=\"birthday_title\"></h3>\n");
      out.write("      </div>\n");
      out.write("      <div>\n");
      out.write("        <select name=\"birthday_month\" >\n");
      out.write("          <option value=\"\" selected >Month</option>\n");
      out.write("          <option value=\"1\">Jan</option>\n");
      out.write("          <option value=\"2\">Feb</option>\n");
      out.write("          <option value=\"3\">Mar</option>\n");
      out.write("          <option value=\"4\">Apr</option>\n");
      out.write("          <option value=\"5\">May</option>\n");
      out.write("          <option value=\"6\">Jun</option>\n");
      out.write("          <option value=\"7\">Jul</option>\n");
      out.write("          <option value=\"8\">Aug</option>\n");
      out.write("          <option value=\"9\">Sep</option>\n");
      out.write("          <option value=\"10\">Oct</option>\n");
      out.write("          <option value=\"11\">Nov</option>\n");
      out.write("          <option value=\"12\">Dec</option>\n");
      out.write("        </select>\n");
      out.write("        &nbsp;&nbsp;\n");
      out.write("        <select name=\"birthday_day\" >\n");
      out.write("          <option value=\"\" selected>Day</option>\n");
      out.write("          <option value=\"1\">1</option>\n");
      out.write("          <option value=\"2\">2</option>\n");
      out.write("          <option value=\"3\">3</option>\n");
      out.write("          <option value=\"4\">4</option>\n");
      out.write("          <option value=\"5\">5</option>\n");
      out.write("          <option value=\"6\">6</option>\n");
      out.write("          <option value=\"7\">7</option>\n");
      out.write("          <option value=\"8\">8</option>\n");
      out.write("          <option value=\"9\">9</option>\n");
      out.write("          <option value=\"10\">10</option>\n");
      out.write("          <option value=\"11\">11</option>\n");
      out.write("          <option value=\"12\">12</option>\n");
      out.write("          <option value=\"13\">13</option>\n");
      out.write("          <option value=\"14\">14</option>\n");
      out.write("          <option value=\"15\">15</option>\n");
      out.write("          <option value=\"16\">16</option>\n");
      out.write("          <option value=\"17\">17</option>\n");
      out.write("          <option value=\"18\">18</option>\n");
      out.write("          <option value=\"19\">19</option>\n");
      out.write("          <option value=\"20\">20</option>\n");
      out.write("          <option value=\"21\">21</option>\n");
      out.write("          <option value=\"22\">22</option>\n");
      out.write("          <option value=\"23\">23</option>\n");
      out.write("          <option value=\"24\">24</option>\n");
      out.write("          <option value=\"25\">25</option>\n");
      out.write("          <option value=\"26\">26</option>\n");
      out.write("          <option value=\"27\">27</option>\n");
      out.write("          <option value=\"28\">28</option>\n");
      out.write("          <option value=\"29\">29</option>\n");
      out.write("          <option value=\"30\">30</option>\n");
      out.write("          <option value=\"31\">31</option>\n");
      out.write("        </select>\n");
      out.write("        &nbsp;&nbsp;\n");
      out.write("        <select name=\"birthday_year\">\n");
      out.write("          <option value=\"\" selected>Year</option>\n");
      out.write("          <option value=\"2013\">2013</option>\n");
      out.write("          <option value=\"2012\">2012</option>\n");
      out.write("          <option value=\"2011\">2011</option>\n");
      out.write("          <option value=\"2010\">2010</option>\n");
      out.write("          <option value=\"2009\">2009</option>\n");
      out.write("          <option value=\"2008\">2008</option>\n");
      out.write("          <option value=\"2007\">2007</option>\n");
      out.write("          <option value=\"2006\">2006</option>\n");
      out.write("          <option value=\"2005\">2005</option>\n");
      out.write("          <option value=\"2004\">2004</option>\n");
      out.write("          <option value=\"2003\">2003</option>\n");
      out.write("          <option value=\"2002\">2002</option>\n");
      out.write("          <option value=\"2001\">2001</option>\n");
      out.write("          <option value=\"2000\">2000</option>\n");
      out.write("          <option value=\"1999\">1999</option>\n");
      out.write("          <option value=\"1998\">1998</option>\n");
      out.write("          <option value=\"1997\">1997</option>\n");
      out.write("          <option value=\"1996\">1996</option>\n");
      out.write("          <option value=\"1995\">1995</option>\n");
      out.write("          <option value=\"1994\">1994</option>\n");
      out.write("          <option value=\"1993\">1993</option>\n");
      out.write("          <option value=\"1992\">1992</option>\n");
      out.write("          <option value=\"1991\">1991</option>\n");
      out.write("          <option value=\"1990\">1990</option>\n");
      out.write("        </select>\n");
      out.write("      </div> </td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td align=\"left\" valign=\"top\" width=\"40%\">User Location</td>\n");
      out.write("                <td width=\"90%\"><select name=\"mydropdown\">\n");
      out.write("<option value=\"Default\">Indore</option>               \n");
      out.write("<option value=\"Chennai\">Bhopal</option>\n");
      out.write("<option value=\"Bangalore\">Gwalior</option>\n");
      out.write("<option value=\"Chennai\">Jabalpur</option>\n");
      out.write("<option value=\"Bangalore\">Hoshangabad</option>\n");
      out.write("<option value=\"Chennai\">Other</option>\n");
      out.write(" \n");
      out.write("</select></td>\n");
      out.write(" \n");
      out.write(" \n");
      out.write("            </tr>\n");
      out.write(" \n");
      out.write("            <tr>\n");
      out.write("                <td align=\"left\" valign=\"top\" width=\"41%\">Profession</td>\n");
      out.write("                <td width=\"57%\">\n");
      out.write("                    <select name=\"mydropdown\">\n");
      out.write("<option value=\"Default\">House wife</option>\n");
      out.write("<option value=\"Systems Engineer\">Master Safe</option>\n");
      out.write("<option value=\"Senior Systems Engineer\">Student</option>\n");
      out.write("<option value=\"Technology Analyst\">other</option>\n");
      out.write("\n");
      out.write(" \n");
      out.write(" \n");
      out.write("</select></td>\n");
      out.write(" \n");
      out.write(" \n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td align=\"left\" valign=\"top\" width=\"41%\">Email<span \n");
      out.write("style=\"color:red\">*</span></td>\n");
      out.write("                <td width=\"57%\">\n");
      out.write("                    <input type=\"text\" value=\"\" name=\"email_id\" size=\"24\"></td>\n");
      out.write("            </tr>\n");
      out.write("\n");
      out.write("\n");
      out.write("    \n");
      out.write("\n");
      out.write("<td align=\"left\" valign=\"top\" width=\"41%\">Gender</td>\n");
      out.write("                <td width=\"57%\">\n");
      out.write("      <!--birthday details ends-->\n");
      out.write("      <div id=\"radio_button\">\n");
      out.write("        <input type=\"radio\" name=\"radiobutton\" value=\"Female\">\n");
      out.write("        <label >Female</label>\n");
      out.write("        &nbsp;&nbsp;&nbsp;\n");
      out.write("        <input type=\"radio\" name=\"radiobutton\" value=\"Male\">\n");
      out.write("        <label >Male</label>\n");
      out.write("         &nbsp;&nbsp;&nbsp;\n");
      out.write("        <input type=\"radio\" name=\"radiobutton\" value=\"Other\">\n");
      out.write("        <label >Other</label>\n");
      out.write("\n");
      out.write("      </div>\n");
      out.write("       <div>\n");
      out.write("         </td>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write(" \n");
      out.write("            <tr>\n");
      out.write("                <td colspan=\"2\">\n");
      out.write("                    <p align=\"center\">\n");
      out.write("\n");
      out.write("\n");
      out.write("                    <p><input type=\"checkbox\" name=\"remember\">I agree with terms and \n");
      out.write("conditions.</p>\n");
      out.write("                         \n");
      out.write("                         <p align=\"center\">\n");
      out.write("                        <input type=\"submit\" value=\"  Submit\" \n");
      out.write("name=\"B4\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("&nbsp;&nbsp;\n");
      out.write("                        <input type=\"reset\" value=\"  Reset All   \" name=\"B5\"></td>\n");
      out.write("            </tr>\n");
      out.write(" \n");
      out.write("        </table>\n");
      out.write("    </form>\n");
      out.write("</body>\n");
      out.write(" \n");
      out.write("</html>");
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
