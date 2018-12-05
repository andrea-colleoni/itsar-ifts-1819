<%@page import="modello.Presenza"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css"
	integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO"
	crossorigin="anonymous">
<link rel="stylesheet"
	href="https://use.fontawesome.com/releases/v5.5.0/css/all.css"
	integrity="sha384-B4dIYHKNBt8Bc12p+WXckhzcICo0wtJAoU8YZTY5qE0Id1GSseTk6S+L3BlXeVIU"
	crossorigin="anonymous">

</head>
<body>
	<h1>Elenco presenze</h1>
	<%-- 
<p>Ho trovato <%= ((java.util.List<modello.Presenza>)request.getAttribute("elencoPresenze")).size() %> presenze.</p>
--%>
	<p>Oggi è ${ oggi }
	<table class="table table-hover table-striped">
		<thead>
			<tr>
				<th>&nbsp;</th>
				<th>Studente</th>
				<th>Corso</th>
				<th>Data</th>
				<th>Entrata / Uscita</th>
			</tr>
		</thead>
		<tbody>
			<%-- for(Presenza p : elencoPresenze) { --%>
			<c:forEach var="p" items="${elencoPresenze}">
				<tr>
					<td>
						<div class="btn-toolbar">
							<div class="btn-group mr-2">
								<span class="far fa-trash-alt"></span>
							</div>
							<div class="btn-group mr-2">
								<span class="far fa-edit"></span>
							</div>
						</div>
					</td>
					<td>${ p.studente.nome } ${ p.studente.cognome }</td>
					<td>${ p.registro.titoloCorso }</td>
					<td>${ p.dataOraEntrata }</td>
					<td>Dalle ${ p.dataOraEntrata } alle ${ p.dataOraUscita }</td>
				</tr>
				<%-- } --%>
			</c:forEach>
		</tbody>
	</table>

	<p class="alert alert-primary">Ho trovato ${ elencoPresenze.size() }
		presenze.</p>
	<p class="btn btn-primary" data-toggle="collapse"
		data-target="#formPresenza">Aggiungi presenza</p>
	<div class="collapse" id="formPresenza">
		<div class="card card-body">
			<form action="aggiungiPresenza" method="post">
				<div class="form-group row">
					<label for="studente" class="col-sm-2 col-form-label">Studente</label>
					<div class="col-sm-10">
						<select id="studente" class="form-control" name="studente">
					        <option selected>Scegli...</option>
					        <c:forEach var="s" items="${elencoStudenti}">
					        	<option value="${s.matricola}">${s.nome} ${s.cognome}</option>
					        </c:forEach>
					    </select>
					</div>
				</div>
				<div class="form-group row">
					<label for="registro" class="col-sm-2 col-form-label">Registro</label>
					<div class="col-sm-10">
						<select id="registro" class="form-control" name="registro">
					        <option selected>Scegli...</option>
					        <c:forEach var="r" items="${elencoRegistri}">
					        	<option value="${r.codiceCorso}">${r.titoloCorso}</option>
					        </c:forEach>
					    </select>
					</div>
				</div>
				<div class="form-group row">
					<label for="dataOraEntrata" class="col-sm-2 col-form-label">Data ora entrata</label>
					<div class="col-sm-10">
						<input type="text" class="form-control" id="dataOraEntrata" 
								placeholder="Data e ora di entrata (gg/mm/aaaa hh:mm)"
								name="dataOraEntrata">
					</div>
				</div>
				<div class="form-group row">
					<label for="dataOraUscita" class="col-sm-2 col-form-label">Data ora uscita</label>
					<div class="col-sm-10">
						<input type="text" class="form-control" 
						id="dataOraUscita" 
						placeholder="Data e ora di uscita (gg/mm/aaaa hh:mm)"
						name="dataOraUscita">
					</div>
				</div>
				<div class="form-group">
					<label for="note">Note</label>
					<textarea class="form-control" id="note" rows="3" name="note"></textarea>
				</div>
				<div class="form-group row">
					<div class="col-sm-10">
						<button type="submit" class="btn btn-success">Aggiungi</button>
					</div>
				</div>
			</form>
		</div>
	</div>




	<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"
		integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo"
		crossorigin="anonymous"></script>
	<script
		src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js"
		integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49"
		crossorigin="anonymous"></script>
	<script
		src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js"
		integrity="sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy"
		crossorigin="anonymous"></script>
</body>
</html>