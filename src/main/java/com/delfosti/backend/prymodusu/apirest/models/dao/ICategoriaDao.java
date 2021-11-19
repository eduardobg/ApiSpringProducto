package com.delfosti.backend.prymodusu.apirest.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.delfosti.backend.prymodusu.apirest.entity.Categoria;

public interface ICategoriaDao extends CrudRepository<Categoria, Long> {

}
