
package com.portfolioArgentinaPrograma.demo.Interface;

import com.portfolioArgentinaPrograma.demo.Entity.Persona;
import java.util.List;


public interface IPersonaService {
    //traer una lista de personas
    public List<Persona> getPersona();
    
    //guardar un objeto de tipo persona
    public void savePersona(Persona persona);
    
    //eliminar un usuario
    public void deletePersona(Long id);
    
    //buscar una persona
    public Persona findPersona(Long id);
}
