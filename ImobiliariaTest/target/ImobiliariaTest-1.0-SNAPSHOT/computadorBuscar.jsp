<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Resultado da busca</title>
  </head>
  <body>
    <h1>Usuarios cadastrados:</h1>
    <div>
      <ul>
	<c:forEach items="${usuarios}" var="user">
	  <li>
	    <h2><c:out value="${user.nome}" /></h2>
            <input type="text" value="${user.nome}">
            <input type="text" value="${user.email}">
            <input type="text" value="${user.login}">
            <input type="text" value="${user.senha}">
            <input type="text" value="${user.grupoFilial}">
            <input type="text" value="${user.departamento}">
            <input type="text" value="${user.cargo}">	    
	  </li>
	</c:forEach>
      </ul>
    </div>
  </body>
</html>
