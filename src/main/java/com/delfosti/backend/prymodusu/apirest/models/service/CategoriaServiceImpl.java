package com.delfosti.backend.prymodusu.apirest.models.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.delfosti.backend.prymodusu.apirest.entity.Categoria;
import com.delfosti.backend.prymodusu.apirest.models.dao.ICategoriaDao;


@Service
public class CategoriaServiceImpl implements ICategoriaService{

	@Autowired
	private ICategoriaDao actionDao;
	
	@Override
	public List<Categoria> findAll() {
		// TODO Auto-generated method stub
		return (List<Categoria>) actionDao.findAll();
	}

	@Override
	public Categoria findById(Long id) {
		// TODO Auto-generated method stub
		return actionDao.findById(id).orElse(null);
	}

	@Override
	public Categoria save(Categoria cat) {
		// TODO Auto-generated method stub
		return actionDao.save(cat);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		actionDao.deleteById(id);
	}

}
