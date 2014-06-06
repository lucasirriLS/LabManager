<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="f" uri="http://java.sun.com/jsf/core"%>
<%@ taglib prefix="h" uri="http://java.sun.com/jsf/html"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Dettaglio Laboratorio</title>
</head>
<body>
	<f:view>
	<h:form>
			
<!-- 			Gestione Laboratori -->
<!-- 			<br/> -->
<!-- 			Ricerche -->
<%-- 			<h:commandButton value="Click Me" type="button" /> --%>
			
			<br/>
			Laboratorio : <h:outputText value="#{labDettaglio.lab.title }"/>
			<h:dataTable value="#{labDettaglio.lab.partecipant1 }" var="rover">
				<h:column>
					<f:facet name="header">Nome Partecipante</f:facet>
    				 <h:outputText value="#{rover.name }"/> 
    			</h:column>
				
			</h:dataTable>
			
			
		</h:form>
	</f:view>
</body>
</html>