import org.example.AfisareProduse;
import org.example.Produs;
import org.example.AfisareProduse;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

public class FisierAfisareProduse implements AfisareProduse {
    private String numeFisier;

    public FisierAfisareProduse(String numeFisier) {
        this.numeFisier = numeFisier;
    }

    @Override
    public void afiseaza(List<Produs> produse) {
        try (PrintWriter writer = new PrintWriter(new FileWriter(numeFisier))) {
            produse.forEach(produs -> writer.println(produs.toString()));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
