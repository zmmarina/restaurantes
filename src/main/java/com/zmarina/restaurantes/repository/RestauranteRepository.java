package com.zmarina.restaurantes.repository;

import com.zmarina.restaurantes.entity.Restaurante;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RestauranteRepository extends JpaRepository <Restaurante, Long> {
}
