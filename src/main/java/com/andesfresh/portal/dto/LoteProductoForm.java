package com.andesfresh.portal.dto;
 
import com.andesfresh.portal.entity.Producto;
import java.util.ArrayList;
import java.util.List;
 
public class LoteProductoForm {
    private List<Producto> productos = new ArrayList<>();
 
    public List<Producto> getProductos() { return productos; }
    public void setProductos(List<Producto> productos) { this.productos = productos; }
}
