package playlist_ed;
import java.util.ArrayList; 
public class Playlist {
    Cancion[] listacanciones;

    public Playlist() {
        listacanciones=new Cancion[0];
    }
    
    public void agregarCancion(Cancion nuevacancion){
        Cancion[] nuevalistacanciones = new Cancion[listacanciones.length+1];
        for (int i = 0; i < listacanciones.length; i++) {
            nuevalistacanciones[i]=listacanciones[i];
        }
        nuevalistacanciones[listacanciones.length]=nuevacancion;
        listacanciones=nuevalistacanciones;
    }
    public void eliminarCancion(int index){}
    public void ordenarXNombre(){
        Cancion aux;
        for (int i = 1; i < listacanciones.length; i++) {
            aux = listacanciones[i];
            for (int j = i-1; j >=0 && listacanciones[j].getNombre().compareTo(aux.getNombre())>0; j--) {
                listacanciones[j+1]=listacanciones[j];
                listacanciones[j]=aux;
            }
        }
    }/*
    public void ordenarXDuracion(){
        Cancion aux;
        for (int i = 1; i < listacanciones.length; i++) {
            aux = listacanciones[i];
            for (int j = i-1; j >=0 && array[j]>aux; j--) {
                array[j+1]=array[j];
                array[j]=aux;
            }
        }
    }
    public void ordenarXFecha(){
        Cancion aux;
        for (int i = 1; i < listacanciones.length; i++) {
            aux = listacanciones[i];
            for (int j = i-1; j >=0 && array[j]>aux; j--) {
                array[j+1]=array[j];
                array[j]=aux;
            }
        }
    }*/
}
