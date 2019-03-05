package org.apache.jsp.web;

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

      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.jsp", out, false);
      out.write("\n");
      out.write("<br><br>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<title>Registration Form</title>\n");
      out.write("\n");
      out.write("<link href=\"css/bootstrap.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\" />\n");
      out.write(" <link rel=\"stylesheet\" href=\"css/style_1.css\">\n");
      out.write(" <link href=\"css/bootstrap.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\" />\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"css/component.css\" />\n");
      out.write(" \n");
      out.write("<script src=\"js/jquery.min.js\"></script>\n");
      out.write("<link href=\"css/style.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\" />\t\n");
      out.write("<script type=\"application/x-javascript\"> addEventListener(\"load\", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>\n");
      out.write("<!--fonts-->\n");
      out.write("<link href='//fonts.googleapis.com/css?family=Open+Sans:400,300,600,700,800' rel='stylesheet' type='text/css'>\n");
      out.write("<link href='//fonts.googleapis.com/css?family=Oswald:400,300,700' rel='stylesheet' type='text/css'>\n");
      out.write("<!--//fonts-->\n");
      out.write("<script type=\"text/javascript\" src=\"js/move-top.js\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"js/easing.js\"></script>\n");
      out.write("\t\t\t\t<script type=\"text/javascript\">\n");
      out.write("\t\t\t\t\tjQuery(document).ready(function($) {\n");
      out.write("\t\t\t\t\t\t$(\".scroll\").click(function(event){\t\t\n");
      out.write("\t\t\t\t\t\t\tevent.preventDefault();\n");
      out.write("\t\t\t\t\t\t\t$('html,body').animate({scrollTop:$(this.hash).offset().top},1000);\n");
      out.write("\t\t\t\t\t\t});\n");
      out.write("\t\t\t\t\t});\n");
      out.write("\t\t\t\t\t</script>\n");
      out.write("<link rel=\"stylesheet\" href=\"css/animate.css\">\n");
      out.write("\t<!-- Custom Stylesheet -->\n");
      out.write("\t<link rel=\"stylesheet\" href=\"css/style_1.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/bootstrap.css\">\n");
      out.write("\t<!-- Custom Stylesheet -->\n");
      out.write("\t<link rel=\"stylesheet\" href=\"css/style.css\">\n");
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
      out.write("\n");
      out.write("\t\t\t\t\n");
      out.write("<body style = \"background:#ddd \">\n");
      out.write("    <form name=\"emp\" action=\"reg.jsp\" onsubmit=\"return validate_form();\" method=\"post\">\n");
      out.write("        <table align=\"center\" width=40% width=\"100%\" cellspacing=\"2\" cellpadding=\"2\" \n");
      out.write("border=\"5\">\n");
      out.write("            <tr>\n");
      out.write("                <td colspan=\"2\" align=\"center\"><b>Registration Form.</b></td>\n");
      out.write(" \n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("            <b>\n");
      out.write("                <td align=\"left\" valign=\"top\" width=\"41%\"> User Name<span \n");
      out.write("                        style=\"color:red\">*</span></td>\n");
      out.write(" \n");
      out.write("                <td width=\"57%\"><input type=\"text\" value=\"\" name=\"name\" \n");
      out.write("size=\"25\"></td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td align=\"left\" valign=\"top\" width=\"41%\">Contact Number<span \n");
      out.write("style=\"color:red\">*</span></td>\n");
      out.write("                <td width=\"57%\">\n");
      out.write("                    <input type=\"number\" value=\"\" name=\"mob\" onkeypress=\"return \n");
      out.write("isNumberKey(event)\" size=\"25\"></td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td align=\"left\" valign=\"top\" width=\"41%\"> User Address</td>\n");
      out.write(" \n");
      out.write("                <td width=\"57%\"><textarea rows=\"4\" maxlen=\"200\" name=\"ua\" \n");
      out.write("cols=\"20\"></textarea></td>\n");
      out.write("            </tr> <tr>\n");
      out.write("                <td align=\"left\" valign=\"top\" width=\"41%\">Date of Birth</td>\n");
      out.write(" \n");
      out.write("                <td width=\"57%\"><input type=\"date\" value=\"\" name=\"dob\" onkeypress=\"return \n");
      out.write("isNumberKey(event)\" size=\"25\"></td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td align=\"left\" valign=\"top\" width=\"40%\">Question</td>\n");
      out.write("                <td width=\"90%\"><select name=\"sq\">\n");
      out.write("<option value=\"what is your birth place\">what is your birth place</option>               \n");
      out.write("<option value=\"what is your first GF or BF name\">what is your father name</option>\n");
      out.write("<option value=\"what is Your nick name\">what is Your nick name</option>\n");
      out.write("<option value=\"who is your best friend\">who is your best friend</option>\n");
      out.write("\n");
      out.write(" \n");
      out.write("</select></td>\n");
      out.write(" \n");
      out.write(" \n");
      out.write("            </tr>\n");
      out.write(" <tr>\n");
      out.write("                <td align=\"left\" valign=\"top\" width=\"41%\">Answere</td>\n");
      out.write(" \n");
      out.write("                <td width=\"57%\"><input type=\"text\" value=\"\" name=\"sa\" onkeypress=\"return \n");
      out.write("isNumberKey(event)\" size=\"25\"></td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td align=\"left\" valign=\"top\" width=\"41%\">Profession</td>\n");
      out.write("                <td width=\"57%\">\n");
      out.write("                    <select name=\"pro\">\n");
      out.write("<option value=\"House wife\">House wife</option>\n");
      out.write("<option value=\"Master Safe\">Master Safe</option>\n");
      out.write("<option value=\"Student\">Student</option>\n");
      out.write("<option value=\"other\">other</option>\n");
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
      out.write("                    <input type=\"email\" value=\"\" name=\"email\" size=\"25\"></td>\n");
      out.write("                     \n");
      out.write("            </tr>\n");
      out.write("\n");
      out.write("\n");
      out.write("   <tr>\n");
      out.write("                <td align=\"left\" valign=\"top\" width=\"41%\">Password<span \n");
      out.write("style=\"color:red\">*</span></td>\n");
      out.write("                <td width=\"57%\">\n");
      out.write("                    <input type=\"password\" value=\"\" name=\"pass\" size=\"25\"></td>\n");
      out.write("            </tr>\n");
      out.write(" \n");
      out.write("<tr>\n");
      out.write("<td align=\"left\" valign=\"top\" width=\"41%\">Gender</td>\n");
      out.write("                <td width=\"57%\">\n");
      out.write("      <!--birthday details ends-->\n");
      out.write("      <div id=\"radio_button\">\n");
      out.write("        <input type=\"radio\" name=\"gen\" value=\"Female\">\n");
      out.write("        <label >Female</label>\n");
      out.write("        &nbsp;&nbsp;&nbsp;\n");
      out.write("        <input type=\"radio\" name=\"gen\" value=\"Male\">\n");
      out.write("        <label >Male</label>\n");
      out.write("         &nbsp;&nbsp;&nbsp;\n");
      out.write("        <input type=\"radio\" name=\"gen\" value=\"Other\">\n");
      out.write("        <label >Other</label>\n");
      out.write("\n");
      out.write("      </div>\n");
      out.write("     \n");
      out.write("         </td>\n");
      out.write("        </tr>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write(" \n");
      out.write("            <tr>\n");
      out.write("                <td colspan=\"2\">\n");
      out.write("                    <p align=\"center\">\n");
      out.write("\n");
      out.write("\n");
      out.write("                    <p><input type=\"checkbox\" name=\"remember\" required>I agree with terms and \n");
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
      out.write("</b>\n");
      out.write("    </form>\n");
      out.write("</body>\n");
      out.write(" \n");
      out.write("</html>\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "footer.jsp", out, false);
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
