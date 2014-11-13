<%--
  Created by IntelliJ IDEA.
  User: pablo
  Date: 25/08/14
  Time: 18:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
  <head>
    <title></title>
  </head>
  <body>
    <h1>Test</h1>
    <a href="/todo">Link to TODO</a>
    <a href="/new">New TODO</a>
    <ul>
        <s:iterator value="todoCollection">
            <li><s:property value="description"/></li>
        </s:iterator>
    </ul>
  </body>
</html>
