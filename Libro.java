
/**
 * Una clase que representa objetos libro.
 * Esta clase podria formar parte de un
 * proyecto mas grande, como el de una aplicacion de
 * una biblioteca
 * 
 * @author Miguel Bayon 
 * @version 1.2
 */
public class Libro {

    private String autor;
    private String titulo;
    private int numeroPaginas;

    /**
     * Fija el autor y el titulo del libro a los dados como parametro
     */
    public Libro(String autorLibro, String tituloLibro, int numeroPaginasLibro)
    {
        autor = autorLibro;
        titulo = tituloLibro;
        numeroPaginas = numeroPaginasLibro;
    }
    
    public String getAutor () {
        return autor;
    }
    
    public String getTitulo () {
        return titulo;
    }
    
    public int getNumeroPaginas () {
        return numeroPaginas;
    }
    
    public void imprimeAutor() {
        System.out.println("El autor del libro: " + autor);
    }
    
    public void imprimeTitulo() {
        System.out.println("El titulo del libro: " + titulo);
    }
    
    public void imprimirDetalles() {
        System.out.println("Título: " + titulo + ", Autor: " + autor + ", Páginas: " + numeroPaginas);
    }
    
    public String getdetalles() {
        String detalles;
        detalles = "Título: " + titulo + ", Autor: " + autor + ", Páginas: " + numeroPaginas;
        return detalles;
    }
}
