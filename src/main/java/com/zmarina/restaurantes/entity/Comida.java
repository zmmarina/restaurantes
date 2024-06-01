package com.zmarina.restaurantes.entity;

import com.zmarina.restaurantes.enums.Gostamos;
import com.zmarina.restaurantes.enums.TipoRefeicao;
import jakarta.persistence.Embeddable;

@Embeddable
public class Comida {

    private String nome;
    private TipoRefeicao tipoRefeicao;
    private String preco;
    private Gostamos gostamos;
    private boolean comemos;
}
