package com.andesfresh.portal.service;
 
import com.andesfresh.portal.entity.Producto;
import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
 
public interface ProductoService {
    Producto create(Producto producto);
    List<Producto> readAll();
    void guardarTodos(List<Producto> varios);
    Page<Producto> listarPaginado(Pageable pageable);
}
