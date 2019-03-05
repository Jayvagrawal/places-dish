package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class header_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<title>Kitchen-Master</title>\n");
      out.write("<link href=\"css/bootstrap.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\" />\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"css/component.css\" />\n");
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
      out.write("\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\t<!--header-->\n");
      out.write("\t<div class=\"header-in\">\n");
      out.write("\t\t<div class=\"container\">\t\n");
      out.write("\t\t\t\t<!---->\n");
      out.write("\t\t\t<div class=\"header-logo\">\n");
      out.write("\t\t\t\t<div class=\"logo\">\n");
      out.write("\t\t\t\t<a href=\"index.jsp\"><img src=\"images/logo.png\" alt=\"\" ></a>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"top-nav\">\n");
      out.write("\t\t\t\t\t<span class=\"menu\"> </span>\n");
      out.write("\t\t\t\t\t<ul>\n");
      out.write("\t\t\t\t\t\t<li ><a href=\"about.jsp\" data-hover=\"REGISTER\">RESISTER </a> </li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"404.jsp\" data-hover=\"UPLOAD RECIPE\" >UPLOAD RECIPE</a></li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"gallery.jsp\" data-hover=\"GALLERY\">VIEW RECIPE </a></li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"contact.jsp\" data-hover=\"CONTACT\">CONTACT </a></li>\n");
      out.write("                                                \n");
      out.write("\n");
      out.write("                                                \n");
      out.write("                                                \n");
      out.write("\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t<!--script-->\n");
      out.write("\t\t\t\t<script>\n");
      out.write("\t\t\t\t\t$(\"span.menu\").click(function(){\n");
      out.write("\t\t\t\t\t\t$(\".top-nav ul\").slideToggle(500, function(){\n");
      out.write("\t\t\t\t\t\t});\n");
      out.write("\t\t\t\t\t});\n");
      out.write("\t\t\t</script>\t\t\t\t\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<div class=\"clearfix\"> </div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<!---->\n");
      out.write("\t\t\t\t<div class=\"top-menu\">\t\t\t\t\t\n");
      out.write("\t\t\t\t\t<ul>\n");
      out.write("                                                 <li><a href=\"ress.jsp\" data-hover=\"RESISTER\" >RESISTER</a></li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"404.jsp\" data-hover=\"UPLOAD RECIPE\" >UPLOAD RECIPE</a></li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"index.jsp\" data-hover=\"HOME\">HOME</a></li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"gallery.jsp\" data-hover=\"VIEW RECIPE\">VIEW RECIPE </a></li>\n");
      out.write("<li>\t\t\t\t\t\t<li><a href=\"contact.jsp\" data-hover=\"CONTACT\">CONTACT</a></li>                                                                                                 <section>\n");
      out.write("<form action=\"\" method=\"post\" class=\"bolder\">\n");
      out.write("<input type=\"search\" name=\"search\" placeholder=\"What are you looking for?\" class=\"form__input\">\n");
      out.write("<input type=\"submit\" value=\"Search\" class=\"button\">\n");
      out.write("</form>\n");
      out.write("</li>\n");
      out.write("                                        </ul>                              \n");
      out.write("                                      \n");
      out.write("\t\t\t\t\n");
      out.write("                                    \n");
      out.write("\t\t</div>\t\n");
      out.write("\t</div>\n");
      out.write("</div>\n");
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
