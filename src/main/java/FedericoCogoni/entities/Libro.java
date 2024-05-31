package FedericoCogoni.entities;

import java.time.LocalDate;

public class Libro extends Elemento{
    private String autore;
    private String genere;

    public Libro( String titolo, int annoPubblicazione, int pagine, String autore, String genere) {
        super( titolo, annoPubblicazione, pagine);
        this.autore = autore;
        this.genere = genere;
    }

    public String getAutore() {
        return autore;
    }

    public String getGenere() {
        return genere;
    }

    @Override
    public String toString() {
        return "Libro{" +
                " " + super.toString() +
                "autore='" + autore + '\'' +
                ", genere='" + genere + "'" +
                " }";

    }
}
