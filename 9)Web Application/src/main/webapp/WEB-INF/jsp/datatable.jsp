<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>This example shows jqxDataTable binding to MySQL using Spring Web MVC.</title>
    <link rel="stylesheet" href="<c:url value="/resources/css/jqx.base.css" />" type="text/css" />
    <link rel="stylesheet" href="<c:url value="/resources/css/jqx.arctic.css" />" type="text/css" />
    <script type="text/javascript" src="<c:url value="/resources/js/jquery.js" />"></script>
    <script type="text/javascript" src="<c:url value="/resources/js/jqxcore.js" />"></script>
    <script type="text/javascript" src="<c:url value="/resources/js/jqxbuttons.js" />"></script>
    <script type="text/javascript" src="<c:url value="/resources/js/jqxscrollbar.js" />"></script>
    <script type="text/javascript" src="<c:url value="/resources/js/jqxdata.js" />"></script>	
    <script type="text/javascript" src="<c:url value="/resources/js/jqxdatatable.js" />"></script>
    <script type="text/javascript">
        $(document).ready(function () {
            var source = {
                dataType: 'json',
                dataFields: [{
                    name: 'firstName',
                    type: 'string'
                }, {
                    name: 'lastName',
                    type: 'string'
                }, {
                    name: 'title',
                    type: 'string'
                }, {
                    name: 'birthDate',
                    type: 'date'
                }],
                id: 'employeeId',
                url: '${pageContext.request.contextPath}/datatable/getEmployees',
                type: 'POST',
                async: true
            };
            var dataAdapter = new $.jqx.dataAdapter(source);
            $('#dataTable').jqxDataTable({
                theme: 'arctic',
                width: 550,
                source: dataAdapter,
                columns: [{
                    text: 'First Name',
                    dataField: 'firstName',
                    width: 100
                }, {
                    text: 'Last Name',
                    dataField: 'lastName',
                    width: 100
                }, {
                    text: 'Title',
                    dataField: 'title',
                    width: 180
                }, {
                    text: 'Birth Date',
                    dataField: 'birthDate',
                    cellsFormat: 'd',
                    align: 'right',
                    cellsAlign: 'right'
                }]
            });
        });
    </script>
</head>
<body>
    <div id="dataTable"></div>
</body>
</html>