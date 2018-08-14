<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
    <h1>Detalles del pago</h1>
    <h2>Id Emp: ${emp.empleadoId}</h2>
    <h2>Nombe: ${emp.nombre}</h2>
    <h2>Apellido: ${emp.apellido}</h2>
    <h2>Horas trabajadas: ${emp.horasTrabajadas}</h2>
    <h2>Precio por hora: ${emp.precioHora}</h2>
    <h2><font color="red">Total a pagar: ${ emp.horasTrabajadas * emp.precioHora } soles </font></h2>
    <h2></h2>
</body>
</html>