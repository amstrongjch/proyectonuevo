/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.clase1;

import ec.edu.ups.clases.RedSocial;

/**
 *
 * @author Ordenador
 */
public class prueba {
    public static void main(String[] args) {
        RedSocial facebook=new RedSocial();
        facebook.setCodigo(1);
        facebook.setNombre("facebook");
        facebook.setUrl("www.facebook.com");
      
        int cod = facebook.getCodigo();
        System.out.println("Codigo: "+cod);
        
        String op=facebook.getNombre();
        System.out.println("nombre: "+ op);
        
       String leer=facebook.getUrl();
        System.out.println("url: "+ leer);
        
    }
}
