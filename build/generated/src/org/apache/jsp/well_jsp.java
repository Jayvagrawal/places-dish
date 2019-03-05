package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class well_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write('\n');
      out.write('\n');
      out.write('\n');
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.jsp", out, false);
      out.write("\n");
      out.write("<html>\n");
      out.write(" <head>\n");
      out.write(" </head>\n");
      out.write(" <body style = \"background:  #fffff\">\n");
      out.write("<link href=\"css/bootstrap.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\" />\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"css/component.css\" />\n");
      out.write("<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->\n");
      out.write("<script src=\"js/jquery.min.js\"></script>\n");
      out.write("<link href=\"css/style.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\" />\t\n");
      out.write("<script type=\"application/x-javascript\"> addEventListener(\"load\", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>\n");
      out.write("<!--fonts-->\n");
      out.write("<link href='//fonts.googleapis.com/css?family=Open+Sans:400,300,600,700,800' rel='stylesheet' type='text/css'>\n");
      out.write("<link href='//fonts.googleapis.com/css?family=Oswald:400,300,700' rel='stylesheet' type='text/css'>\n");
      out.write("<div class=\"after\">\n");
      out.write("\t\t\t<div class=\"container\">\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\t<div class=\"blog-top-in\">\n");
      out.write("\t\t\t\t\t<div class=\"col-md-4 top-blog\">\n");
      out.write("\t\t\t\t\t\t<img class=\"img-responsive\" src=\"images/food17.png\" alt=\" \" >\n");
      out.write("                                                \n");
      out.write("                                                \n");
      out.write("                                                \n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("                                    \n");
      out.write("                                    \t\t\t\n");
      out.write(" \n");
      out.write("                                 <div class=\"col-md-8 sed-in\"><b>\n");
      out.write("                                            \n");
      out.write("                                            <div class=\"container\">\n");
      out.write("\t\t\t<div class=\"contact\">\n");
      out.write("\t\t\t\t<div class=\"contact-in\">\n");
      out.write("\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t    \n");
      out.write("\t\t\t\t<div class=\" col-md-3 contact-right\">\n");
      out.write("\t\t\t\t     \t\n");
      out.write("\t\t\t\t    </div>\n");
      out.write("\t\t\t\t\t  <div class=\"clearfix\"></div>\n");
      out.write("\t\t\t\t </div>\n");
      out.write("\t\t\t\t <div class=\" contact-left\">\n");
      out.write("\t\t\t\t\t<form action=\"cu.jsp\" method=\"post\" >\n");
      out.write("\t\t\t\t\t    \t<div>\n");
      out.write("                                                    <p class=\"to-do\">Upload your recipes..</p>\n");
      out.write("                                                    <br><br>\n");
      out.write("\t\t\t\t\t\t    \t<span> Recipes title </span>\n");
      out.write("\t\t\t\t\t\t    \t<input name=\"name\" type=\"name\" class=\"textbox\">\n");
      out.write("\t\t\t\t\t\t    </div>\n");
      out.write("\t\t\t\t\t\t    \n");
      out.write("                                                      \n");
      out.write("                                            \n");
      out.write("                             \n");
      out.write("\t\t\t\t\t\t    <div>\n");
      out.write("\t\t\t\t\t\t    \t<span> Purpose your recipes </span>\n");
      out.write("\t\t\t\t\t\t    \t<textarea name=\"msg\"> </textarea>\n");
      out.write("\t\t\t\t\t\t    </div>\n");
      out.write("\t\t\t\t\t\n");
      out.write("                                            \n");
      out.write("\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t  \n");
      out.write("                                            <div>\n");
      out.write("\t\t\t\t\t\t   \t\t<input type=\"submit\" value=\"upload\">\n");
      out.write("\t\t\t\t\t\t  </div>\n");
      out.write("\t\t\t\t\t    </form>\n");
      out.write("\t\t\t\t  </div>\n");
      out.write("\n");
      out.write("\t\t\t    \n");
      out.write("      \t\t</div>\n");
      out.write("\t\t    </div>\n");
      out.write("                                            \n");
      out.write("                                            \n");
      out.write("                                            \n");
      out.write("                                            \n");
      out.write("                                               \n");
      out.write("                                        </body>\n");
      out.write("                                     </html>\n");
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
