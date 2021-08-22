package br.unesp.rc.neo4jmodule.entity;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.Node;

@Getter
@Setter
@Node("Usuario")
public class Usuario {

    @Id
    private String email;
    private String nome;
}
