package br.com.magnasistemas.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.magnasistemas.course.entities.OrderItem;


public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{

	
}
