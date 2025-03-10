package om.faculdade.eventln.domain;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.Column;
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

@Table(name="users")
@Entity(name="users")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = "usr_id")
public class User {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer usrId;

    @Column(name = "usr_name")
	private String usrName;

    @Column(name = "usr_email")
	private String usrEmail;

    @Column(name = "usr_tipo")
	private String usrType;

    @Column(name = "usr_password")
	private String usrPassword;
	
    public user() {
    }
	
	public user(UserRequest userRequest) {
		this.usrId = userRequest.usrId();
		this.usrName = userRequest.usrName();
		this.usrEmail = userRequest.usrEmail();
		this.usrType = userRequest.usrType();
		this.usrPassword = userRequest.usrPassword();
	}

	public Integer getUsrId() {
        return usrId;
    }

    public String getUsrNome() {
        return usrName;
    }

    public void setUsrNome(String usrName) {
        this.usrName = usrName;
    }

    public String getUsrType() {
        return usrType;
    }

    public void getUsrType(String usrType) {
        this.usrType = usrType;
    }

    public String getUsrEmail() {
        return usrEmail;
    }

    public void setUsrEmail(String usrEmail) {
        this.usrEmail = usrEmail;
    }

    public String getUsrPassword() {
        return usrPassword;
    }

    public void setUsrPassword(String usrPassword) {
        this.usrPassword = usrPassword;
    }
}