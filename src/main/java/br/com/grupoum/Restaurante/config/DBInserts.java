package br.com.grupoum.Restaurante.config;

import br.com.grupoum.Restaurante.model.entities.Cliente;
import br.com.grupoum.Restaurante.model.entities.Mesa;
import br.com.grupoum.Restaurante.model.entities.Pedido;
import br.com.grupoum.Restaurante.model.services.ClienteService;
import br.com.grupoum.Restaurante.model.services.MesaService;
import br.com.grupoum.Restaurante.model.services.PedidoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("db")
public class DBInserts implements CommandLineRunner {

    @Autowired
    private ClienteService clienteService;

    @Autowired
    private MesaService mesaService;

    @Autowired
    private PedidoService pedidoService;

    @Override
    public void run(String... args) throws Exception {


    }
}
