package discos;

/**
 *
 * @author franciscojavier.mart
 * @version 1.0
 */
public class Disco {

    /**
     * @return the codigo
     */
    public String getCodigo() {
        return codigo;
    }

    /**
     * @param codigo the codigo to set
     */
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    /**
     * @return the autor
     */
    public String getAutor() {
        return autor;
    }

    /**
     * @param autor the autor to set
     */
    public void setAutor(String autor) {
        this.autor = autor;
    }

    /**
     * @return the titulo
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * @param titulo the titulo to set
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    /**
     * @return the genero
     */
    public String getGenero() {
        return genero;
    }

    /**
     * @param genero the genero to set
     */
    public void setGenero(String genero) {
        this.genero = genero;
    }

    /**
     * @return the duracion
     */
    public int getDuracion() {
        return duracion;
    }

    /**
     * @param duracion the duracion to set
     */
    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    /**
     * Código del libro
     */
    public String codigo = "LIBRE";

    /**
     * Autor del libro
     */
    public String autor;

    /**
     * Titulo del libro
     */
    public String titulo;

    /**
     * Genero de la persona que ha escrio el libro
     */
    public String genero;

    /**
     * Duracion del libro en minutos
     */
    public int duracion; // duración total en minutos

    /**
     *
     * @return
     */
    public String toString() {
    String cadena = "\n------------------------------------------";
        cadena += "\nCódigo: " + this.getCodigo();  
        cadena += "\nAutor: " + this.getAutor();    
        cadena += "\nTítulo: " + this.getTitulo();
        cadena += "\nGénero: " + this.getGenero();
        cadena += "\nDuración: " + this.getDuracion();
        cadena += "\n------------------------------------------";

    return cadena;
  }
}
