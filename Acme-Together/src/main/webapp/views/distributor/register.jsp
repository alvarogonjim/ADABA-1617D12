<%@page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="jstl" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles"%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@taglib prefix="security"	uri="http://www.springframework.org/security/tags"%>
<%@taglib prefix="display" uri="http://displaytag.sf.net"%>
<%@taglib prefix="acme" tagdir="/WEB-INF/tags" %>



<form:form action="distributor/register.do" modelAttribute="distributor">
	<br>
	<div class="row">
		<h4><spring:message code="distributor.userAccountInfo"/></h4>
		<acme:textbox code="distributor.username" path="username"/>
		<acme:password code="distributor.password" path="password"/>
		<acme:password code="distributor.passwordConf" path="passwordCheck"/>
	</div>


	<div class="row">
		<h4><spring:message code="distributor.contactInfo"/></h4>
		<acme:textbox code="distributor.name" path="name"/>
		<acme:textbox code="distributor.surname" path="surName"/>
		<acme:textbox code="distributor.myEmail" path="email"/>
		<acme:textbox code="distributor.myPhone" path="phone"/>
	</div>
	
	
	<div class="row">
		<h4><spring:message code="distributor.personalInfo"/></h4>
		<acme:textbox code="distributor.companyName" path="companyName"/>
		<acme:textbox code="distributor.companyAddress" path="companyAddress"/>
		<acme:textbox code="distributor.vatNumber" path="vatNumber"/>
		<acme:textbox code="distributor.webPage" path="webPage"/>
			
	</div>
	

	<input id="termsOfUse" name="termsOfUse" class="filled-in" type="checkbox" value="true">
	<label for="termsOfUse">
	<spring:message code="distributor.termsOfUse.confirmation"/> 
	<a href="distributor/dataProtection.do">
		<spring:message code="distributor.termsOfUse.link" />
	</a>
	</label>
	<form:errors cssClass="error" path="termsOfUse" />
	<br>
	<br>
	<acme:submit name="save" code="distributor.accept"/>			
	<a href="welcome/index.do" class="waves-effect waves-light btn"><spring:message code="distributor.cancel" /></a>
	<br>
	<br>

	

</form:form>