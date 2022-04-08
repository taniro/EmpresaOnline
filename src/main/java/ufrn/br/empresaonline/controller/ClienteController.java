package ufrn.br.empresaonline.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ufrn.br.empresaonline.model.Cliente;
import ufrn.br.empresaonline.service.ClienteService;

import java.util.List;

@RestController
@RequestMapping("/cliente")
public class ClienteController {
    private final ClienteService service;

    public ClienteController(ClienteService service) {
        this.service = service;
    }

    @GetMapping
    public List<Cliente> listAll(){
        return service.listAll();
    }

    @GetMapping(path = "/{id}")
    public ResponseEntity<Cliente> listById(@PathVariable Long id){
        var cliente = service.listById(id);
        if (cliente.isEmpty()){
            return ResponseEntity.notFound().build();
        }else{
            return ResponseEntity.ok().body(cliente.get());
        }
    }

    @PostMapping
    public Cliente insert(@RequestBody Cliente c){
        return service.insert(c);
    }

    @PutMapping(path = "/{id}")
    public ResponseEntity<Cliente> update(@RequestBody Cliente c, @PathVariable Long id){
        return service
                .listById(id)
                .map(record -> {
                    service.update(c);
                    return ResponseEntity.ok().body(c);
                }).orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping(path = "/{id}")
    public ResponseEntity<?> delete(Long id){
        return service
                .listById(id)
                .map(record -> {
                    service.delete(id);
                    return ResponseEntity.ok().build();
                }).orElse(ResponseEntity.notFound().build());
    }



}
