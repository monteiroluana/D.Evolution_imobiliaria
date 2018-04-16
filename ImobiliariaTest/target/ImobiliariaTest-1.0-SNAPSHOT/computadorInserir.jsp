<%-- 
    Document   : computador
    Created on : 06/04/2018, 15:04:48
    Author     : Jhonan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Usuario <%=request.getAttribute("nome")%></title>
    </head>
    <body>
        <h1>Seja bem vindo <%=request.getAttribute("nome")%></h1>
        <table>
            <tr>
                <td>
                    Usuário: <%=request.getAttribute("nome")%>
                </td>
                <td>
                    Email: <%=request.getAttribute("email")%>
                </td>
                <td>
                    Login: <%=request.getAttribute("login")%>
                </td>
            </tr>

        </table>
        <p><%=request.getAttribute("situacao")%></p>        
    </body>
</html>
