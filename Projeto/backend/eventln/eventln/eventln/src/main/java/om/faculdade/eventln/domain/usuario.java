package om.faculdade.eventln.domain;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;




@Table(name="usuario")
@Entity(name="usuario")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = "usr_id")


public class usuario {
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer  usr_id;
	
	
	
	private String usr_nome;
	private String usr_email;
	private String usr_tipo;
	private String usr_senha;
	
	
    public usuario() {
    }
	
	public usuario(requestusuario requestusuario) {
		this.usr_id = requestusuario.usr_id();
		this.usr_nome = requestusuario.usr_nome();
		this.usr_email = requestusuario.usr_email();
		this.usr_tipo = requestusuario.usr_tipo();
		this.usr_senha = requestusuario.usr_senha();
		
	}
	public Integer getUsr_id() {
        return usr_id;
    }

    public String getUsr_nome() {
        return usr_nome;
    }
    public void setUsr_nome(String usr_nome) {
        this.usr_nome = usr_nome;
    }
    public String getUsr_tipo() {
        return usr_tipo;
    }
    public void setUsr_tipo(String usr_tipo) {
        this.usr_tipo = usr_tipo;
    }
    public String getUsr_email() {
        return usr_email;
    }
    public void setUsr_email(String usr_email) {
        this.usr_email = usr_email;
    }

    public String getUsr_senha() {
        return usr_senha;
    }
    public void setUsr_senha(String usr_senha) {
        this.usr_senha = usr_senha;
    }
	
	   
	

}
