package br.com.fatecdiadema.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import br.com.fatecdiadema.model.Cliente;
import br.com.fatecdiadema.repository.MeuRepository;

@Service
public class MeuService {

    private MeuRepository repository;

    @Autowired
    public MeuService(MeuRepository repository){
        this.repository = repository;
    }

    public void salvarCliente(Cliente cliente){
        validarCliente(cliente);
        this.repository.persistir(cliente);
    }

    public void validarCliente(Cliente cliente){
        // Aplica validação
    }

}