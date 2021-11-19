package com.delfosti.backend.prymodusu.apirest.models.service;

import java.util.List;

import com.delfosti.backend.prymodusu.apirest.entity.Producto;

public interface IProductoService {


	//Service methods
	
	public List<Producto> findAll();
	
	public Producto findById(Long id);
	
	public Producto save(Producto producto);
	
	public void delete(Long id);
}
