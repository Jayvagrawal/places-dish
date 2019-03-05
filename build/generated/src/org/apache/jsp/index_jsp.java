package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<title> Home</title>\r\n");
      out.write("<link href=\"css/bootstrap.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\" />\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"css/component.css\" />\r\n");
      out.write("<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->\r\n");
      out.write("<script src=\"js/jquery.min.js\"></script>\r\n");
      out.write("<link href=\"css/style.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\" />\t\r\n");
      out.write("<script type=\"application/x-javascript\"> addEventListener(\"load\", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>\r\n");
      out.write("<!--fonts-->\r\n");
      out.write("<link href='//fonts.googleapis.com/css?family=Open+Sans:400,300,600,700,800' rel='stylesheet' type='text/css'>\r\n");
      out.write("<link href='//fonts.googleapis.com/css?family=Oswald:400,300,700' rel='stylesheet' type='text/css'>\r\n");
      out.write("<!--//fonts-->\r\n");
      out.write("<script type=\"text/javascript\" src=\"js/move-top.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"js/easing.js\"></script>\r\n");
      out.write("\t\t\t\t<script type=\"text/javascript\">\r\n");
      out.write("\t\t\t\t\tjQuery(document).ready(function($) {\r\n");
      out.write("\t\t\t\t\t\t$(\".scroll\").click(function(event){\t\t\r\n");
      out.write("\t\t\t\t\t\t\tevent.preventDefault();\r\n");
      out.write("\t\t\t\t\t\t\t$('html,body').animate({scrollTop:$(this.hash).offset().top},1000);\r\n");
      out.write("\t\t\t\t\t\t});\r\n");
      out.write("\t\t\t\t\t});\r\n");
      out.write("\t\t\t\t\t</script>\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t<!--header-->\r\n");
      out.write("\t<div class=\"header\">\r\n");
      out.write("\t\t<div class=\"container\">\r\n");
      out.write("\t\t<!---->\r\n");
      out.write("\t\t\t<div class=\"header-logo\">\r\n");
      out.write("\t\t\t\t<div class=\"logo\">\r\n");
      out.write("\t\t\t\t<a href=\"index.html\"><img src=\"images/logo.png\" alt=\"\" ></a>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"top-nav\">\r\n");
      out.write("\t\t\t\t\t<span class=\"menu\"> </span>\r\n");
      out.write("\t\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"ress.jsp\" data-hover=\"RESISTER\">RESISTER </a> </li>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"404.jsp\" data-hover=\"UPLOADED RECIPE\" >UPLOADED RECIPES</a></li>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"contact.jsp\" data-hover=\"CONTACT\">CONTACT </a></li>\r\n");
      out.write("\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t<!--script-->\r\n");
      out.write("\t\t\t\t<script>\r\n");
      out.write("\t\t\t\t\t$(\"span.menu\").click(function(){\r\n");
      out.write("\t\t\t\t\t\t$(\".top-nav ul\").slideToggle(500, function(){\r\n");
      out.write("\t\t\t\t\t\t});\r\n");
      out.write("\t\t\t\t\t});\r\n");
      out.write("\t\t\t</script>\t\t\t\t\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div class=\"clearfix\"> </div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<!---->\r\n");
      out.write("\t\t\t\t<div class=\"top-menu\">\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t<ul>\r\n");
      out.write("                                            <li><a href=\"index.jsp\" data-hover=\"HOME\">HOME</a></li>\r\n");
      out.write("                                  \t\t<li><a href=\"404.jsp\" data-hover=\"UPLOADED RECIPES\" >UPLOADED RECIPES</a></li>\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"contact.jsp\" data-hover=\"CONTACT\">CONTACT</a></li>                                                                      \r\n");
      out.write("                                                <li><form action=\"see.jsp\" method=\"get\" class=\"\">\r\n");
      out.write("                                                        <input type=\"search\" name=\"se\" placeholder=\"What are you looking for?\" class=\"\"required>\r\n");
      out.write("<input type=\"submit\" value=\"Search\" class=\"button\">\r\n");
      out.write("                                                        </form></li>\r\n");
      out.write(" \r\n");
      out.write("                                                ");
 
        String n=(String)session.getAttribute("name");
