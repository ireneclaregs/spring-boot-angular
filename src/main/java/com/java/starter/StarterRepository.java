package com.java.starter;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
interface StarterRepository extends JpaRepository<StarterClass, Long>{

}
