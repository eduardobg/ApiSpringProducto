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

import com.delfosti.backend.prymodusu.apirest.entity.Producto;
import com.delfosti.backend.prymodusu.apirest.models.dto.ProductoDto;
import com.delfosti.backend.prymodusu.apirest.models.service.IProductoService;

@RestController
@RequestMapping("/api")
public class ProductoRestController {

	@Autowired
	private IProductoService productService;
	
	@GetMapping("/products")
	public List<Producto> index(){
		return productService.findAll();
	}
	
	@GetMapping("products/{id}")
	public Producto show(@PathVariable Long id) {
		return productService.findById(id);		
	}
	
	@PostMapping("/products")
	@ResponseStatus(HttpStatus.CREATED)
	public Producto create(@RequestBody Producto prod) {
		return productService.save(prod);
	}
	
	@PutMapping("products/{id}")
	@ResponseStatus(HttpStatus.CREATED)
	public Producto update(@RequestBody Producto prod, @PathVariable Long id) {
		Producto actualProd = productService.findById(id);		
		
		actualProd.setName(prod.getName());
		actualProd.setDescription(prod.getDescription());
		actualProd.setPrice(prod.getPrice());
		actualProd.setFechaIngreso(prod.getFechaIngreso());
		
		return productService.save(actualProd);
	}
	
	@DeleteMapping("products/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void delete(@PathVariable Long id) {
		productService.delete(id);
	}
}
