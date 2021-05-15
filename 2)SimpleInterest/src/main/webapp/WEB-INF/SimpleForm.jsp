<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<body>
<form action="/MVC2SimpleInterest/resultForm.html" method="post">
<center>
<h1>Simple Interest Form</h1>
<table>
<tr>
<td>Principal Amount</td>
<td><input type="text" name="pValue"/>Enter less than 100000</td>
</tr>
<tr>
<td>Rate in Percentage</td>
<td><input type="text" name="rate"/></td>
</tr>
<tr>
<td>Time in Years</td>
<td><label for="time"></label>
<select name="time" id="time">
<option value="0">Select Years</option>
<option value="1">1</option>
<option value="2">2</option>
<option value="3">3</option>
<option value="4">4</option>
<option value="5">5</option>
</select>
</td>
</tr>
</table>
<br>
<input type="submit" value="Get Simple Interest"/>
</form>
</center>
</body>
</html>
