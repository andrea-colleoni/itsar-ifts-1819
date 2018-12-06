<%@page import="modello.Presenza"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<jsp:include page="frammenti/stili.frammento"></jsp:include>
<style>
#tblPresenze {
	height: 450px;
	overflow: auto;
}
</style>
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
			<div id="tblPresenze" class="col-12 row">
				<table class="table table-hover table-striped col-12">
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
								<td><fmt:formatDate value="${ p.dataOraEntrata }" pattern="dd/MM/yyyy" /></td>
								<td>
									Entrata: <fmt:formatDate value="${ p.dataOraEntrata }" pattern="HH:mm" /> 
									<br>Uscita  <fmt:formatDate value="${ p.dataOraUscita }" pattern="HH:mm" /></td>
							</tr>
							<%-- } --%>
						</c:forEach>
					</tbody>
				</table>
				<p class="alert alert-primary col-12">Ho trovato ${ elencoPresenze.size() }
					presenze.</p>
			</div>
			<div class="col-xl-4 col-lg-12">
				<p class="btn btn-primary" data-toggle="modal"
					data-target="#formPresenza">Aggiungi presenza</p>
				<div class="modal fade" id="formPresenza">
					<div class="modal-dialog">
						<form action="aggiungiPresenza" method="post">
							<div class="modal-content">
								<div class="modal-header">
									<h4 class="modal-title" id="exampleModalLabel">Nuova
										presenza</h4>
									<button type="button" class="close" data-dismiss="modal"
										aria-label="Close">
										<span aria-hidden="true">&times;</span>
									</button>
								</div>
								<div class="modal-body">

									<div class="form-group row">
										<label for="studente">Studente</label> <select id="studente"
											class="form-control" name="studente">
											<option selected>Scegli...</option>
											<c:forEach var="s" items="${elencoStudenti}">
												<option value="${s.matricola}">${s.nome}
													${s.cognome}</option>
											</c:forEach>
										</select>
									</div>
									<div class="form-group row">
										<label for="registro">Registro</label> <select id="registro"
											class="form-control" name="registro">
											<option selected>Scegli...</option>
											<c:forEach var="r" items="${elencoRegistri}">
												<option value="${r.codiceCorso}">${r.titoloCorso}</option>
											</c:forEach>
										</select>
									</div>
									<div class="form-group row">
										<label for="dataOraEntrata">Data ora entrata</label>
										<div class="input-group date" id="dataOraEntrata" data-target-input="nearest">
											<input
												type="text" class="form-control datetimepicker-input" data-target="dataOraEntrata"
												placeholder="Data e ora di entrata"
												name="dataOraEntrata">
											<div class="input-group-append" data-target="#dataOraEntrata" data-toggle="datetimepicker">
						                        <div class="input-group-text"><i class="fa fa-calendar"></i></div>
						                    </div>
					                    </div>
									</div>
									<div class="form-group row">
										<label for="dataOraUscita">Data ora uscita</label> 
										<div class="input-group date" id="dataOraUscita" data-target-input="nearest">
											<input
												type="text" class="form-control datetimepicker-input" data-target="dataOraUscita"
												placeholder="Data e ora di uscita"
												name="dataOraUscita">
											<div class="input-group-append" data-target="#dataOraUscita" data-toggle="datetimepicker">
						                        <div class="input-group-text"><i class="fa fa-calendar"></i></div>
						                    </div>
					                    </div>
									</div>
									<div class="form-group">
										<label for="note">Note</label>
										<textarea class="form-control" id="note" rows="3" name="note"></textarea>
									</div>

								</div>
								<div class="modal-footer">
									<button type="submit" class="btn btn-success">Aggiungi</button>
								</div>
							</div>
						</form>
					</div>
				</div>
			</div>


		</div>
		</main>
		<footer>Copyright &copy; 2018</footer>
	</div>
	<jsp:include page="frammenti/scripts.frammento"></jsp:include>
	<script type="text/javascript">
         $(function () {
        	 $('#dataOraEntrata').datetimepicker({
                 locale: 'it',
                 icons: {
                     time: "fa fa-clock"
                 }
             });
        	 $('#dataOraUscita').datetimepicker({
                 locale: 'it',
                 icons: {
                     time: "fa fa-clock"
                 }
             });        	 
         });
     </script>
</body>
</html>