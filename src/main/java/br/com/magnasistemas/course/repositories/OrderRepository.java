package br.com.magnasistemas.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.magnasistemas.course.entities.Order;


public interface OrderRepository extends JpaRepository<Order, Long>{

	
}
