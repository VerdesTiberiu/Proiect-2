<%-- 
    Document   : Medici
    Created on : Mar 4, 2019, 8:56:10 PM
    Author     : Tibi
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page language="java" import="java.lang.*,java.math.*,db.*,java.sql.*, java.io.*, java.util.*"%>
<jsp:useBean id="jb" scope="session" class="db.JavaBean" />
<jsp:setProperty name="jb" property="*" /><!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title> Medic - login </title>
    </head>
    <h1 align="center"> Aici va fi pagina de medici - dupa login, un medic poate vedea tabela cu toti pacientii care s-au programat la el</h1>
    <body>
            <table border="1" align="center">
                <tr>
                    <td><b>Nume:</b></td>
                    <td><b>Prenume:</b></td>
                    <td><b>Sex:</b></td>
                    <td><b>Varsta:</b></td>
                    <td><b>Email:</b></td>
                    <td><b>Adresa:</b></td>

                </tr>
                <%
                    jb.connect();
                    ResultSet rs = jb.vedeTabela("pacient");
                    long x;
                    while (rs.next()) {
                        x = rs.getInt("idpacient");
                %>
                <tr>
                    
                    <td><%= rs.getString("nume")%></td>
                    <td><%= rs.getString("prenume")%></td>
                    <td><%= rs.getString("sex")%></td>
                    <td><%= rs.getString("varsta")%></td>
                    <td><%= rs.getString("email")%></td>
                    <td><%= rs.getString("adresa")%></td>
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
           <p><a class="nav-link mx-2" href="#.html">LOG IN</a></p>
        <br/>
    </body>
</html>
