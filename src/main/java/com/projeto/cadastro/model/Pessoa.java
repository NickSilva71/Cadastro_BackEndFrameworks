package com.projeto.cadastro.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.UUID;

@Entity

@Table(name = "pessoa_db")
@Data
public class Pessoa {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    private String nome;

    private String cpf;

    private int idade;
}
