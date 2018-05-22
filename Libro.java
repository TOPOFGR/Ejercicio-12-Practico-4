/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practico.pkg4;

/**
 *
 * @author TOPOF
 */
public class Libro {
    private String titulo;
    private boolean original;
    private boolean prestable;

    public String getTitulo() {
        return titulo;
    }
    public boolean getOriginal() {
        return original;
    }
    
    public boolean getPrestable() {
        return prestable;
    }
    
    public boolean esOriginal() {
        return original;
    }
    
    public boolean sePresta() {
        return prestable;
    }

    public void setTitulo(String unTitulo) {
        this.titulo = unTitulo;
    }

    public void setOriginal(boolean unOriginal) {
        this.original = unOriginal;
    }

    public void setPrestable(boolean unPrestable) {
        this.prestable = unPrestable;
    }    

    @Override
    public String toString() {
        String original=null;
        String prestable=null;
        if (this.getOriginal()){
            original="Es original";  
        }
        else{
            original="No es original";
        }
        if (this.getPrestable()){
            prestable = "Se puede prestar";
        }
        else{
            prestable ="No se puede prestar";
        }
        return ("Libro de titulo " + original + ", " + prestable ) ;
    }
}
