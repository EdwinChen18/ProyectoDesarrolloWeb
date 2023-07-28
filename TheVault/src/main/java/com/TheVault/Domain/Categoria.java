package com.TheVault.Domain;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.io.Serializable;
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
    boolean agotado;


    public Categoria() {
    }

    public Categoria(Long id_categoria, String descripcion, String rutaImagen, boolean agotado) {
        this.id_categoria = id_categoria;
        this.descripcion = descripcion;
        this.rutaImagen = rutaImagen;
        this.agotado = agotado;
    }

    
    
}

