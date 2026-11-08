package com.andesfresh.portal.controller;

import com.andesfresh.portal.dto.LoteProductoForm;
import com.andesfresh.portal.entity.Producto;
import com.andesfresh.portal.service.ProductoService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/productos")
public class ProductoController {

    private final ProductoService productoService;

    public ProductoController(ProductoService productoService) {
        this.productoService = productoService;
    }

    @GetMapping
    public String listar(Model model) {
        model.addAttribute("productos", productoService.readAll());
        return "productos/lista";
    }

    @GetMapping("/nuevo")
    public String mostrarFormulario(Model model) {
        model.addAttribute("producto", new Producto());
        return "productos/formulario";
    }

    @PostMapping("/guardar")
    public String guardar(@ModelAttribute("producto") Producto producto) {
        productoService.create(producto);
        return "redirect:/productos";
    }

    // ---- Actividad 3 (Rol 4) ----
    @GetMapping("/lote")
    public String formularioLote(Model model) {
        LoteProductoForm lote = new LoteProductoForm();
        for (int i = 0; i < 3; i++) {
            lote.getProductos().add(new Producto());
        }
        model.addAttribute("lote", lote);
        return "productos/lote";
    }
    
    @PostMapping("/lote")
    public String guardarLote(@ModelAttribute("lote") LoteProductoForm lote) {
        productoService.guardarTodos(lote.getProductos());
        return "redirect:/productos";
    }
}