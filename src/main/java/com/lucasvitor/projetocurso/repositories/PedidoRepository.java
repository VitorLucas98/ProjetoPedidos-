package com.lucasvitor.projetocurso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lucasvitor.projetocurso.domain.Pedido;

@Repository
public interface PedidoRepository extends JpaRepository<Pedido, Integer> {


}