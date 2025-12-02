import java.util.ArrayList;

public class Giudice {
    private final ArrayList<Auto> automobili;
    private final ArrayList<Auto> classificaFinale;

    public Giudice() {
        automobili = new ArrayList<>();
        classificaFinale = new ArrayList<>();
    }

    public void addAuto(Auto auto) {
        automobili.add(auto);
    }

    public synchronized void autoArrivata(Auto auto) {
        classificaFinale.add(auto);
        System.out.println("Il giudice registra l'arrivo di " + auto + "\n");
    }

    public void inizioGara() throws InterruptedException {
        System.out.println("Inizio gara...");

        for (int i = 5; i > 0; i--) {
            Thread.sleep(1000);
            System.out.println(i);
        }
        Thread.sleep(1000);
        System.out.println("VIA!");

        for (Auto auto : automobili) {
            auto.start();
        }

        for (Auto auto : automobili) {
            auto.join();
        }

        Thread.sleep(2000);
        stampaClassifica();
    }

    public void stampaClassifica() {
        System.out.println("\n--- CLASSIFICA FINALE ---");
        for (int i = 0; i < classificaFinale.size(); i++) {
            System.out.println((i + 1) + "° posto -> " + classificaFinale.get(i));
        }
    }

    public ArrayList<Auto> getClassifica() {
        return classificaFinale;
    }
}
