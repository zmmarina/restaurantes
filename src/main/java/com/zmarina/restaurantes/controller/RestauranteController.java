package com.zmarina.restaurantes.controller;

import com.zmarina.restaurantes.controller.DTO.RestauranteRequestDTO;
import com.zmarina.restaurantes.controller.DTO.RestauranteResponseDTO;
import com.zmarina.restaurantes.entity.Restaurante;
import com.zmarina.restaurantes.repository.RestauranteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/restaurante")
public class RestauranteController {

    @Autowired
    private RestauranteRepository restauranteRepository;

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @GetMapping
    public List<RestauranteResponseDTO> getAllRestaurantes() {
        return restauranteRepository.findAll().stream().map(RestauranteResponseDTO::new).toList();
    }

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @PostMapping
    public void createRestaurante(@RequestBody RestauranteRequestDTO data){
        Restaurante restaurante = new Restaurante(data);
        restauranteRepository.save(restaurante);
    }
}
