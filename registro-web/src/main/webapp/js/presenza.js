/**
 * 
 */
$.ajax({
    url: '../elencoStudenti',
    method: 'get'
})
.done((studenti) => {
    studenti.forEach(st => {
        console.log(st);
        $('#studente')
            .append('<option value="' + st.matricola + '">' + 
            st.nome + ' ' + st.cognome + '</option>');
    });
});

$.ajax({
    url: '../elencoCorsi',
    method: 'get'
})
.done((corsi) => {
    corsi.forEach(c => {
        $('#registro')
            .append('<option value="' + c.codiceCorso + '">' + 
            c.titoloCorso + '</option>');
    });
});
// event handling con jQuery (evento click)
$('#btnAggiungi').click(() => {
    console.log('stai per aggiungere una presenza');
    $.ajax({
        url: '../aggiungiPresenza',
        method: 'post',
        data: JSON.stringify({
            codicePresenza: 0,
            idStudente: $('#studente').val(),
            idRegistro: $('#registro').val(),
            dataOraEntrata: $('#dtDataOraEntrata').val(),
            dataOraUscita: $('#dtDataOraUscita').val(),
            note: $('#note').val()
        }),
        contentType: 'application/json'
    });
});