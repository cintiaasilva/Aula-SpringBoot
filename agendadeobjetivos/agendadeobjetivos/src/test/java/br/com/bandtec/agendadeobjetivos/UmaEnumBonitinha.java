package br.com.bandtec.agendadeobjetivos;

public enum UmaEnumBonitinha {
	
	UM_EXEMPLO("eu sou um exemplo de enum"),
	OUTRO_EXEMPLO("eu sou outro exemplo");
	
	private String texto;
	
	private UmaEnumBonitinha(String texto) {
		this.texto = texto;
	}
	
}
