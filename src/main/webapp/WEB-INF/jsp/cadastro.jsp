<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>App SDI Manhã</title>
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
</head>
<body>

	<div class="container">
		<h3>Tela CADASTRO!!!</h3>
		<a href="/">Voltar</a>
		
		<form action="/pessoa/incluir" method="post">
		    <div class="form-group">		
			<label>Informe o seu nome</label>
			<input type="text" class="form-control" name="nome">
			</div>
			
		    <div class="form-group">		
			<label>Informe o seu e-mail</label>
			<input type="email" class="form-control" name="email">
			</div>
						
		    <div class="form-group">		
			<label>Informe o seu salário</label>
			<input type="text" class="form-control" name="salario">
			</div>

		    <div class="form-group">		
			<label>Informe a quantidade de meses</label>
			<input type="text" class="form-control" name="qtdeMeses">
			</div>

			<button type="submit">Gravar</button>
		
		</form>	
	</div>
		
</body>
</html>