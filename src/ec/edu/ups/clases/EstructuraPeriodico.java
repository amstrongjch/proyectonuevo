
package ec.edu.ups.clases;

import java.util.Date;
/**
 * EstructuraPeriodica
 * Clase que permite estructurar el periodico digital
 * @since 2019
 * author Amstrong
*/


public class EstructuraPeriodico {
    
    private String ubicacion;
    private String nombre;
    private String periodico;
    private Date fecha;
    private Seccion[] secciones;
    private RedSocial[] redesSociales;
    private String encabezado;

    public String getUbicacion() {
        /**
        * getUbicacion
        * metodo que permite obtener una ubicacion en el periodico digital
        * @since 2019
        * author Amstrong
        */
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        /**
        * setUbicacion
        * Metodo que permite establecerse una ubicacion en el periodico digital
        * @since 2019
        * author Amstrong
        */
        this.ubicacion = ubicacion;
    }

    public String getNombre() {
         /**
        * getNombre
        * Metodo que me permite obtener el nombre de la ubicación periodico digital
        * @since  2019
        * @author Amstrong
        */
        return nombre;
    }

    public void setNombre(String nombre) {
         /**
        * setNombre
        * Metodo que me permitestablecer obtener el nombre de la ubicación periodico digital
        * @since  2019
        * @author Amstrong
        */
        this.nombre = nombre;
    }

    public String getPeriodico() {
         /**
        * getPeriodico
        * Metodo que me permitestablecer obtener el periodico
        * @since  2019
        * @author Amstrong
        */
        return periodico;
    }

    public void setPeriodico(String periodico) {
        /**
        * setPeriodico
        * Metodo que me permitestablecer establecer el periodico
        * @since  2019
        * @author Amstrong
        */
        this.periodico = periodico;
    }

    public Date getFecha() {
        /**
        * getFecha
        * Metodo que me permite obtener la fecha de publicacion del periodico digital
        * @since  2019
        * @author Amstrong
        */
        return fecha;
    }

    public void setFecha(Date fecha) {
         /**
        * setFecha
        * Metodo que me permite establecer la fecha de publicacion del periodico digital
        * @since  2019
        * @author Amstrong
        */
        this.fecha = fecha;
    }
    public String getEncabezado(){
         /**
        * getFecha
        * Metodo que me permite obtener el encabezado en el periodico digital
        * @since  2019
        * @author Amstrong
        */
         return encabezado;
    }
    public void setEncabezado(String encabezado){
        
         /**
        * setFecha
        * Metodo que me permite establecer el encabezado en el periodico digital
        * @since  2019
        * @author Amstrong
        */
         this.encabezado=encabezado;
    }
    
    
}
