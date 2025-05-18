package dev.java10x.CadastroDeNinjas;

import jakarta.persistence.*;

//JPA = Java Persistence API

@Entity //Entity = Transforma uma classe em uma entidade do BD
@Table(name = "tb_cadastro") //Digo que essa entidade vai ser uma tabela chamada tb_cadatro
public class NinjaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String email;
    private int idade;


    public NinjaModel() {
    }

    public NinjaModel(String nome, String email, int idade) {
        this.nome = nome;
        this.email = email;
        this.idade = idade;
    }


    //Agora vamos transformar em uma tabela
    //Transformar classes em entidade
}
