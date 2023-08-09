package com.TheVault.Domain;


import jakarta.persistence.*;
import java.io.Serializable;
import java.util.List;
import lombok.Data;


@Data
@Entity
@Table(name="categoria")
public class Categoria implements Serializable {
    
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_categoria")
    private Long id_categoria;
    private String descripcion;
    private String rutaImagen;
    boolean activo;

    @OneToMany
    @JoinColumn(name="id_categoria")
    List<Producto> productos;
    
    public Categoria() {
    }

    public Categoria(Long id_categoria, String descripcion, boolean activo) {
        this.id_categoria = id_categoria;
        this.descripcion = descripcion;
        this.activo = activo;
    }

    
    
}

