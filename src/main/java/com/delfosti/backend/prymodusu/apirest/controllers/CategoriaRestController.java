package com.delfosti.backend.prymodusu.apirest.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.delfosti.backend.prymodusu.apirest.entity.Categoria;
import com.delfosti.backend.prymodusu.apirest.models.service.ICategoriaService;

@RestController
@RequestMapping("/api")
public class CategoriaRestController {

	@Autowired
	private ICategoriaService catService;
	
	@GetMapping("/categories")
	public List<Categoria> index(){
		return catService.findAll();
	}
	
	@GetMapping("categories/{id}")
	public Categoria show(@PathVariable Long id) {
		return catService.findById(id);		
	}
	
	@PostMapping("/categories")
	@ResponseStatus(HttpStatus.CREATED)
	public Categoria create(@RequestBody Categoria cat) {
		return catService.save(cat);
	}
	
	@PutMapping("categories/{id}")
	@ResponseStatus(HttpStatus.CREATED)
	public Categoria update(@RequestBody Categoria cat, @PathVariable Long id) {
		Categoria actualCat = catService.findById(id);
		
		actualCat.setName(cat.getName());
		
		return catService.save(actualCat);
	}
	
	@DeleteMapping("categories/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void delete(@PathVariable Long id) {
		catService.delete(id);
	}
	
}
