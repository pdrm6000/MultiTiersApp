<%--
  Created by IntelliJ IDEA.
  User: pablo
  Date: 12/11/14
  Time: 21:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
    <title></title>
</head>
<body>
<h1>heyyyy</h1>
<br/>
<s:form action="create">

    <s:textfield name="todoEntity.description" label="Description" />
    <s:checkbox name="todoEntity.done" label="Is it Done ?"/>
    <s:submit/>

</s:form>
</body>
</html>
