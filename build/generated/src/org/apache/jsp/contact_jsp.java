package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class contact_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\r\n");
      out.write("\t\t<div class=\"container\">\r\n");
      out.write("\t\t\t<div class=\"contact\">\r\n");
      out.write("\t\t\t\t<div class=\"contact-in\">\r\n");
      out.write("\t\t\t\t\t<h2>contact</h2>\r\n");
      out.write("\t\t\t\t\t\t\t\t    \r\n");
      out.write("\t\t\t\t<div class=\" col-md-3 contact-right\">\r\n");
      out.write("\t\t\t\t     \t\r\n");
      out.write("\t\t\t\t    </div>\r\n");
      out.write("\t\t\t\t\t  <div class=\"clearfix\"></div>\r\n");
      out.write("\t\t\t\t </div>\r\n");
      out.write("\t\t\t\t <div class=\" contact-left\">\r\n");
      out.write("\t\t\t\t\t<form action=\"cu.jsp\" method=\"post\" >\r\n");
      out.write("\t\t\t\t\t    \t<div>\r\n");
      out.write("\t\t\t\t\t\t    \t<span>Name</span>\r\n");
      out.write("\t\t\t\t\t\t    \t<input name=\"name\" type=\"name\" class=\"textbox\">\r\n");
      out.write("\t\t\t\t\t\t    </div>\r\n");
      out.write("\t\t\t\t\t\t    \r\n");
      out.write("\t\t\t\t\t\t    <div>\r\n");
      out.write("\t\t\t\t\t\t    \t<span>Massege</span>\r\n");
      out.write("\t\t\t\t\t\t    \t<textarea name=\"msg\"> </textarea>\r\n");
      out.write("\t\t\t\t\t\t    </div>\r\n");
      out.write("\t\t\t\t\t<div>\r\n");
      out.write("\t\t\t\t\t\t    \t<span>Email</span>\r\n");
      out.write("\t\t\t\t\t\t    \t<input name=\"email\" type=\"email\" class=\"textbox\">\r\n");
      out.write("\t\t\t\t\t\t    </div>\r\n");
      out.write("                                            <div>\r\n");
      out.write("\t\t\t\t\t\t    \t<span>Mobile</span>\r\n");
      out.write("\t\t\t\t\t\t    \t<input name=\"mob\" type=\"number\" class=\"textbox\">\r\n");
      out.write("\t\t\t\t\t\t    </div>\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t  \r\n");
      out.write("                                            <div>\r\n");
      out.write("\t\t\t\t\t\t   \t\t<input type=\"submit\" value=\"Submit\">\r\n");
      out.write("\t\t\t\t\t\t  </div>\r\n");
      out.write("\t\t\t\t\t    </form>\r\n");
      out.write("\t\t\t\t  </div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t    \r\n");
      out.write("      \t\t</div>\r\n");
      out.write("\t\t    </div>\r\n");
      out.write("\t<!---->\t\r\n");
      out.write("\t");
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
