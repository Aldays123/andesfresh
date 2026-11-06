package com.andesfresh.portal.service;
 
import com.andesfresh.portal.entity.Producto;
import com.andesfresh.portal.repository.ProductoRepository;
import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
 
@Service
public class ProductoServiceImpl implements ProductoService {
    private final ProductoRepository productoRepository;
 
    public ProductoServiceImpl(ProductoRepository productoRepository) {
        this.productoRepository = productoRepository;
    }
 
    @Override
    public Producto create(Producto producto) {
        return productoRepository.save(producto);
    }
 
    @Override
    public List<Producto> readAll() {
        return productoRepository.findAll();
    }
 
    @Override
    public void guardarTodos(List<Producto> varios) {
        varios.removeIf(p -> p.getNombre() == null || p.getNombre().isBlank());
        productoRepository.saveAll(varios);
    }
 
    @Override
    public Page<Producto> listarPaginado(Pageable pageable) {
        return productoRepository.findAll(pageable);
    }
}
