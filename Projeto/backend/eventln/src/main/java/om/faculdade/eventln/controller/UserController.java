package om.faculdade.eventln.controller;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import jakarta.validation.Valid;
import om.faculdade.eventln.domain.UserRequest;
import om.faculdade.eventln.domain.User;
import om.faculdade.eventln.domain.UserRepository;

@RestController
@CrossOrigin("*")
@RequestMapping("/usuario")

public class UserController {
	@Autowired
	private UserRepository repository;
	
    @GetMapping
    public ResponseEntity getAllUsers(){
        var allUsers = repository.findAll();
        	
       return ResponseEntity.ok(allUsers);
       
    }
    
    @PostMapping
    public ResponseEntity registerUser(@RequestBody @Valid UserRequest data) {
        User newUser = new User(data);
        // Salvar o usuario
        repository.save(newUser);
        return ResponseEntity.ok().build();
    }

    
    @PutMapping("/{id}")
    public ResponseEntity<?> updateUser(@PathVariable Integer id, @RequestBody @Valid UserRequest data) {
        Optional<User> user = repository.findById(id);
        
        if (user.isPresent()) {
            User userUpdate = user.get();

            // Atualizando os dados do usuario
            userUpdate.setUsrName(data.usrName());
            userUpdate.setUsrEmail(data.usrEmail());
            userUpdate.setUsrPassword(data.usrPassword());
            userUpdate.setUsrType(data.usrType());

            // Salvando o usuario atualizado
            repository.save(userUpdate);
            
            return ResponseEntity.ok(userUpdate);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity deleteUser(@PathVariable Integer id) {
    	repository.deleteById(id);

    	return ResponseEntity.noContent().build();
    }
}
