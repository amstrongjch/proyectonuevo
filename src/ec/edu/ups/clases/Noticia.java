
package ec.edu.ups.clases;

import java.util.Date;

/**
 * Noticia
 * Clase que permite editar(crear, modificar, eiminar, etc.) las noticias del periodeico digital
 * @since  2019
 * @author Amstrong
 */


public class Noticia {
    
    private String titulo;
    private String autor;
    private Date fechaPublicacion;
    private String contenido;
    private String lugar;
    private Multimedia[] multimedia;

    public String getTitulo() {
         /**
        * getTitulo
        * Metodo que me permite obtener el titulo de la noticia
        * @since  2019
        * @author Amstrong
        */
        return titulo;
    }

    public void setTitulo(String titulo) {
         /**
        * setTitulo
        * Metodo que me permite establecer el nombre de la seccion
        * @since  2019
        * @author Amstrong
        */
        this.titulo = titulo;
    }

    public String getAutor() {
        /**
        * getAutor
        * Metodo que me permite obtener el Autor de la noticia
        * @since  2019
        * @author Amstrong
        */
        return autor;
    }

    public void setAutor(String autor) {
        /**
        * setAutor
        * Metodo que me permite establecer el Autor de la noticia
        * @since  2019
        * @author Amstrong
        */
        this.autor = autor;
    }

    public Date getFecha() {
        /**
        * getFecha
        * Metodo que me permite obtener la fecha de publicación de la noticia
        * @since  2019
        * @author Amstrong
        */
        return fechaPublicacion;
    }

    public void setFecha(Date fecha) {
         /**
        * setFecha
        * Metodo que me permite establecer la fecha de publicación de la noticia
        * @since  2019
        * @author Amstrong
        */
        this.fechaPublicacion = fecha;
    }

    public String getContenido()
    /**
        * getContenido
        * Metodo que me permite obtener el contenido de la noticia
        * @since  2019
        * @author Amstrong
        */{
        return contenido;
    }

    public void setContenido(String contenido) {
        /**
        * setContenido
        * Metodo que me permite establecer el contenido de la noticia
        * @since  2019
        * @author Amstrong
        */
        this.contenido = contenido;
    }
   
     public String getLugar(){
        return lugar;
        
    }
    public void setLugar(){
        this.lugar=lugar;
        
    }
    @Override
    public String toString(){
        return "Noticia("+ "titulo="+ titulo + ", autor="+ autor+')';
    }
    
}
