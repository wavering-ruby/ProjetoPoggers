package om.faculdade.eventln.domain;

public record requestusuario(
		Integer usr_id,
		String usr_nome,
		String usr_email,
		String usr_tipo, 
		String usr_senha) {
	
	

}
