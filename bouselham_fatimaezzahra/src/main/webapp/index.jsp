<%@page import="com.web.TestEtudiant"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.0/dist/css/bootstrap.min.css">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/js/bootstrap.bundle.min.js"></script>
<meta charset="ISO-8859-1">
<title>Authentification</title>
<style>
.border{
		padding:20px;
		margin-top:50px;
}
.title{
	color:gray;
	text-align:center;
	}
</style>

</head>
<body>
 
<div class="container border spacer col-md-6 col-xs-12 col-md-offset-3">
<h3 class="title">Authentification</h3>

<form action="serve" method="post" class="was-validated">
  <div class="form-group">
    <label for="uname">Email:</label>
    <input type="text" class="form-control" id="uname" placeholder="entrer votre email..." name="login" required>
    <div class="valid-feedback">Valid.</div>
    <div class="invalid-feedback">Please fill out this field.</div>
  </div>
  <div class="form-group">
    <label for="pwd">Mot de passe:</label>
    <input type="password" class="form-control" id="pwd" placeholder="Entrer password" name="password" required>
    <div class="valid-feedback">Valid.</div>
    <div class="invalid-feedback">Please fill out this field.</div>
  </div>
  <div class="form-group form-check">
    <label class="form-check-label">
      <input class="form-check-input" type="checkbox"> Remember me
    </label>
    </div>
  <button type="submit" class="btn btn-primary">login</button>
 <a href="inscription.jsp"  class="btn btn-secondary"> s'inscrire</a>
</form>
</div>
</div>




</body>
</html>