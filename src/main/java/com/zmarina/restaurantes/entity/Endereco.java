package com.zmarina.restaurantes.entity;

import jakarta.persistence.Embeddable;

@Embeddable
public class Endereco {

    private String rua;
    private String bairro;
    private Integer numero;
    private String pontoReferencia;
}
