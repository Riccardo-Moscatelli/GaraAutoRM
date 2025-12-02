public class Auto extends Thread {
    private final int numero;
    private int metriPercorsi;
    private final Giudice giudice;

    public Auto(int numero, Giudice giudice) {
        this.numero = numero;
        this.metriPercorsi = 0;
        this.giudice = giudice;
    }

    private void avanzaCasualmente() {
        metriPercorsi += (int)(Math.random() * 200);
    }

    @Override
    public void run() {
        while (metriPercorsi < 1000) {
            avanzaCasualmente();
            System.out.println("Auto " + numero + " ha percorso " + metriPercorsi + " metri");

            try {
                Thread.sleep(2000 + (int)(Math.random() * 5000));
            } catch (InterruptedException e) {
                System.out.println("Errore thread auto " + numero);
            }
        }

        System.out.println("Auto " + numero + " ha completato la gara!");
        giudice.autoArrivata(this);
    }

    @Override
    public String toString() {
        return "Auto " + numero;
    }
}
