
<%@page import="com.google.gson.Gson"%>
<%@ page language="java" 
contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

    
 <%=new Gson().toJson(request.getAttribute("result"))%>