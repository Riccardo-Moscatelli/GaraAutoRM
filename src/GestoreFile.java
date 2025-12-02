import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class GestoreFile {

    public void salvaClassifica(ArrayList<Auto> classificaFinale) {
        try (FileWriter writer = new FileWriter("Classifica.txt")) {
            writer.write("Classifica auto:\n\n");
            for (int i = 0; i < classificaFinale.size(); i++) {
                writer.write((i + 1) + "° posto -> " + classificaFinale.get(i) + "\n");
            }
            System.out.println("Classifica salvata su file!");
        } catch (IOException e) {
            System.out.println("Errore nella scrittura del file");
        }
    }
}
