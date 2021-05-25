<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.0/dist/css/bootstrap.min.css">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/js/bootstrap.bundle.min.js"></script>
<title>Insert title here</title>
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
<h3 class="title">Inscription</h3>

<form action="serveadd" method="post" class="was-validated">
  <div class="form-group">
    <label for="uname">Nom:</label>
    <input type="text" class="form-control" id="name" placeholder="entrer votre nom..." name="nom" required>
    <div class="valid-feedback">Valid.</div>
    <div class="invalid-feedback">Please fill out this field.</div>
  </div>
    <div class="form-group">
  
      <label for="uname">prénom:</label>
  <input type="text" class="form-control" id="prenom" placeholder="entrer votre prénom..." name="prenom" required>
    <div class="valid-feedback">Valid.</div>
    <div class="invalid-feedback">Please fill out this field.</div>
  </div>
    <div class="form-group">
  
      <label for="uname">age:</label>
  <input type="number" class="form-control" id="age" placeholder="entrer votre age..." name="age" required>
    <div class="valid-feedback">Valid.</div>
    <div class="invalid-feedback">Please fill out this field.</div>
  </div>
  	  <div class="form-group">
  	
      <label for="uname">login:</label>
  <input type="text" class="form-control" id="log" placeholder="entrer votre login..." name="login" required>
    <div class="valid-feedback">Valid.</div>
    <div class="invalid-feedback">Please fill out this field.</div>
  </div>
  <div class="form-group">
    <label for="pwd">Mot de passe:</label>
    <input type="password" class="form-control" id="pwd" placeholder="Entrer password..." name="password" required>
    <div class="valid-feedback">Valid.</div>
    <div class="invalid-feedback">Please fill out this field.</div>
  </div>
  <div class="form-group form-check">
    <label class="form-check-label">
      <input class="form-check-input" type="checkbox"> Remember me
    </label>
    </div>
  <button type="submit" class="btn btn-primary">valider</button>
</form>
</div>




</body>
</html>