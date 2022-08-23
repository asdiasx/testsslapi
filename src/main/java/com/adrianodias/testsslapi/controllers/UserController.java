package com.adrianodias.testsslapi.controllers;

import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.adrianodias.testsslapi.entities.ResLotoFacil;

@RestController
public class UserController {

	@GetMapping(value = "/lotofacil")
	public List<String> getLotofacilLastResult() {
		String url = "https://servicebus2.caixa.gov.br/portaldeloterias/api/lotofacil/";
		RestTemplate rest = new RestTemplate();
		ResLotoFacil results = rest.getForObject(url, ResLotoFacil.class);

		return results.getListaDezenas();

	}

	@GetMapping(value = "/lotofacil/{teste}")
	public String getLotofacilTestResult(@PathVariable int teste) {
		//url de resultados gerais:
		//String url = "https://servicebus2.caixa.gov.br/portaldeloterias/api/home/ultimos-resultados";
		String url = "https://servicebus2.caixa.gov.br/portaldeloterias/api/lotofacil/" + teste;
		RestTemplate rest = new RestTemplate();
		ResLotoFacil results = rest.getForObject(url, ResLotoFacil.class);

		return ("<h1>Teste: " + teste + "</h1>" + "<p>Resultado: " + results.getListaDezenas().toString() + "</p>");

	}

}
