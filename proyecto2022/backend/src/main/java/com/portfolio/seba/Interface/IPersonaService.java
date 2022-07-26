
package com.portfolio.seba.Interface;

import com.portfolio.seba.Entity.Persona;
import java.util.List;



public interface IPersonaService {
    //traer una lista de personas
    public List<Persona> getPersona();
    
    //Guardar un objeto de tipo persona
    public void savePersona(Persona persona);
    
    //Eliminar un objeto pero lo buscamos por ID
    public void deletePersona(Long id);
    
    //Buscar un persona por ID
    public Persona findPersona(Long id);
}
