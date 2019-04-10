package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Formular_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        \n");
      out.write("  <meta charset=\"utf-8\">\n");
      out.write("  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("  <!-- PAGE settings -->\n");
      out.write("  <link rel=\"icon\" href=\"https://templates.pingendo.com/assets/Pingendo_favicon.ico\">\n");
      out.write("  <title>Checkout</title>\n");
      out.write("  <meta name=\"description\" content=\"Wireframe design of a checkout form by Pingendo\">\n");
      out.write("  <meta name=\"keywords\" content=\"Pingendo bootstrap example template wireframe checkout form\">\n");
      out.write("  <meta name=\"author\" content=\"Pingendo\">\n");
      out.write("  <!-- CSS dependencies -->\n");
      out.write("  <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\" type=\"text/css\">\n");
      out.write("  <link rel=\"stylesheet\" href=\"wireframe.css\">\n");
      out.write("\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body class=\"bg-light\" >\n");
      out.write("        <div class=\"py-5\">\n");
      out.write("    <div class=\"container\">\n");
      out.write("      <div class=\"row\">\n");
      out.write("        <div class=\"text-center col-md-7 mx-auto\"> <i class=\"fa d-block fa-bullseye fa-5x mb-4 text-info\"></i>\n");
      out.write("          <h2>Interpreteaza-ti analizele !</h2>\n");
      out.write("          <p class=\"lead\">[.......]</p>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("  <div class=\"\">\n");
      out.write("    <div class=\"container\">\n");
      out.write("      <div class=\"row\">\n");
      out.write("        <div class=\"col-md-12 order-md-1\">\n");
      out.write("          <h4 class=\"mb-3\"><b>Formular analize</b></h4>\n");
      out.write("          <form class=\"needs-validation\" novalidate=\"\">\n");
      out.write("            <div class=\"mb-3\">\n");
      out.write("              <div class=\"input-group\">\n");
      out.write("                <div class=\"invalid-feedback\" style=\"width: 100%;\"> Your username is required. </div>\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"mb-3\">\n");
      out.write("              <div class=\"invalid-feedback\"> Please enter a valid email address for shipping updates. </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"form-group row\"><label class=\"col-2\">Glucoza&nbsp;&nbsp; [mg/dL]</label>\n");
      out.write("              <div class=\"col-10\"><input type=\"text\" class=\"form-control\"  name=\"glucoza\" id=\"address2\"></div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"form-group row\"><label class=\"col-2\">Colosterol&nbsp;&nbsp; [mg/dL]</label>\n");
      out.write("              <div class=\"col-10\"><input type=\"text\" class=\"form-control\"  name=\"colesterol\" id=\"address2\"></div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"form-group row\"><label class=\"col-2\">LDL&nbsp; [mg/dL]</label>\n");
      out.write("              <div class=\"col-10\"><input type=\"text\" class=\"form-control\"  name=\"ldl\" id=\"address2\"></div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"form-group row\"><label class=\"col-2\">HDL&nbsp;&nbsp; [mg/dL]</label>\n");
      out.write("              <div class=\"col-10\"><input type=\"text\" class=\"form-control\"  name=\"hdl\" id=\"address2\"></div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"form-group row\"><label class=\"col-2\">Trigliceride&nbsp;&nbsp; [mg/dL]</label>\n");
      out.write("              <div class=\"col-10\"><input type=\"text\" class=\"form-control\"  name=\"trigliceride\" id=\"address2\"></div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"form-group row\"><label class=\"col-2\">Fibrogen&nbsp;&nbsp; [mg/dL]</label>\n");
      out.write("              <div class=\"col-10\"><input type=\"text\" class=\"form-control\"  name=\"fibrogen\" id=\"address2\"></div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"form-group row\"><label class=\"col-2\">Hemoglobina A1C [%]&nbsp;</label>\n");
      out.write("              <div class=\"col-10\"><input type=\"text\" class=\"form-control\"  name=\"hemoglobina\" id=\"address2\"></div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"form-group row\"><label class=\"col-2\">TSH&nbsp; [mU/L]</label>\n");
      out.write("              <div class=\"col-10\"><input type=\"text\" class=\"form-control\"  name=\"tsh\" id=\"address2\"></div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"form-group row\"><label class=\"col-2\">DHEA&nbsp; [µg/dL]</label>\n");
      out.write("              <div class=\"col-10\"><input type=\"text\" class=\"form-control\"  name=\"dhea\" id=\"address2\"></div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"form-group row\"><label class=\"col-2\">PSA&nbsp;</label>\n");
      out.write("              <div class=\"col-10\"><input type=\"text\" class=\"form-control\"  name=\"psa\" id=\"address2\" placeholder=\"Men ONLY\"></div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"form-group row\"><label class=\"col-2\">Homocisteina&nbsp; [µmol/L]</label>\n");
      out.write("              <div class=\"col-10\"><input type=\"text\" class=\"form-control\"  name=\"homocisteina\" id=\"address2\"></div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"form-group row\"><label class=\"col-2\">Proteina C-Reactiva[mg/L]<br><br></label>\n");
      out.write("              <div class=\"col-10\"><input type=\"text\" class=\"form-control\"  name=\"proteina\" id=\"address2\"></div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"form-group row\"><label class=\"col-2\">Testosteron&nbsp; [pg/mL]</label>\n");
      out.write("              <div class=\"col-10\"><input type=\"text\" class=\"form-control\"  name=\"testosteron\" id=\"address2\"></div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"form-group row\"><label class=\"col-2\">Estradiol&nbsp; [ pg/mL]</label>\n");
      out.write("              <div class=\"col-10\"><input type=\"text\" class=\"form-control\"  name=\"estradiol\" id=\"address2\"></div>\n");
      out.write("            </div>\n");
      out.write("            <hr class=\"mb-4\">\n");
      out.write("            <hr class=\"mb-4\">\n");
      out.write("            <div class=\"form-group row\">\n");
      out.write("              <div class=\"col-10 col-md-6\"></div>\n");
      out.write("              <div class=\"col-md-6\"><a class=\"btn btn-secondary\" href=\"RezultateAnalize.jsp\">VERIFICA ACUM!&nbsp;</a></div>\n");
      out.write("            </div>\n");
      out.write("          </form>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("  <div class=\"py-5 text-muted text-center\">\n");
      out.write("    <div class=\"container\">\n");
      out.write("      <div class=\"row\">\n");
      out.write("        <div class=\"col-md-12 my-4\">\n");
      out.write("          <p class=\"mb-1\" contenteditable=\"true\">© 2018-2019 Clinica Online dezvoltata de Verdes &amp; Dutu<br></p>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("  <script src=\"https://code.jquery.com/jquery-3.3.1.slim.min.js\" integrity=\"sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo\" crossorigin=\"anonymous\"></script>\n");
      out.write("  <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js\" integrity=\"sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49\" crossorigin=\"anonymous\"></script>\n");
      out.write("  <script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js\" integrity=\"sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy\" crossorigin=\"anonymous\"></script>\n");
      out.write("  <script src=\"assets/js/validation.js\" style=\"\"></script>\n");
      out.write("  <pingendo onclick=\"window.open('https://pingendo.com/', '_blank')\" style=\"cursor:pointer;position: fixed;bottom: 20px;right:20px;padding:4px;background-color: #00b0eb;border-radius: 8px; width:220px;display:flex;flex-direction:row;align-items:center;justify-content:center;font-size:14px;color:white\">Made with Pingendo Free&nbsp;&nbsp;<img src=\"https://pingendo.com/site-assets/Pingendo_logo_big.png\" class=\"d-block\" alt=\"Pingendo logo\" height=\"16\"></pingendo>\n");
      out.write("\n");
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
