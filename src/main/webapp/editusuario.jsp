<%@page import="com.conexaoSQL.dao.UsuarioDao"%>
<jsp:useBean id="u" class="com.conexaoSQL.bean.Usuario"></jsp:useBean>
<jsp:setProperty property="*" name="u"/>

<%
int i = UsuarioDao.updateUsuario(u);
response.sendRedirect("viewusuarios.jsp");
%>