<%@ page isELIgnored="false" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>


<html>
<body>

	<h2><c:out value ="${name}"/></h2>
	<c:import var = "data1" url = "http://localhost:8082/test/1"/>
	<c:import var = "data2" url = "http://localhost:8082/test/2"/>
	<c:import var = "data3" url = "http://localhost:8082/test/3"/>
	<c:import var = "data4" url = "http://localhost:8082/test/4"/>
	<p><c:out value = "${data1}"/></p>
	<p><c:out value = "${data2}"/></p>
	<p><c:out value = "${data3}"/></p>
	<p><c:out value = "${data4}"/></p>

</body>
</html>