package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.lang.*;
import java.math.*;
import db.*;
import java.sql.*;
import java.io.*;
import java.util.*;

public final class RezultateAnalize_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html; charset=UTF-8");
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
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "Formular.jsp", out, true);
      out.write("\n");
      out.write("    <body>\n");
      out.write("        Hello\n");
      out.write("       \n");
      out.write("        ");

        double glucoza = Double.parseDouble(request.getParameter("glucoza"));
        double colesterol = Double.parseDouble(request.getParameter("colesterol"));
        double ldl = Double.parseDouble(request.getParameter("ldl"));
        double hdl =Double.parseDouble( request.getParameter("hdl"));
        double trigliceride = Double.parseDouble(request.getParameter("trigliceride"));
        double fibrogen = Double.parseDouble(request.getParameter("fibrogen"));
        double hemoglobina = Double.parseDouble(request.getParameter("hemoglobina"));
        double tsh = Double.parseDouble(request.getParameter("tsh"));
        double dhea = Double.parseDouble(request.getParameter("dhea"));
        double psa = Double.parseDouble(request.getParameter("psa"));
        double homocisteina = Double.parseDouble(request.getParameter("homocisteina"));
        double proteina = Double.parseDouble(request.getParameter("proteina"));
        double testosteron = Double.parseDouble(request.getParameter("testosteron"));
        double estradiol = Double.parseDouble(request.getParameter("estradiol"));
        if(glucoza !=null){
        
      out.write("\n");
      out.write("         <p>Datele au fost adaugate.</p>\n");
      out.write("        \n");
      out.write("        ");
 } else{
      out.write("\n");
      out.write("        \n");
      out.write("     <p>Datele NU au fost adaugate.</p>\n");
      out.write("     ");
 }
      out.write("\n");
      out.write("       \n");
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
