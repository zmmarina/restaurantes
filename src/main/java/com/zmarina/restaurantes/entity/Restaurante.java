package com.zmarina.restaurantes.entity;

import com.zmarina.restaurantes.controller.DTO.RestauranteRequestDTO;
import com.zmarina.restaurantes.enums.Preco;
import com.zmarina.restaurantes.enums.TipoRefeicao;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Table(name = "restaurante")
@Entity(name = "restaurante")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Restaurante {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    @Embedded
    private Endereco endereco;

    private boolean estacionamento;

    private boolean areaInfantil;

    private TipoRefeicao tipoRefeicao;

    @Embedded
    private Comida comida;

    private Preco preco;

    private String horario;

    public Restaurante(RestauranteRequestDTO data){
        this.nome = data.nome();
        this.endereco = data.endereco();
        this.estacionamento = data.estacionamento();
        this.areaInfantil = data.areaInfantil();
        this.tipoRefeicao = data.tipoRefeicao();
        this.comida = data.comida();
        this.preco = data.preco();
        this.horario = data.horario();
    }
}
