package br.com.bandtec.zoomzinho;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OpiniaoController {
	
	private List<Opiniao> opinioes = new ArrayList<>();
	
	@PostMapping("/livros/opinar")
	public ResponseEntity<String> cadastrar(@RequestBody Opiniao opiniao){
		opinioes.add(opiniao);
		
		return ResponseEntity.ok("Opinião cadastrada com sucesso");
	}
}
