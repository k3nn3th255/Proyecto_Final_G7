
package com.service;

import org.springframework.web.multipart.MultipartFile;

public interface FirebaseStorageService {
     public String cargaImagen(MultipartFile archivoLocalCliente, 
            String carpeta, 
            Long id);
    /* recordar que este siempre es el id del firebase + .appspot.com"*/
     
    final String BucketName="proyectofinalg7-d7863.appspot.com";
    
    //Esta es la ruta base de este proyecto en el Storage
    final String rutaSuperiorStorage="ProyectoFinalG7";
    
    //Ubicaciòn del archivo de configuraciòn Json
    final String rutaJsonFile="firebase";
    
    final String archivoJsonFile="proyectofinalg7-d7863-firebase-adminsdk-epedd-2d12fce35c~.json";
    
}
