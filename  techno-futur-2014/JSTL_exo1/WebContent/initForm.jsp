<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form method="post" action="initProcess.jsp">
		<p>
			<label for="nom">Entrez ici votre nom de famille :</label><br /> 
			<input type="text" name="nom" id="nom" tabindex="10" />
		</p>
		<p>
			<label for="prenom">Entrez ici votre pr�nom :</label><br /> 
			<input type="text" name="prenom" id="prenom" tabindex="20" />
		</p>
		<p>
			<label for="pays">Dans quel(s) pays avez-vous d�j� voyag� ?</label><br />
			<select name="pays" id="pays" multiple="multiple" tabindex="30">
				<option value="France">France</option>
				<option value="Espagne">Espagne</option>
				<option value="Italie">Italie</option>
				<option value="Royaume-uni">Royaume-Uni</option>
				<option value="Canada">Canada</option>
				<option value="Etats-unis">Etats-Unis</option>
				<option value="Chine">Chine</option>
				<option value="Japon">Japon</option>
			</select>
		</p>
		<p>
			<label for="autre">Entrez ici les autres pays que vous avez visit�s, s�par�s par une virgule :</label><br />
			<textarea id="autre" name="autre" rows="2" cols="40" tabindex="40" placeholder="Ex: Norv�ge, Chili, Nouvelle-Z�lande"></textarea>
		</p>
		<p>
			<input type="submit" value="Valider" /> <input type="reset"
				value="Remettre � z�ro" />
		</p>
	</form>
</body>
</html>