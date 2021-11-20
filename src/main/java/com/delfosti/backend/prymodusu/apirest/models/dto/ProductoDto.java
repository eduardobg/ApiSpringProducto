package com.delfosti.backend.prymodusu.apirest.models.dto;

import java.util.Date;

public class ProductoDto {
	private Long id;
	private String name;
	private String description;	
	private double price;
	private Date fechaIngreso;
	private Long catId;
	public ProductoDto() {
		
	}
	
	public ProductoDto(Long id, String name, String description, double price, Date fechaIngreso, Long catId) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.price = price;
		this.fechaIngreso = fechaIngreso;
		this.catId = catId;
	}

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public Date getFechaIngreso() {
		return fechaIngreso;
	}
	public void setFechaIngreso(Date fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}
	public Long getCatId() {
		return catId;
	}
	public void setCatId(Long catId) {
		this.catId = catId;
	}
	
	
}
