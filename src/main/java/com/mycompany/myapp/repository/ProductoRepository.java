package com.mycompany.myapp.repository;

import com.mycompany.myapp.domain.Producto;

import org.springframework.data.jpa.repository.*;

import java.util.List;

/**
 * Spring Data JPA repository for the Producto entity.
 */
public interface ProductoRepository extends JpaRepository<Producto,Long> {

}
