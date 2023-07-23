package com.TheVault.Domain;


import jakarta.persistence.*;
import java.io.Serializable;
import lombok.Data;
import java.util.List;


@Data
@Entity
@Table(name="figura")
public class Categoria implements Serializable {
    
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idfigura")
    private Long idfigura;
    private String nombre_figura;
    private String tipo_figura;
    private String ruta_imagen;
    private int material_figura;
    private int cantidad;
    boolean agotado;


    public Categoria() {
    }

    public Categoria(Long idfigura, String nombre_figura, String tipo_figura, String ruta_imagen, int material_figura, int cantidad) {
        this.idfigura = idfigura;
        this.nombre_figura = nombre_figura;
        this.tipo_figura = tipo_figura;
        this.ruta_imagen = ruta_imagen;
        this.material_figura = material_figura;
        this.cantidad = cantidad;
    }

    
    
    
}

