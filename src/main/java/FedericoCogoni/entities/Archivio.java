package FedericoCogoni.entities;

import java.util.ArrayList;
import java.util.List;

public class Archivio {
    List<Elemento> listaCatalogo;

    public Archivio(List<Elemento> listaCatalogo) {
        this.listaCatalogo = listaCatalogo;
    }

    public void aggiungiElemento(Elemento elemento) {
        listaCatalogo.add(elemento);
    }

    public Elemento ricercaPerIsbn(String isbn) {
        for (Elemento elemento : listaCatalogo) {
            if (elemento.getIsbn().equals(isbn)) {
                return elemento;
            }
        }
        return null;
    }

    public List<Elemento> ricercaPerAnno (int anno) {
        List<Elemento> risultato = new ArrayList<>();
        for(Elemento elemento:listaCatalogo) {
            if(elemento.getAnnoPubblicazione() == anno) {
                risultato.add(elemento);
            }
        }
        return risultato;
    }


    @Override
    public String toString() {
        return "Archivio{" +
                "listaCatalogo=" + listaCatalogo +
                '}';
    }
}
