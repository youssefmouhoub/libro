
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
    private String numeroReferencia;
    private int vecesPrestado;
    private boolean esLibroDeTexto;

    /**
     * Fija el autor y el titulo del libro a los dados como parametro
     */
    public Libro(String autorLibro, String tituloLibro, int numeroPaginasLibro, boolean libroDeTexto)
    {
        autor = autorLibro;
        titulo = tituloLibro;
        numeroPaginas = numeroPaginasLibro;
        numeroReferencia = "";
        vecesPrestado = 0;
        esLibroDeTexto = libroDeTexto;
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
        String esDeTexto;
        esDeTexto = "S�";
        
        if (esLibroDeTexto == true){
            esDeTexto = "S�";
        }
        
        else {
            esDeTexto = "No";
        }

        System.out.println("T�tulo: " + titulo + ", Autor: " + autor + ", P�ginas: " + numeroPaginas + ", Numero de referencia: " + numeroReferencia + ", Veces Prestado: " + vecesPrestado +  ", Es libro de texto: " + esDeTexto);
    }
    
    public String getdetalles() {
        String esDeTexto;
        esDeTexto = "S�";
        
        if (esLibroDeTexto == true){
            esDeTexto = "S�";
        }
        
        else {
            esDeTexto = "No";
        }
        
        String detalles;
        detalles = "T�tulo: " + titulo + ", Autor: " + autor + ", P�ginas: " + numeroPaginas + ", Numero de referencia: " + numeroReferencia + ", Veces Prestado: " + vecesPrestado + ", Es libro de texto: " + esDeTexto;
        return detalles;
    }
    
    public String getNumeroReferencia() {
        return numeroReferencia;
    }
    
    public void setNumeroReferencia(String introducirNumeroReferencia) {
        if (introducirNumeroReferencia.length() >= 3) {
            numeroReferencia = introducirNumeroReferencia;
        }
        else {
            System.out.println("Error: Numero de referencia no valido");
        }
    }
    
    public void prestar (){
        vecesPrestado = vecesPrestado + 1;
    }
    
    public int getVecesPrestado(){
        return vecesPrestado;
    }
    
    public boolean getEsLibroDeTexto(){
        return esLibroDeTexto;
    }
}
