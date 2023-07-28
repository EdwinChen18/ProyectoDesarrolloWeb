package com.TheVault.Service;

    import com.TheVault.Domain.Categoria ;
    import java.util.List ;

    public interface CategoriaService {

       
        public List<Categoria> getCategorias(boolean agotado);

        
        public Categoria getCategoria(Categoria categoria);

   
        public void save(Categoria categoria);

        public void delete(Categoria categoria);
    }


