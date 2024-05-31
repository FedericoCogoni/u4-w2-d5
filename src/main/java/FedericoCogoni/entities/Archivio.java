package FedericoCogoni.entities;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Archivio {
    List<Elemento> listaCatalogo;

    public Archivio(List<Elemento> listaCatalogo) {
        this.listaCatalogo = listaCatalogo;
    }

    public void aggiungiElemento(Elemento elemento) {
        if (elemento != null) {
            listaCatalogo.add(elemento);
        }else {
            System.out.println("non puoi aggiungere un elemento nullo");
        }
    }

    public Elemento ricercaPerIsbn(String isbn) {
        if (isbn == null) {
            System.out.println("ISBN non può essere nullo.");
        }
        if (listaCatalogo.isEmpty()) {
            System.out.println("La lista catalogo è vuota.");
        }
        for (Elemento elemento : listaCatalogo) {
            if (isbn.equals(elemento.getIsbn())) {
                return elemento;
            }
        }
        return null;
    }

    public List<Elemento> ricercaPerAnno(int anno) {
        if (listaCatalogo.isEmpty()) {
            System.out.println("lista catalogo vuota");
        }
        if (anno < 0) {
            System.out.println("L'anno non può essere negativo.");
        }
        return listaCatalogo.stream()
                .filter(elemento -> anno == elemento.getAnnoPubblicazione())
                .collect(Collectors.toList());
    }

    public List<Elemento> ricercaPerAutore(String autore) {
        if (listaCatalogo.isEmpty()) {
            System.out.println("La lista catalogo è vuota");
        }
        if (autore == null) {
            System.out.println("inserisci l'autore");
        }
        if (autore.isEmpty()){
            System.out.println("inserisci l'autore");
        }

        return listaCatalogo.stream()
                .filter(elemento -> elemento instanceof Libro && autore.equals(((Libro) elemento).getAutore()))
                .collect(Collectors.toList());
    }

    public void rimuoviXIsbn(String isbn){
        if(listaCatalogo.isEmpty()){
            System.out.println("la lista è già vuota");
        }
        if (isbn == null) {
            System.out.println("inserisci un isbm");
        }
        if (isbn.isEmpty()){
            System.out.println("inserisci un isbm");
        }
        listaCatalogo.removeIf(elemento -> elemento.getIsbn().equals(isbn));
        System.out.println("elemento rimosso con successo!");
    }


    @Override
    public String toString() {
        return "Archivio{" +
                "listaCatalogo=" + listaCatalogo +
                '}';
    }
}
