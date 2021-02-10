package br.com.bandtec.agendadeobjetivos.controller;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.bandtec.agendadeobjetivos.domain.Objetivo;
import br.com.bandtec.agendadeobjetivos.domain.TodosObjetivos;

@RestController
public class ObjetivoController {
	
	private TodosObjetivos todosObjetivos;
	
	@Autowired
	public ObjetivoController(TodosObjetivos todosObjetivos) {
		this.todosObjetivos = todosObjetivos;
	}
	
	@PostMapping("/objetivos")
	public ResponseEntity<String> salvar(@RequestBody Objetivo objetivo){
		this.todosObjetivos.save(objetivo);
		return ResponseEntity.ok("ce eh bichao hein");
	}
	
	@GetMapping("/objetivos/data/{data}")
	public ResponseEntity<List<Objetivo>> obterPorData(@PathVariable("data") String dataString){
		LocalDate data = LocalDate.parse(dataString);
		List<Objetivo> objetivos = todosObjetivos.ate(data);
		if(objetivos.isEmpty()) {
			//return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
			return ResponseEntity.noContent().build();
		}
		return ResponseEntity.ok(objetivos);
		//return ResponseEntity.status(HttpStatus.OK).body(objetivos);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
