package com.andesfresh.portal.service;
 
import com.andesfresh.portal.entity.Pedido;
import java.util.List;
 
public interface PedidoService {
    Pedido create(Pedido pedido);
    List<Pedido> readAll();
}
