package playlist_ed;
public class Playlist {
    Cancion[] listacanciones;
    public void agregarCancion(Cancion nuevacancion){}
    public void eliminarCancion(int index){}
    public void ordenarXNombre(){
        public int[] ordenarInsercion(int[] array){
        int aux;
        for (int i = 1; i < array.length; i++) {
            aux = array[i];
            for (int j = i-1; j >=0 && array[j]>aux; j--) {
                array[j+1]=array[j];
                array[j]=aux;
            }
        }
        return array;
        }
    }
    public void ordenarXDuracion(){}
    public void ordenarXFecha(){}
}
