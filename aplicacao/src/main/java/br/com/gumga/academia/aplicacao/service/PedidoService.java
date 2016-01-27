package br.com.gumga.academia.aplicacao.service;

import br.com.gumga.academia.aplicacao.repository.PedidoRepository;
import br.com.gumga.academia.entidades.Pedido;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Usuario
 */
@Service
public class PedidoService {
    @Autowired
    private PedidoRepository pedidoRepository;  
    
    @Transactional
    public void salvar(Pedido pedido) {
        pedidoRepository.save(pedido);
    }
    
    @Transactional
    public void excluir(Pedido pedido) {
        pedidoRepository.delete(pedido);
    }
    
}
