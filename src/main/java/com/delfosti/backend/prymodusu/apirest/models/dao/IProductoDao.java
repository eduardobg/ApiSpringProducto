package com.delfosti.backend.prymodusu.apirest.models.dao;

import org.springframework.data.repository.CrudRepository;
import com.delfosti.backend.prymodusu.apirest.entity.Producto;
import com.delfosti.backend.prymodusu.apirest.models.dto.ProductoDto;

public interface IProductoDao extends CrudRepository<Producto, Long>{

}
