console.log(document);
var par = document.getElementById('par1');
console.log(par);
console.log(par.innerHTML);
par.innerHTML = 'Ho cambiato il contenuto del paragrafo';
document.write('<p>Questo è un nuovo paragrafo</p>');

function scriviValoreDelCampo() {
     // versione vanilla JS
    /*
    var campo = document.getElementById('campo');
    console.log(campo.value);
    */
   console.log($('#campo').val());
}

function entra() {
    // versione vanilla JS
    /*
    var intest = document.getElementById('intest');
    intest.innerHTML = 'DOCUMENT IN JS';
    */
   // in jquery per individuare un elment nel DOM si usano i selettori CSS
   $('#intest').html('DOCUMENT IN JS');
}
function esci() {
    // versione vanilla JS
    /*
    var intest = document.getElementById('intest');
    intest.innerHTML = 'Documenti in JS';
    */
   $('#intest').html('Document in JS');
}


// sovrascrittura della funzione alert() di window
function alert() {
    console.log('ha ha ha!!!');
}
