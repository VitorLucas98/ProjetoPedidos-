package com.lucasvitor.projetocurso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lucasvitor.projetocurso.domain.Estado;

@Repository
public interface EstadoRepository extends JpaRepository<Estado, Integer> {


}