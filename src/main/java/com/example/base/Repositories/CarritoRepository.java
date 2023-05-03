package com.example.base.Repositories;

import com.example.base.Entities.Compra;
import com.example.base.Entities.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CarritoRepository extends JpaRepository<Compra, Integer> {
    List<Compra> findByUsuarioAndEstado(Usuario usuario, byte estado);
}
