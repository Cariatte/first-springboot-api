package br.com.magnasistemas.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.magnasistemas.course.entities.Product;


public interface ProductRepository extends JpaRepository<Product, Long>{

	
}
