package br.com.bandtec.agendadeobjetivos.domain;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class Livraria {
	
	private final RestTemplate restTemplate;
	private final String url;
	
	public Livraria() {
		restTemplate = new RestTemplate();
		url = "http://localhost:8081/livros";
	}
	
	public List<Livro> buscarLivroComTema(String tema) {
		String urlBusca = url + "/tema/" + tema;
		ResponseEntity<List> resposta = restTemplate.getForEntity(urlBusca, List.class);
		return resposta.getBody();
	}

	public String cadastrarOpiniao(Opiniao opiniao) {
		String urlCadastro = url + "/opinar";
		ResponseEntity<String> resposta = restTemplate.postForEntity( urlCadastro, opiniao, String.class);
		
		return resposta.getBody();
		
	}
}
