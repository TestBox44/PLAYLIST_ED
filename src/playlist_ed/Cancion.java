/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package playlist_ed;
import java.util.Date;
        
public class Cancion {
    private String nombre; //nombre de cacion
    private float duracion; //duracion de la cancion
    private Date fecha; //fecha de publicacion de la cancion

    public Cancion(String nombre, float duracion, Date fecha) {
        this.nombre = nombre;
        this.duracion = duracion;
        this.fecha = fecha;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getDuracion() {
        return duracion;
    }

    public void setDuracion(float duracion) {
        this.duracion = duracion;
    }
   
    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return "nombre=" + nombre + ", duracion=" + duracion + ", fecha=" + fecha;
    }
       
}
