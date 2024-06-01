package com.zmarina.restaurantes.controller.DTO;

import com.zmarina.restaurantes.entity.Comida;
import com.zmarina.restaurantes.entity.Endereco;
import com.zmarina.restaurantes.enums.Preco;
import com.zmarina.restaurantes.enums.TipoRefeicao;

public record RestauranteRequestDTO(

        String nome,
        Endereco endereco,
        boolean estacionamento,
        boolean areaInfantil,
        TipoRefeicao tipoRefeicao,
        Comida comida,
        Preco preco,
        String horario
) {
}
