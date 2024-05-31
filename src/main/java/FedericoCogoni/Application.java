package FedericoCogoni;
import FedericoCogoni.entities.Archivio;
import FedericoCogoni.entities.Elemento;
import FedericoCogoni.entities.Libro;
import FedericoCogoni.entities.Riviste;
import FedericoCogoni.enums.Periodicità;
import java.util.ArrayList;
import java.util.List;

public class Application {

    public static void main(String[] args) {
        List<Elemento> catalogo = new ArrayList<>();
        Archivio archivio = new Archivio(catalogo);



        System.out.println("----------------------------------------AGGIUNGI ELEMENTO---------------------------");
        Libro libro1 = new Libro("prova1", 1990, 90, "ciao", "fantasy");
        Libro libro2 = new Libro("prova2", 1890, 50, "ciao2", "horror");
        Riviste rivista1 = new Riviste("prova3", 2000, 35, Periodicità.SEMESTRALE);
        Riviste rivista2 = new Riviste("prova4", 2020, 40, Periodicità.SETTIMANALE);
        Libro libro3 = new Libro("prova3", 1590, 90, "ciao", "fantasy");

        archivio.aggiungiElemento(libro1);
        archivio.aggiungiElemento(libro2);
        archivio.aggiungiElemento(rivista1);
        archivio.aggiungiElemento(rivista2);

        archivio.aggiungiElemento(libro3);

        System.out.println(archivio);

        System.out.println("----------------------------------------RICERCA PER ISBN--------------------------");
        String isbnDaCercare = rivista2.getIsbn();
        Elemento elementoTrovato = archivio.ricercaPerIsbn(isbnDaCercare);
        if (elementoTrovato != null) {
            System.out.println("Elemento con ISBN " + isbnDaCercare + " trovato : " + elementoTrovato);
        } else {
            System.out.println("Nessun elemento trovato con ISBN corrispondente a: " + isbnDaCercare);
        }

        System.out.println("----------------------------------------RICERCA PER ANNO--------------------------");
        int annoRicerca = 1990;
        List<Elemento> elementiXAnno = archivio.ricercaPerAnno(annoRicerca);
        System.out.println("gli elementi trovati per l'anno : " + annoRicerca + "sono: ");
        for(Elemento elemento : elementiXAnno){
            System.out.println(elemento);
        }


    }

}
