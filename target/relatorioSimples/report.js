$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Post.feature");
formatter.feature({
  "line": 1,
  "name": "Consulta de precos",
  "description": "",
  "id": "consulta-de-precos",
  "keyword": "Feature"
});
formatter.before({
  "duration": 2272371300,
  "status": "passed"
});
formatter.scenario({
  "line": 2,
  "name": "Consultar Ovo de Pascoa",
  "description": "",
  "id": "consulta-de-precos;consultar-ovo-de-pascoa",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 3,
  "name": "que acesso a Wikipedia",
  "keyword": "Given "
});
formatter.step({
  "line": 4,
  "name": "pesquiso palavra por \"Ovo de Páscoa\"",
  "keyword": "When "
});
formatter.step({
  "line": 5,
  "name": "exibe a expressao \"Ovo de Páscoa\" no tiulo da guia",
  "keyword": "Then "
});
formatter.match({
  "location": "Post.queAcessoAWikipedia()"
});
formatter.result({
  "duration": 2443125500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Ovo de Páscoa",
      "offset": 22
    }
  ],
  "location": "Post.pesquisoPalavraPor(String)"
});
formatter.result({
  "duration": 1798925200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Ovo de Páscoa",
      "offset": 19
    }
  ],
  "location": "Post.exibeAExpressaoNoTiuloDaGuia(String)"
});
formatter.result({
  "duration": 6950700,
  "status": "passed"
});
formatter.after({
  "duration": 711521800,
  "status": "passed"
});
});