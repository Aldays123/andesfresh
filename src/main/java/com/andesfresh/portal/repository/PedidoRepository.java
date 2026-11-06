package com.andesfresh.portal.repository;
 
import com.andesfresh.portal.entity.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;
 
public interface PedidoRepository extends JpaRepository<Pedido, Long> {}