if(n!=null){
      out.write("<li><a data-hover=\"Welcome ");
 out.print(n);
      out.write("\"><a href=\"well.jsp\">Welcome</a> ");
 out.print(n);
      out.write("</a></li><li><a data-hover=\"Logout\" href=\"logout.jsp\">Logout</a></li>\r\n");
      out.write("        ");
  }else{
        
      out.write("\r\n");
      out.write("        <li><a href=\"ress.jsp\"  data-hover=\"Regstration\">Registration</a></li>\r\n");
      out.write("        <li><a href=\"login.jsp\" data-hover=\"Login\">Login</a></li>\r\n");
      out.write("      ");
}
      out.write("\r\n");
      out.write("                                                                      \r\n");
      out.write("\t\t\t\t\t</ul>\r\n");
      out.write("                                    \r\n");
      out.write("\t\t</div>\r\n");
      out.write("      \r\n");
      out.write("\t\t<div class=\"header-top\">\r\n");
      out.write("                    \r\n");
      out.write("                    <img class=\"img-responsive\" src=\"images/manish4.png\" width=\"600\" alt=\"\">\r\n");
      out.write("                        \r\n");
      out.write("\t\t\t<h2>About This Website</h2>\r\n");
      out.write("\t\t\t<p class=\"to-do\">This website purpose is that we want to explore some extra ordinary dishes across india. there is no website available on net which gives you the searching option in same website so we just tried for fullfill this gap, that is why  this website is unique . in this site firstly user can access the general description about recipe & user can give thier suggsetions about recipes as a guest. & if user want to publsih their recipes by thier profile so they must have an account on website.  </p>\r\n");
      out.write("\t\t\t<center>\r\n");
      out.write("</center>\r\n");
      out.write("\t\t\t<img class=\"img-responsive\" src=\"images/ar.png\" alt=\"\">\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("</div>\r\n");
      out.write("<!---->\r\n");
      out.write("\t\t\t<div class=\"content\">\r\n");
      out.write("\t\t\t\t<div class=\"container\">\r\n");
      out.write("\t\t\t\t<div class=\"content-top\">\r\n");
      out.write("\t\t\t<div class=\"content-top-grid\">\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t<div class=\"col-md-7\">\r\n");
      out.write("                                                  <div class=\"clearfix\"> </div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"col-md-6\">\r\n");
      out.write("                                                   \r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"clearfix\"> </div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"content-top-grid\">\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t<div class=\"col-md-7\">\r\n");
      out.write("\t\t\t\t\t\t\t<a href=\"jale.jsp\"><img class=\"img-responsive\" src=\"images/food14.PNG\" alt=\"\"></a>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("                                                       \r\n");
      out.write("                                                       \r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("                            \r\n");
      out.write("                      \r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("                                                    <a href=\"jale.jsp\">\r\n");
      out.write("                                                    <div class=\"col-md-5 content-top-at \">    \r\n");
      out.write("                                                        <h3>INDIAN    JALEBI    RECIPES</h3></a>\r\n");
      out.write("\t\t\t\t\t\t\t<p>Jalebi is a hot favourite on any special occasion be it a birthday, wedding or festival. Jalebis though mostly eaten by themselves, can also be soaked in warm milk. </span> </p>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"clearfix\"> </div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"col-md-6\">\r\n");
      out.write("                                                   \r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"clearfix\"> </div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"content-top-grid\">\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t<div class=\"col-md-7\">\r\n");
      out.write("\t\t\t\t\t\t\t<a href=\"idli.jsp\"><img class=\"img-responsive\" src=\"images/food11.PNG\" alt=\"\"></a>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("                                            <a href=\"idli.jsp\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"col-md-5 content-top-at \">\r\n");
      out.write("                                                    <h3>INDIAN    IDLI-SAMBAR   RECIPES</h3></a>\r\n");
      out.write("\t\t\t\t\t\t\t<p>Idli is a traditional breakfast in many South Indian Households. Idli is basically a ?Steamed Rice Cake? prepared with fermented batter of Rice and Urad Dal. It is also one of the food that I grew up having </span> </p>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"clearfix\"> </div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<!---->\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("                        \r\n");
      out.write("\t\t\t\t\t<div class=\"content-bottom\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"container\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"content-top-grid\">\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t<div class=\"col-md-7\">\r\n");
      out.write("\t\t\t\t\t\t\t<a href=\"chikan.jsp\"><img class=\"img-responsive\" src=\"images/food9.PNG\" alt=\"\"></a>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("                                                    <a href=\"chikan.jsp\"\r\n");
      out.write("\t\t\t\t\t\t<div class=\"col-md-5 content-top-at \">\r\n");
      out.write("                                                            <h3>INDIAN BUTTER CHICKEN RECIPES</h3></a>\r\n");
      out.write("\t\t\t\t\t\t\t<p> Indian cooking offers a beautiful melange of herbs and spices, and if your favourite meat is chicken, then there are many lip-smacking options for you to go all out and indulge.\r\n");
      out.write("\r\n");
      out.write("Chicken cooked in fiery desi flavors is a dream come true for all non-vegetarians </span> </p>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t      \r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"clearfix\"> </div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\t\t\r\n");
      out.write("\t\t\t\t<!---->\t\t\t");
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
