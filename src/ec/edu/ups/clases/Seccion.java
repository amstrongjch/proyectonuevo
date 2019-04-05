package ec.edu.ups.clases;

import java.util.ArrayList;
import java.util.List;

/**
 * EstructuraPeriodico
 * Clase que permite clasificar las diferentes secciones del periodico digital
 * @version 2.0
 * @since  2019
 * @author amstrong
 */

public class Seccion {
    
    private String nombre;
    private Noticia noticia[];
    private List<Noticia>noticias;
//los constructores es para instanciar una clase
    public Seccion(){
        noticias=new ArrayList<>();
    }
    public String getNombre() {
        /**
        * EstructuraPeriodico
        * metodo que permite obtener el nombre de la seccion
        * @version 2.0
        * @since  2019
        * @author amstrong
        */
        return nombre;
   }

    public void setNombre(String nombre) {
         /**
        * EstructuraPeriodico
        * metodo que permite establecerse el nombre de la seccion
        * @version 2.0
        * @since  2019
        * @author amstrong
        */
        this.nombre = nombre;
    }
    public void agregarNoticia(Noticia noticia){//metodo
        
        noticias.add(noticia);
        
    }
    @Override
    public String toString(){
        return "seccion("+"nombre=" + nombre +", noticias= "+ noticias+')';
    }
    
}
