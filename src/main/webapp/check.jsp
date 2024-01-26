<%@page import="com.conexaoSQL.dao.LoginDao"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Autentifica Login</title>
</head>
<body>
<% 	   
	   LoginDao us = new LoginDao(); 
	   String email = request.getParameter("email");
	   String password = request.getParameter("password");
	   boolean status = us.verificarUsuario(email,password);
	  
	   if(us.result == true){
		   out.println("Login feito com sucesso" + us.nome);
	   }else{
		   out.println("Login ou senha inválidos"); 
	   }
%>


</body>
</html>