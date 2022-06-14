package playlist_ed;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class PLAYLIST_ED {

    public static void main(String[] args) throws ParseException {
        
        SimpleDateFormat format1 = new SimpleDateFormat("MM/dd/yyyy");
        
        Playlist p1=new Playlist();
        Date d1 = format1.parse("04/02/2010");
        Cancion c1=new Cancion("Niña Bonita",10.0f,d1);
        Date d2 = format1.parse("01/03/2005");
        Cancion c2=new Cancion("Cholo soy",6.0f,d2);
        Date d3 = format1.parse("10/11/2020");
        Cancion c3=new Cancion("That's Life",1.0f,d3);
        p1.agregarCancion(c1);
        p1.agregarCancion(c2);
        p1.agregarCancion(c3);
        for (Cancion listacancione : p1.listacanciones) {
            System.out.println(listacancione.getNombre());
        }
        p1.ordenarXDuracion();
        System.out.println("---------------------------------------");
        for (Cancion listacancione : p1.listacanciones) {
            System.out.println(listacancione.getNombre());
        }
    }
    
}
