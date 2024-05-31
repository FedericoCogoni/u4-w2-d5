package FedericoCogoni.entities;

import FedericoCogoni.enums.Periodicità;

import java.time.LocalDate;

public class Riviste extends Elemento{

    private Periodicità periodicità;

    public Riviste( String titolo, int annoPubblicazione, int pagine, Periodicità periodicità) {
        super( titolo, annoPubblicazione, pagine);
        this.periodicità = periodicità;
    }


    @Override
    public String toString() {
        return "Riviste{" +
                " " + super.toString() + " " +
                "periodicità= " + periodicità + "}";

    }
}
