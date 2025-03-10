package om.faculdade.eventln.domain;

public record UserRequest(
		Integer usrId,
		String usrName,
		String usrEmail,
		String usrType, 
		String usrPassword
) {}