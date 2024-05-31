package FedericoCogoni;
import FedericoCogoni.entities.Archivio;
import FedericoCogoni.entities.Libro;
import FedericoCogoni.entities.Riviste;
import FedericoCogoni.enums.Periodicità;
import java.time.LocalDate;

public class Application {

    public static void main(String[] args) {
    Libro libroProva = new Libro("prova", 1990, 90, "io", "fantasy");
        System.out.println(libroProva);
        Riviste rivista = new Riviste("prova2", 1992, 35, Periodicità.SEMESTRALE);
        System.out.println(rivista);

    }

}
