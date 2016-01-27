package br.com.gumga.academia.aplicacao.service;

import br.com.gumga.academia.aplicacao.repository.ClienteRepository;
import br.com.gumga.academia.entidades.Cliente;
import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Usuario
 */
@Service
public class ClienteService {
    @Autowired
    private ClienteRepository clienteRepository;  
    
    @Transactional
    public void salvar(Cliente cliente) {
        clienteRepository.save(cliente);
    }
    
    @Transactional
    public void excluir(Cliente cliente) {
        clienteRepository.delete(cliente);
    }
    
    @Transactional
    public List<Cliente> buscarTodos() {
        return clienteRepository.findAll();
    }
    
    @Transactional
    public List<Cliente> buscarPerData(Date dataInicial, Date dataFinal) {
        return clienteRepository.findBydataCadastroBetween(dataInicial, dataFinal);
    }
    
}

