
package s9_listas_carlosespinal;

import java.util.ArrayList;

public class Libro {

    private String Titulo;
    private String Autor;
    private int NumPaginas;
    private String Genero;
    
    public ArrayList<Libro> registro = new ArrayList<>();

    public Libro() {
    }
    
    

    public Libro(String Titulo, String Autor, int NumPaginas, String Genero) {
        this.Titulo = Titulo;
        this.Autor = Autor;
        this.NumPaginas = NumPaginas;
        this.Genero = Genero;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    public String getAutor() {
        return Autor;
    }

    public void setAutor(String Autor) {
        this.Autor = Autor;
    }

    public int getNumPaginas() {
        return NumPaginas;
    }

    public void setNumPaginas(int NumPaginas) {
        this.NumPaginas = NumPaginas;
    }

    public String getGenero() {
        return Genero;
    }

    public void setGenero(String Genero) {
        this.Genero = Genero;
    }

    @Override
    public String toString() {
        String fin = "";
        fin += "Nombre del libro: "+Titulo+"\n"
                +"Nombre del Autor: "+ Autor+"\n"
                +"Numero de Paginas: "+NumPaginas+"\n"
                +"Genero del libro: "+Genero+"\n";
        
        //return "Libro{" + "Titulo=" + Titulo + ", Autor=" + Autor + ", NumPaginas=" + NumPaginas + ", Genero=" + Genero + '}';
        return fin;
    }
    
    
    
}
