package br.unesp.rc.neo4jmodule.controller;

import br.unesp.rc.neo4jmodule.entity.Usuario;
import br.unesp.rc.neo4jmodule.repository.UsuarioRepository;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/node/usuario")
public class UsuarioController {

    private final UsuarioRepository repository;

    public UsuarioController(UsuarioRepository repository) {
        this.repository = repository;
    }

    @PostMapping("/incluir")
    public boolean save(@RequestBody Usuario entity) {
        boolean insert = false;

        Usuario usuarioInsert = repository.save(entity);

        if (usuarioInsert != null) {
            insert = true;
        }

        return insert;
    }
}
