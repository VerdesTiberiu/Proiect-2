<%-- 
    Document   : Pacienti
    Created on : Mar 4, 2019, 8:56:20 PM
    Author     : Tibi
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page language="java" import="java.lang.*,java.math.*,db.*,java.sql.*, java.io.*, java.util.*"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
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
            
            String nume = request.getParameter("nume");
            String prenume = request.getParameter("prenume");
            String sex = request.getParameter("sex");
            String varsta = request.getParameter("varsta");
            String email = request.getParameter("email");
            String adresa = request.getParameter("adresa");
            if (nume != null && prenume != null &&  sex != null  && varsta != null) {
                jb.connect();
                jb.adaugaPacient(nume, prenume, sex , Integer.parseInt(varsta), email, adresa);
                jb.disconnect();
   %>
        
        <p>Datele au fost adaugate. Aveti ID-ul :
             <%
                    jb.connect();
                    ResultSet rs = jb.ExtractLastIndexPacient();
                    
                    while (rs.next()) {
                                       %>
                <tr>
                    <td><%= rs.getString("idpacient")%></td>
                   
                   
                    <%
                        }
                    %>
                </tr>
            </table><br/>
        </form>
        <%
            rs.close();
            jb.disconnect();
        %>
        <br/>
            
        </p>
        
         <p> <a href = "Formular1.jsp">Mergi catre formular</a></p>
       
        <p><a class="nav-link mx-2" href="index.html">Inapoi la pagina principala</a></p>
        <form action="Pacienti1.jsp" method="post">
            <table>
                <tr>
                    <td align="right">Nume:</td>
                    <td> <input type="text" name="nume" size="45" /></td>
                </tr>
                <tr>
                    <td align="right">Prenume:</td>
                    <td> <input type="text" name="prenume" size="45" /></td>
                </tr>
                <tr>
                    <td align="right">Sex:</td>
                    <td> <input type="text" name="sex" size="45" /></td>
                </tr>
                <tr>
                    <td align="right">Varsta:</td>
                    <td> <input type="text" name="varsta" size="45" /></td>
                </tr>
                <tr>
                    <td align="right">Email:</td>
                    <td> <input type="text" name="email" size="45" /></td>
                </tr>
                <tr>
                    <td align="right">Adresa:</td>
                    <td> <input type="text" name="adresa" size="45" /></td>
                </tr>
            </table>
            <input type="submit" value="Adauga pacient" />
        </form>
        
        <%
             }
        %>
        
    </body>
</html>
