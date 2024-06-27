/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quiz2;

/**
 *
 * @author Marco
 */
public class Cancion {

    public String id;
    public String titulo;
    public String autor;
    public String duracion;
    public int anio;

    //Constructor
    public Cancion(String id, String titulo, String autor, String duracion, int anio) {
        this.id = id;
        this.titulo = titulo;
        this.autor = autor;
        this.duracion = duracion;
        this.anio = anio;
    }

    public String getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public String getDuracion() {
        return duracion;
    }

    public int getAnio() {
        return anio;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }
}
