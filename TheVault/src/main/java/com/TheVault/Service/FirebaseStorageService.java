package com.TheVault.Service;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
public interface FirebaseStorageService {
    
    public String cargaImagen(MultipartFile archivoLocalCliente, String carpeta, Long id);
    
    //El BuketName es el <id_del_proyecto> + ".appspot.com#"
    final String BucketName = "thevault-d0a04.appspot.com";
    
    //Esta es la ruta basica de este proyecto TechShop
    final String rutaSuperiorStorage = "thevault";
    
    //Ubicacion en donde se encuentra el archivo de configuracion Json
    final String rutaJsonFile = "firebase";
    
    //El nombre del archivo Json
    final String archivoJsonFile = "thevault-d0a04-firebase-adminsdk-a83u1-c7d580221f";
 
            
}
