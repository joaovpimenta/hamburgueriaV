package br.com.grupoum.Restaurante;

import br.com.grupoum.Restaurante.model.entities.Pessoa;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RestauranteApplication {

	public static Pessoa pessoaLogada;
	public static int nivel = 0;

	public static void main(String[] args) {
		SpringApplication.run(RestauranteApplication.class, args);
	}
}
