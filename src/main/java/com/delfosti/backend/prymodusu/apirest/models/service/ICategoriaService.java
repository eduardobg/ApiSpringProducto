package com.delfosti.backend.prymodusu.apirest.models.service;

import java.util.List;

import com.delfosti.backend.prymodusu.apirest.entity.Categoria;

public interface ICategoriaService {

	//Service methods
	
	public List<Categoria> findAll();
	
	public Categoria findById(Long id);
	
	public Categoria save(Categoria categoria);
	
	public void delete(Long id);
}
