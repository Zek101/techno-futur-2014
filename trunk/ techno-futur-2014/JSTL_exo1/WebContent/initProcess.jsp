<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<p>
		<b>Vous avez renseigné les informations suivantes :</b>
	</p>
	<c:forEach var="parametre" items= "${paramValues }">
		<ul>
			<li><b><c:out value="${ parametre.key }" /></b> :</li>
			<c:forEach var="value" items="${ parametre.value }">
				<c:out value="${ value }"/>
			</c:forEach>
		</ul>
	</c:forEach>
	<p>
		<b>Vous vous nommez :</b>
	</p>
	<p>
		<c:out value="${ param.nom }"/> <c:out value="${ param.prenom}"/>
	</p>
	<p>
		<b>Vous avez visité les pays suivants :</b>
	</p>
	<p>
		<c:choose>
			<c:when test="${ !empty paramValues.pays }">
				<c:forEach var="pays" items="${ paramValues.pays }">
					<c:out value="${ pays }"/><br/>
				</c:forEach>
			</c:when>
			<c:otherwise>
				Vous n'avez pas visité de pays parmi la liste proposée.<br/>
			</c:otherwise>
		</c:choose>
	</p>
	<p>
	<c:choose>
		<c:when test="${ !empty param.autre }">
			<c:forTokens var="pays" items="${ param.autre }" delims=",">
				<c:out value="${ pays }"/><br/>
			</c:forTokens>
		</c:when>
		<c:otherwise>
			Vous n'avez pas visité d'autre pays.<br/>
		</c:otherwise>
	</c:choose>
	</p>
</body>
</html>