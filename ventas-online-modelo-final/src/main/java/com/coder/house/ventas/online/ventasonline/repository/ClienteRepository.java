package com.coder.house.ventas.online.ventasonline.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.coder.house.ventas.online.ventasonline.entidad.Cliente;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Integer> {

}
