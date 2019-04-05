/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.clases;
/**
 * estructuraperiodica
 * 
 * estructura que permite estructurar al periodico digital
 * 
 * @version 2.0
 * @since 2019
 * @author amstrong
 * 
 */
public class RedSocial {
    private int codigo;//atrivutos
    private String nombre;
    private String url;
    private String [] publicaciones;
       
            
    public void setCodigo(int codigo){
    /**
    * setCodigo
    * Metodo que me permite establecer el codigo de la ubicacion de la red social
    * @since  2019
    * @author Amstrong
    */
    this.codigo=codigo;
    }
    public int getCodigo(){
         /**
        * getCodigo
        * Metodo que me permite obtener el codigo de la ubicacion de la red social
        * @since  2019
        * @author Amstrong
        */
        return this.codigo;
    }
              
    public void setNombre(String nombre){
         /**
        * setNombre
        * Metodo que me permite establecer el nombre de la red social
        * @since  2019
        * @author Amstrong
        */
         this.nombre=nombre;
    }
    public String getNombre(){
      /**
        * getNombre
        * Metodo que me permite obtener el nombre de la red social
        * @since  2019
        * @author Edison
        */
        return this.nombre;  
    }
    public void setUrl(String url){
         /**
        * setUrl
        * Metodo que me permite establecer el url de la red social
        * @since  2019
        * @author Edison
        */
        this.url=url;
    }
    public String getUrl(){
        /**
        * getUrl
        * Metodo que me permite obtener el url de la red social
        * @since  2019
        * @author Edison
        */
        return this.url;
    }

    @Override
    public String toString() {
        return "RedSocial{" + "nombre=" + nombre + ", url=" + url + '}';
    }

            
            
}
