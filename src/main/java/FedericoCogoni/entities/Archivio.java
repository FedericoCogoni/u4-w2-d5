package FedericoCogoni.entities;

import java.util.List;

public class Archivio {
    List<Elemento> listaCatalogo;

    public Archivio(List<Elemento> listaCatalogo) {
        this.listaCatalogo = listaCatalogo;
    }

    @Override
    public String toString() {
        return "Archivio{" +
                "listaCatalogo=" + listaCatalogo +
                '}';
    }
}
