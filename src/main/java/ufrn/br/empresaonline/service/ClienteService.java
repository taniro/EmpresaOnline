package ufrn.br.empresaonline.service;

import org.springframework.stereotype.Service;
import ufrn.br.empresaonline.model.Cliente;
import ufrn.br.empresaonline.repository.ClienteRepository;

import java.util.List;
import java.util.Optional;

@Service
public class ClienteService {

    private ClienteRepository repository;

    public ClienteService(ClienteRepository repository){
        this.repository = repository;
    }

    public Cliente insert (Cliente c){
        return repository.save(c);
    }

    public Cliente update (Cliente c){
        return repository.saveAndFlush(c);
    }

    public void delete (Long id){
        repository.deleteById(id);
    }

    public List<Cliente> listAll(){
        return repository.findAll();
    }

    public Optional<Cliente> listById(Long id){
        return repository.findById(id);
    }

}
