<%-- 
    Document   : Formular
    Created on : Mar 15, 2019, 4:20:18 PM
    Author     : Miruna
--%>

<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page language="java" import="java.lang.*,java.math.*,db.*,java.sql.*, java.io.*, java.util.*"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <jsp:useBean id="jb" scope="session" class="db.JavaBean" />
    <jsp:setProperty name="jb" property="*" />
    <body>
        <h1>Formular pacienti (date personale + formular analize)</h1>
        <%
            jb.connect();
            String idpacient  = request.getParameter("idpacient");
            String glucoza = request.getParameter("glucoza");
            String colesterol = request.getParameter("colesterol");
            String ldl = request.getParameter("ldl");
            String hdl = request.getParameter("hdl");
            String trigliceride = request.getParameter("trigliceride");
            String fibrogen = request.getParameter("fibrogen");
            String hemoglobina = request.getParameter("hemoglobina");
            String tsh = request.getParameter("tsh");
            String dhea = request.getParameter("dhea");
            String psa = request.getParameter("psa");
            String homocisteina = request.getParameter("homocisteina");
            String proteina = request.getParameter("proteina");
            String testosteron = request.getParameter("testosteron");
            String estradiol = request.getParameter("estradiol");
            if (idpacient != null) {
                jb.connect();
                jb.adaugaAnalize(Integer.parseInt(idpacient), Integer.parseInt(glucoza), Integer.parseInt(colesterol), Integer.parseInt(ldl) ,
                        Integer.parseInt(hdl), Integer.parseInt(trigliceride), Integer.parseInt(fibrogen),
                        Integer.parseInt(hemoglobina), Integer.parseInt(tsh),Integer.parseInt(dhea), Integer.parseInt(psa),
                        Integer.parseInt(homocisteina), Integer.parseInt(proteina),Integer.parseInt(testosteron), Integer.parseInt(estradiol));
            jb.disconnect();
        %>
        <p>Datele au fost adaugate cu succes.
          <a class="nav-link mx-2" href="Verdict.jsp">Vizualizeaza-ti rezultatul</a> 
        
        </p>
        <p><a class="nav-link mx-2" href="index.html">Inapoi la pagina principala</a></p>
        <%
            }else{
        %>
        <p><a class="nav-link mx-2" href="index.html">Inapoi la pagina principala</a></p>
        <form action="Formular.jsp" method="post">
            <table>
                <tr>
                    <td align="right">Id:</td>
                    <td> <input type="text" name="idpacient" size="45" /></td>
                </tr>
                <tr>
                    <td align="right">Glucoza [mg/dL]:</td>
                    <td> <input type="text" name="glucoza" size="45" /></td>
                </tr>
                <tr>
                    <td align="right">Colesterol [mg/dL]:</td>
                    <td> <input type="text" name="colesterol" size="45" /></td>
                </tr>
                <tr>
                    <td align="right">Ldl [mg/dL]:</td>
                    <td> <input type="text" name="ldl" size="45" /></td>
                </tr>
                <tr>
                    <td align="right">Hdl [mg/dL]:</td>
                    <td> <input type="text" name="hdl" size="45" /></td>
                </tr>
                <tr>
                    <td align="right">Trigliceride [mg/dL]:</td>
                    <td> <input type="text" name="trigliceride" size="45" /></td>
                </tr>
                <tr>
                    <td align="right">Fibrogen [mg/dL]:</td>
                    <td> <input type="text" name="fibrogen" size="45" /></td>
                </tr>
                <tr>
                    <td align="right">Hemoglobina [%]:</td>
                    <td> <input type="text" name="hemoglobina" size="45" /></td>
                </tr>
                <tr>
                    <td align="right">TSH [mU/dL]:</td>
                    <td> <input type="text" name="tsh" size="45" /></td>
                </tr>
                <tr>
                    <td align="right">Dhea: [ug/dL]</td>
                    <td> <input type="text" name="dhea" size="45" /></td>
                </tr>
                <tr>
                    <td align="right">PSA</td>
                    <td> <input type="text" name="psa" size="45" placeholder="MEN ONLY" /></td>
                </tr>
                <tr>
                    <td align="right">Homocisteina [umol/L]</td>
                    <td> <input type="text" name="homocisteina" size="45" /></td>
                </tr>
                <tr>
                    <td align="right">Proteina C-Reactiva [mg/L]</td>
                    <td> <input type="text" name="proteina" size="45" /></td>
                </tr>
                <tr>
                    <td align="right">Testosteron [pg/mL]</td>
                    <td> <input type="text" name="testosteron" size="45" /></td>
                </tr>
                <tr>
                    <td align="right">Estradiol [pg/mL]</td>
                    <td> <input type="text" name="estradiol" size="45" /></td>
                </tr>
            </table>
            <input type="submit" action="Formular.jsp" value="Adauga analizele" />
        </form>
        
        <%
            }
        %>
        
    </body>
</html>