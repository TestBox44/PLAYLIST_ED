package playlist_ed;
public class Playlist {
    private Cancion[] listacanciones;
    private String titulo;
    private int tamanio=0;

    public Playlist() {
        listacanciones=new Cancion[0];
        titulo="";
    }

    public Playlist(String titulo) {
        listacanciones=new Cancion[0];
        this.titulo = titulo;
    }
    
    public void agregarCancion(Cancion nuevacancion){
        Cancion[] nuevalistacanciones = new Cancion[tamanio+1];
        for (int i = 0; i < tamanio; i++) {
            nuevalistacanciones[i]=listacanciones[i];
        }
        nuevalistacanciones[tamanio]=nuevacancion;
        listacanciones=nuevalistacanciones;
        tamanio++;
    }
    public void eliminarCancion(int index){
        if (tamanio>0){
            if(index>=0&&index<tamanio){
                Cancion[] nuevalistacanciones = new Cancion[tamanio-1];
                int j=nuevalistacanciones.length-1;
                for (int i = tamanio-1; i >= 0; i--) {
                    if(i!=index){
                        nuevalistacanciones[j]=listacanciones[i];
                        j--;
                    }
                }
                listacanciones=nuevalistacanciones;
                tamanio--;
            }else{
                System.out.println("El indice de cancion esta fuera de los limites...");
            }
        }else{
            System.out.println("La lista de canciones esta vacía");
        }
    }
    
    public int tamanio(){
        return tamanio;
    }
    
    public boolean estaVacio(){
        return tamanio==0;
    }
    
    public void vaciarLista(){
        listacanciones=new Cancion[0];
        tamanio=0;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    
    public Cancion obtenerCancion(int index){
        if(index>=0&&index<tamanio){
            return listacanciones[index];
        }else{
            System.out.println("El indice de cancion esta fuera de los limites...");
            return null;
        }
    }
    
    public void mostrarCanciones(){
        if(tamanio>0){
            for (int i = 0; i < tamanio; i++) {
            System.out.println(listacanciones[i].toString());
            }
        }
        else{
            System.out.println("La lista de canciones esta vacía");
        }
    }
    
    public void ordenarXNombre(int sentido){
        Cancion aux;
        for (int i = 1; i < tamanio; i++) {
            aux = listacanciones[i];
            for (int j = i-1; j >=0 && listacanciones[j].getNombre().compareTo(aux.getNombre())*sentido>0; j--) {
                listacanciones[j+1]=listacanciones[j];
                listacanciones[j]=aux;
            }
            
        }
    }
    public void ordenarXDuracion(int sentido){
        Cancion aux;
        for (int i = 1; i < tamanio; i++) {
            aux = listacanciones[i];
            for (int j = i-1; j >=0 && Float.compare(listacanciones[j].getDuracion(), aux.getDuracion())*sentido>0; j--) {
                listacanciones[j+1]=listacanciones[j];
                listacanciones[j]=aux;
            }
        }
    }
    
    public void ordenarXFecha(int sentido){
        Cancion aux;
        for (int i = 1; i < tamanio; i++) {
            aux = listacanciones[i];
            for (int j = i-1; j >=0 && listacanciones[j].getFecha().compareTo(aux.getFecha())*sentido>0; j--) {
                listacanciones[j+1]=listacanciones[j];
                listacanciones[j]=aux;
            }
        }
    }
}
