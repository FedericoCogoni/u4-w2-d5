package FedericoCogoni.entities;

import com.github.javafaker.Faker;

public abstract class Elemento {
    private String isbn;
    private String titolo;
    private int annoPubblicazione;
    private int pagine;

    public Elemento(String titolo, int annoPubblicazione, int pagine) {
        isbn = randomIsbn();
        this.titolo = titolo;
        this.annoPubblicazione = annoPubblicazione;
        this.pagine = pagine;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getTitolo() {
        return titolo;
    }

    public int getAnnoPubblicazione() {
        return annoPubblicazione;
    }

    public int getPagine() {
        return pagine;
    }

    Faker faker = new Faker();
    public String randomIsbn() {
        return faker.code().isbn10();
    }

    @Override
    public String toString() {
        return "Elemento" +
                "isbn='" + isbn + '\'' +
                ", titolo='" + titolo + '\'' +
                ", annoPubblicazione=" + annoPubblicazione +
                ", pagine=" + pagine + " " ;

    }
}
