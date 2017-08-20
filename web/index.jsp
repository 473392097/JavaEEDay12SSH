<%--
  Created by IntelliJ IDEA.
  User: lanouhn
  Date: 17/8/15
  Time: 16:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
  <head>
    <title>添加英雄</title>
  </head>
  <body>
  <s:form action="heroAction" namespace="/" theme="simple" method="POST">
    <s:textfield name="superHero.name" label="英雄名"/><br />
    <s:textfield name="superHero.sex" label="性别"/><br />
    <s:textfield name="superHero.price" label="价格"/><br />
    <s:submit value="添加英雄"/>
  </s:form>
  </body>
</html>
