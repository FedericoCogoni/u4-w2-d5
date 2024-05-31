package FedericoCogoni;

import FedericoCogoni.entities.Archivio;
import FedericoCogoni.entities.Elemento;
import FedericoCogoni.entities.Libro;
import FedericoCogoni.entities.Riviste;
import FedericoCogoni.enums.Periodicità;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Application {

    public static void main(String[] args) {
        List<Elemento> catalogo = new ArrayList<>();
        Archivio archivio = new Archivio(catalogo);
        Scanner scanner = new Scanner(System.in);

        System.out.println("----------------------------------------AGGIUNGI ELEMENTO---------------------------");
        Libro libro1 = new Libro("prova1", 1990, 90, "ciao", "fantasy");
        Libro libro2 = new Libro("prova2", 1890, 50, "ciao2", "horror");
        Riviste rivista1 = new Riviste("prova3", 1990, 35, Periodicità.SEMESTRALE);
        Riviste rivista2 = new Riviste("prova4", 2020, 40, Periodicità.SETTIMANALE);
        Libro libro3 = new Libro("prova5", 1590, 90, "ciao", "fantasy");
        Riviste rivista3 = new Riviste("prova6", 2022, 20, Periodicità.MENSILE);

        archivio.aggiungiElemento(libro1);
        archivio.aggiungiElemento(libro2);
        archivio.aggiungiElemento(rivista1);
        archivio.aggiungiElemento(rivista2);
        archivio.aggiungiElemento(libro3);
        archivio.aggiungiElemento(rivista3);

        System.out.println(archivio);

        System.out.println("----------------------------------------RIMOZIONE ELEMENTO--------------------------");
        String isbnDaRimuovere = libro1.getIsbn();
        archivio.rimuoviXIsbn(isbnDaRimuovere);
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
        System.out.println("Inserisci l'anno da cercare:");
        int annoRicerca = scanner.nextInt();
        List<Elemento> elementiXAnno = archivio.ricercaPerAnno(annoRicerca);
        if (elementiXAnno.isEmpty()){
            System.out.println("Nessun elemento trovato pubblicato nel: " + annoRicerca);
        } else {
            System.out.println("Gli elementi trovati per l'anno " + annoRicerca + " sono: ");
            for (Elemento elemento : elementiXAnno) {
                System.out.println(elemento);
            }
        }

        System.out.println("----------------------------------------RICERCA PER AUTORE--------------------------");
        System.out.println("Inserisci l'autore da cercare:");
        String autoreRicerca = scanner.nextLine(); // Leggi l'autore dall'input utente
        List<Elemento> elementiXAutore = archivio.ricercaPerAutore(autoreRicerca);
        if (elementiXAutore.isEmpty()) {
            System.out.println("Nessun elemento trovato per l'autore: " + autoreRicerca);
        } else {
            System.out.println("Gli elementi trovati per l'autore '" + autoreRicerca + "' sono:");
            for (Elemento elemento : elementiXAutore) {
                System.out.println(elemento);
            }
        }

        scanner.close();
    }

}
