package com.TheVault.Service.impl;
/**
 *
 * @author ReyNaldo
 */
import com.TheVault.Dao.CategoriaDao;
import com.TheVault.Domain.Categoria;
import com.TheVault.Service.CategoriaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class CategoriaServiceImpl implements CategoriaService {

    @Autowired
    private CategoriaDao categoriaDao;

    @Override
    @Transactional(readOnly = true)
    public List<Categoria> getCategorias(boolean agotado) {
        var lista = categoriaDao.findAll();
        if (agotado){
           lista.removeIf(categoriaEletemento -> !categoriaEletemento.isAgotado());
        }
        return lista;
    }

    @Override
    @Transactional
        public Categoria getCategoria(Categoria categoria) {
            return categoriaDao.findById(categoria.getIdfigura()).orElse(null);
        }
        
    @Override
    @Transactional
    public void save(Categoria categoria) {
        categoriaDao.save(categoria);
    }

    @Override
    @Transactional
    public void delete(Categoria categoria) {
        categoriaDao.delete(categoria);
    }

}