/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 * Clase User que tiene los atributos basicos de un usuario
 * 
 * @author Iñigo, Aitor
 */
public class User {
    
    private String id;
    private String name;
    private String lastName;
    private String telephone;
    private String email;
    
    /**
    * 
    * Constructor basico 
    */
    public User(){
        
    }
    /**
    * 
    * Constructor que requiere todos los parametros de User
    * 
    * @param id ID del usuario
    * @param name Nombre del usuario
    * @param lastName Apellido del usuario
    * @param telephone Telefono del uduario
    * @param email Email del usuario
    */
    public User(String id, String name, String lastName, String telephone, String email) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.telephone = telephone;
        this.email = email;
    }
    
    
    /**
    * Devuelve el ID del usuario
    *  
    * @return id ID del usuario
    */
    public String getId() {
        return id;
    }
    
    /**
    * Cambia el parametro ID de User
    *  
    * @param  id ID del usuario
    */
    public void setId(String id) {
        this.id = id;
    }
    /**
    * Devuelve el name del usuario
    *  
    * @return name Nombre del usuario
    */
    public String getName() {
        return name;
    }

    /**
    * Cambia el parametro name de User
    *  
    * @param  name Nombre del usuario
    */
    public void setName(String name) {
        this.name = name;
    }
    
    /**
    * Devuelve el apellido del usuario
    *  
    * @return lastName apellido del usuario
    */
    public String getLastName() {
        return lastName;
    }
    
    /**
    * Cambia el parametro lastName de User
    *  
    * @param  lastName Apellido del usuario
    */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    
    /**
    * Devuelve el telefono del usuario
    *  
    * @return telephone Telefono del usuario
    */
    public String getTelephone() {
        return telephone;
    }
    
    /**
    * Cambia el parametro telephone de User
    *  
    * @param telephone telefono del usuario
    */
    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }
    
    /**
    * Devuelve el email del usuario
    *  
    * @return email Telefono del usuario
    */
    public String getEmail() {
        return email;
    }
    /**
    * Cambia el parametro email de User
    *  
    * @param  email mail del usuario
    */
    public void setEmail(String email) {
        this.email = email;
    }  
}
