package playlist_ed;

import java.util.Date;

public class PLAYLIST_ED {

    public static void main(String[] args) {
        Playlist p1=new Playlist();
        Date d1 = new Date("04/02/2010");
        Cancion c1=new Cancion("Niña Bonita",3.0f,d1);
        Date d2 = new Date("01/03/2005");
        Cancion c2=new Cancion("Cholo soy",3.5f,d2);
        Date d3 = new Date("10/11/2020");
        Cancion c3=new Cancion("That's Life",4f,d3);
        p1.agregarCancion(c1);
        p1.agregarCancion(c2);
        p1.agregarCancion(c3);
        for (int i = 0; i < p1.listacanciones.length; i++) {
            System.out.println(p1.listacanciones[i].getNombre());
        }
        p1.ordenarXNombre();
        System.out.println("---------------------------------------");
        for (int i = 0; i < p1.listacanciones.length; i++) {
            System.out.println(p1.listacanciones[i].getNombre());
        }
    }
    
}
