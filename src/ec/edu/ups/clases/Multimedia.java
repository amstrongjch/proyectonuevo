
package ec.edu.ups.clases;

import java.util.Date;

/**
    * Multimedia
    * Clase que permite editar diferentes tipos de archivo multimedia del periodeico digital
    * @since  2019
    * @author Amstrong
    */

public class Multimedia {
    private byte[] archivo;
    private String formato;
    private double tamañobyts;
    private String path;
    private String nombre;
    private Date fechaCreacion;
    private Date fechaModificacion;

    public String getFormato() {
        /**
        * getFormato
        * Metodo que me permite obtener el formato del archivo multimedia
        * @since  2019
        * @author Amstrong
        */
        return formato;
    }

    public void setFormato(String formato) {
         /**
        * setFormato
        * Metodo que me permite establecer el formato del archivo multimedia
        * @since  2019
        * @author Amstrong
        */
        this.formato = formato;
    }

    public double getTamañobyts() {
        /**
        * getTamañobyts
        * Metodo que me permite obtener el tamaño del archivo multimedia
        * @since  2019
        * @author Edison
        */
        return tamañobyts;
    }

    public void setTamañobyts(double tamañobyts) {
        /**
        * setTamañobyts
        * Metodo que me permite establecer el tamaño del archivo multimedia
        * @since  2019
        * @author Amstrong
        */
        this.tamañobyts = tamañobyts;
    }

    public String getPath() {
        /**
        * getPath
        * Metodo que me permite obtener la ubicación del archivo multimedia
        * @since  2019
        * @author Amstrong
        */
        return path;
    }

    public void setPath(String path) {
         /**
        * setPath
        * Metodo que me permite establecer la ubicación del archivo multimedia
        * @since  2019
        * @author Amstrong
        */
        this.path = path;
    }

    public String getNombre() {
        /**
        * getNombre
        * Metodo que me permite obtener el nombre del archivo multimedia
        * @since  2019
        * @author Amstrong
        */
        return nombre;
    }

    public void setNombre(String nombre) {
        /**
        * setNombre
        * Metodo que me permite establecer el nombre del archivo multimedia
        * @since  2019
        * @author Amstrong
        */
        this.nombre = nombre;
    }
    public Date getFechaCreacion(){
        /**
        *getDate
        * Metodo que me permite obtener la fecha del archivo multimedia
        * @since  2019
        * @author Amstrong
        */
        return fechaCreacion;
    }
    //public Date setFechaCreacion(){
        /**
        * setNombre
        * Metodo que me permite establecer la fecha del archivo multimedia
        * @since  2019
        * @author Amstrong
        */
        //this.fechaCreacion=fechaCreacion;
    //}
    
    
}
