package com.delfosti.backend.prymodusu.apirest.models.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.delfosti.backend.prymodusu.apirest.entity.Producto;
import com.delfosti.backend.prymodusu.apirest.models.dao.ICategoriaDao;
import com.delfosti.backend.prymodusu.apirest.models.dao.IProductoDao;

@Service
public class ProductoServiceImpl implements IProductoService{

	@Autowired
	private IProductoDao productDao;
	
	@Autowired
	private ICategoriaDao actionDao;
	
	@Override
	public List<Producto> findAll() {
		// TODO Auto-generated method stub
		return (List<Producto>) productDao.findAll();
	}

	@Override
	public Producto findById(Long id) {
		// TODO Auto-generated method stub
		return productDao.findById(id).orElse(null);
	}

	@Override
	public Producto save(Producto prod) {
		// TODO Auto-generated method stub		
		
		return productDao.save(prod);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		productDao.deleteById(id);
	}

}
