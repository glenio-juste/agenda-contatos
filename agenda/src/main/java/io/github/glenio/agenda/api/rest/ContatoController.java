package io.github.glenio.agenda.api.rest;

import io.github.glenio.agenda.model.entity.Contato;
import io.github.glenio.agenda.model.repository.ContatoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

/** 
 * @data 05/10/2020
 */

@RestController
@RequestMapping("/api/contatos")
@RequiredArgsConstructor  
@CrossOrigin("*")
public class ContatoController {

    private final ContatoRepository repository;
    
    /*public ContatoController(ContatoRepository repository) {
        this.repository = repository;
    }*/
   
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED) 
    public Contato save( @RequestBody Contato contato){
        return repository.save(contato);
    }
   
    @DeleteMapping("{id}") 
    @ResponseStatus(HttpStatus.NO_CONTENT) 
    public  void delete( @PathVariable Integer id ){
        repository.deleteById(id);
    }

    @GetMapping
    public List<Contato> list(){
        return repository.findAll();
    }

    @PatchMapping("{id}/favorito")
    public void favorite( @PathVariable Integer id , @RequestBody Boolean favorito ){
        Optional<Contato> contato = repository.findById(id);
        contato.ifPresent( c -> {
            c.setFavorito(favorito);
            repository.save(c);
        });
    }

}
