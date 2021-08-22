package br.unesp.rc.neo4jmodule.repository;

import br.unesp.rc.neo4jmodule.entity.Usuario;
import org.springframework.data.neo4j.repository.Neo4jRepository;

public interface UsuarioRepository extends Neo4jRepository<Usuario, String> {

}
