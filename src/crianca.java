import java.sql.SQLOutput;

public class crianca {
    String corCabelo;
    String corPele;
    double altura;
    int idade;

    void brincar() {
        System.out.println("Brincando...");
    }

    void correr(double metros) {
        System.out.println("Correndo... " + metros + "metros ");
    }

    void nadar(double metros) {

        System.out.println("Nadando..." + metros + "metros ");
    }

    String sorrir() {
        return ":)";

    }

}

