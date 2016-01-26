package br.com.gumga.academia;

import br.com.gumga.academia.entidade.jpa.JpaUtil;
import java.util.List;

public class App 
{
    public static void main( String[] args )
    {
        try {
            Dao<Cliente> clienteDao = new Dao<Cliente>(Cliente.class);
            Cliente cliente = new Cliente("Gumga S/A");
            clienteDao.salvar(cliente);

            List<Cliente> listClientes = clienteDao.buscaTodos();
            listClientes.stream().forEach((c) -> {
                System.out.println(c);
            });

            System.out.print("Buscando cliente com ID 1 ... ");
            cliente = clienteDao.buscaPorId(new Long(1));
            if (cliente != null) {
                System.out.println("cliente encontrado " + cliente);
            }

            System.out.println("Excluindo cliente com ID = 1");
            clienteDao.excluir(cliente);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            JpaUtil.close();
        }
    }
}
