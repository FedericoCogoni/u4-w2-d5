package FedericoCogoni.entities;

import java.util.List;

public class Archivio {
    List<Elemento> listaCatalogo;

    public Archivio(List<Elemento> listaCatalogo) {
        this.listaCatalogo = listaCatalogo;
    }

    public void aggiungiElemento(Elemento elemento) {
        listaCatalogo.add(elemento);
    }

    @Override
    public String toString() {
        return "Archivio{" +
                "listaCatalogo=" + listaCatalogo +
                '}';
    }
}
