package com.zmarina.restaurantes.controller.DTO;

import com.zmarina.restaurantes.entity.Comida;
import com.zmarina.restaurantes.entity.Endereco;
import com.zmarina.restaurantes.entity.Restaurante;
import com.zmarina.restaurantes.enums.Preco;
import com.zmarina.restaurantes.enums.TipoRefeicao;

public record RestauranteResponseDTO(

        Long id,
        String nome,
        Endereco endereco,
        boolean estacionamento,
        boolean areaInfantil,
        TipoRefeicao tipoRefeicao,
        Comida comida,
        Preco preco,
        String horario
) {
    public RestauranteResponseDTO(Restaurante restaurante){
        this(restaurante.getId(),
                restaurante.getNome(),
                restaurante.getEndereco(),
                restaurante.isEstacionamento(),
                restaurante.isAreaInfantil(),
                restaurante.getTipoRefeicao(),
                restaurante.getComida(),
                restaurante.getPreco(),
                restaurante.getHorario()
        );
    }
}
