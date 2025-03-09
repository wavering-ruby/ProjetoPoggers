package om.faculdade.eventln.controller;



import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.validation.Valid;
import om.faculdade.eventln.domain.requestusuario;
import om.faculdade.eventln.domain.usuario;
import om.faculdade.eventln.domain.usuariorepository;

@RestController
@RequestMapping("/usuario")

public class UsuarioController {
	@Autowired
	private usuariorepository repository;
	
    @GetMapping
    public ResponseEntity getAllUsuario(){
        var allusuario = repository.findAll();
        	
       return ResponseEntity.ok(allusuario);
       
    }
    
    @PostMapping
    public ResponseEntity registrarusuario(@RequestBody @Valid requestusuario data) {
        usuario newusuario = new usuario(data);
        // Salvar o usuario
        repository.save(newusuario);
        return ResponseEntity.ok().build();
    }

    
    @PutMapping("/{id}")
    public ResponseEntity<?> atualizarusuario(@PathVariable Integer id, @RequestBody @Valid requestusuario data) {
        Optional<usuario> usuarioExistente = repository.findById(id);
        
        if (usuarioExistente.isPresent()) {
            usuario usuarioAtualizado = usuarioExistente.get();

            // Atualizando os dados do usuario
            usuarioAtualizado.setUsr_nome(data.usr_nome());
            usuarioAtualizado.setUsr_email(data.usr_email());
            usuarioAtualizado.setUsr_senha(data.usr_senha());
            usuarioAtualizado.setUsr_tipo(data.usr_tipo());

            // Salvando o usuario atualizado
            repository.save(usuarioAtualizado);
            
            return ResponseEntity.ok(usuarioAtualizado);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity deletarusuario(@PathVariable Integer id) {
    	repository.deleteById(id);
    	return ResponseEntity.noContent().build();
    }

    



}
