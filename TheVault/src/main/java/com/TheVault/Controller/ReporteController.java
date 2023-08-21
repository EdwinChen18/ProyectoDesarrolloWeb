
package com.TheVault.Controller;

import com.TheVault.Service.ReporteService;
import java.io.IOException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
@RequestMapping("/producto")
public class ReporteController {
    
    
        @Autowired
    ReporteService ReporteService;
        
    @GetMapping("/productos")
    public ResponseEntity<Resource> reporteProductos(@RequestParam String tipo)
            throws IOException {
        var reporte = "productos";
        return ReporteService.generaReporte(reporte, null, tipo);
    }
        @GetMapping("/usuarios")
    public ResponseEntity<Resource> reporteClientes(@RequestParam String tipo)
            throws IOException {
        var reporte = "usuarios";
        return ReporteService.generaReporte(reporte, null, tipo);
    }
}