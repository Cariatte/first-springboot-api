package br.com.magnasistemas.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.magnasistemas.course.entities.Category;


public interface CategoryRepository extends JpaRepository<Category, Long>{

	
}
