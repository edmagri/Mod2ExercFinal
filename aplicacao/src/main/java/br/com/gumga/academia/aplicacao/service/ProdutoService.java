package br.com.gumga.academia.aplicacao.service;

import br.com.gumga.academia.aplicacao.repository.ProdutoRepository;
import br.com.gumga.academia.entidades.Produto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Usuario
 */
@Service
public class ProdutoService {
    @Autowired
    private ProdutoRepository produtoRepository;  
    
    @Transactional
    public void salvar(Produto produto) {
        produtoRepository.save(produto);
    }
    
    @Transactional
    public void excluir(Produto produto) {
        produtoRepository.delete(produto);
    }
    
}