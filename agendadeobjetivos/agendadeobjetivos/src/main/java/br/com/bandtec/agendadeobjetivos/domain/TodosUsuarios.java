package br.com.bandtec.agendadeobjetivos.domain;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import br.com.bandtec.agendadeobjetivos.controller.Credenciais;

@Repository
public interface TodosUsuarios 
	extends JpaRepository<Usuario, Long> {
	
	@Query("select u from Usuario u "
			+ "where u.credenciais = :credenciais")
	public Usuario buscarUsando(
			@Param("credenciais") Credenciais credenciais);

	@Query("select u from Usuario u where u.nome = :nome")
	public List<Usuario> obterPorNome(@Param("nome") String nome);
}
