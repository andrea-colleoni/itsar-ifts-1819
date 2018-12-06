<%@page import="modello.Presenza"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<jsp:include page="frammenti/stili.frammento"></jsp:include>
</head>
<body>
<jsp:include page="frammenti/menu.html"></jsp:include>
<div class="container">
	<header>
		<h1>Elenco presenze</h1>
		<p>Oggi è ${ oggi }</p>
	</header>
	<main class="container">
		<div class="row">
			<table class="table table-hover table-striped col-xl-8 col-lg-12">
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
			<div class="col-xl-4 col-lg-12">
				<p class="btn btn-primary" data-toggle="collapse"
					data-target="#formPresenza">Aggiungi presenza</p>
				<div class="collapse" id="formPresenza">
					<div class="card card-body">
						<form action="aggiungiPresenza" method="post">
							<div class="form-group row">
								<label for="studente">Studente</label>
								<select id="studente" class="form-control" name="studente">
							        <option selected>Scegli...</option>
							        <c:forEach var="s" items="${elencoStudenti}">
							        	<option value="${s.matricola}">${s.nome} ${s.cognome}</option>
							        </c:forEach>
							    </select>
							</div>
							<div class="form-group row">
								<label for="registro">Registro</label>
								<select id="registro" class="form-control" name="registro">
							        <option selected>Scegli...</option>
							        <c:forEach var="r" items="${elencoRegistri}">
							        	<option value="${r.codiceCorso}">${r.titoloCorso}</option>
							        </c:forEach>
							    </select>
							</div>
							<div class="form-group row">
								<label for="dataOraEntrata">Data ora entrata</label>
								<input type="text" class="form-control" id="dataOraEntrata" 
										placeholder="Data e ora di entrata (gg/mm/aaaa hh:mm)"
										name="dataOraEntrata">
							</div>
							<div class="form-group row">
								<label for="dataOraUscita">Data ora uscita</label>
								<input type="text" class="form-control" 
									id="dataOraUscita" 
									placeholder="Data e ora di uscita (gg/mm/aaaa hh:mm)"
									name="dataOraUscita">
							</div>
							<div class="form-group">
								<label for="note">Note</label>
								<textarea class="form-control" id="note" rows="3" name="note"></textarea>
							</div>
							<div class="form-group row">
								<button type="submit" class="btn btn-success">Aggiungi</button>
							</div>
						</form>
					</div>
				</div>	
			</div>
			
				
		</div>
		<p class="alert alert-primary col-8">Ho trovato ${ elencoPresenze.size() }
			presenze.</p>
		
		
	</main>
	<footer>Copyright &copy; 2018</footer>
</div>
<jsp:include page="frammenti/scripts.frammento"></jsp:include>
</body>
</html>