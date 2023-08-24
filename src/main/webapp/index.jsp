<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Hibernate Inheritence</title>
</head>
<body>
  <h3>Inheritence - Type1</h3>
  <form action="AddEmployee" method="post">
    <h3>Employee</h3>
    <table>
      <tr>
        <td style="width:100px">Emp ID</td>
        <td> <input type="text" name="id" />  </td>
      </tr>
      <tr>
        <td style="width:100px">Emp Name</td>
        <td> <input type="text" name="name" />  </td>
      </tr>
    </table>
    <h3>Regular Employee</h3>
    <table>
      <tr>
        <td style="width:100px">Emp ID</td>
        <td> <input type="text" name="rid" />  </td>
      </tr>
      <tr>
        <td style="width:100px">Emp Name</td>
        <td> <input type="text" name="rname" />  </td>
      </tr>
      <tr>
        <td style="width:100px">Emp Salary</td>
        <td> <input type="text" name="salary" />  </td>
      </tr>
      <tr>
        <td style="width:100px">Emp Bonus</td>
        <td> <input type="text" name="bonus" />  </td>
      </tr>
    </table>
    <h3>Contract Employee</h3>
    <table>
      <tr>
        <td style="width:100px">Emp ID</td>
        <td> <input type="text" name="cid" />  </td>
      </tr>
      <tr>
        <td style="width:100px">Emp Name</td>
        <td> <input type="text" name="cname" />  </td>
      </tr>
      <tr>
        <td style="width:100px">Pay/Hour</td>
        <td> <input type="text" name="payperhour" />  </td>
      </tr>
      <tr>
        <td style="width:100px">Duration</td>
        <td> <input type="text" name="duration" />  </td>
      </tr>
    </table>
    <input type="submit" value="SAVE" />
  </form>
</body>
</html>