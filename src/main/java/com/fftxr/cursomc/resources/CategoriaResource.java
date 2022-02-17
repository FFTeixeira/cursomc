package com.fftxr.cursomc.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fftxr.cursomc.entities.Categoria;

@RestController
@RequestMapping(value = "/categories")
public class CategoriaResource {
	
	@GetMapping
	public List<Categoria> findAll() {
		
		Categoria cat1 = new Categoria(1L, "Informática");
		Categoria cat2 = new Categoria(2L, "Escritório");
		
		List<Categoria> categorias = new ArrayList<>();
		
		categorias.add(cat1);
		categorias.add(cat2);
		
		return categorias;
	}
}