package br.unesp.rc.neo4jmodule;

import br.unesp.rc.neo4jmodule.entity.Usuario;
import br.unesp.rc.neo4jmodule.repository.UsuarioRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Collections;

@SpringBootApplication
public class Neo4jmoduleApplication {

	public static void main(String[] args) {
		SpringApplication.run(Neo4jmoduleApplication.class, args);
	}

	@Bean
	CommandLineRunner demo(UsuarioRepository usuarioRepository) {
		return args -> {
			Usuario usuario = new Usuario();
			usuario.setEmail("andre@emailteste.br");
			usuario.setNome("andre");

			usuarioRepository.deleteAllById(Collections.singleton("andre@emailteste.br"));
		};
	}

}
