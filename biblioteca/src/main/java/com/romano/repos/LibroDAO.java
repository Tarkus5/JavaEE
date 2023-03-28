package com.romano.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.romano.entities.Libro;

public interface LibroDAO extends JpaRepository<Libro, Integer> {

}
