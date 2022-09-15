package br.com.magnasistemas.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.magnasistemas.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

	
}
