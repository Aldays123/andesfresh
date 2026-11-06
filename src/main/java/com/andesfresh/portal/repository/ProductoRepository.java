package com.andesfresh.portal.repository;
 
import com.andesfresh.portal.entity.Producto;
import org.springframework.data.jpa.repository.JpaRepository;
 
public interface ProductoRepository extends JpaRepository<Producto, Long> {}
