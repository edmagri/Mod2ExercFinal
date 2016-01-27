package br.com.gumga.academia.aplicacao;

import br.com.gumga.academia.aplicacao.service.ClienteService;
import br.com.gumga.academia.entidades.Cliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

/**
 *
 * @author Usuario
 */
@Component
public class Main {
    @Autowired
    private ClienteService clienteService;
    
    public void run(){
        Cliente cliente = new Cliente("Gumga S/A");
        clienteService.salvar(cliente);
        clienteService.buscarTodos().forEach((cli) -> {
            System.out.println(cli);
        });
    }
    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(Aplicacao.class);
        Main ms = ctx.getBean(Main.class);
        ms.run();
    }
}
