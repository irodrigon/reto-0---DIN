package DataAccessTier;

import Model.User;

/**
 * Interfaz cuyo metodo se usa a travez de una factoria para devolver un User
 * @author Inigo y Aitor
 */
public interface DataAccessible {
    
            /**
             * Metodo usado para devolver un User
             * 
             * @throws Exception Si no puede recoger los atributos arrojara una excepcion.
             * @return Devuelve un User
             */
    
            public User lookUserData() throws Exception;
    
}
