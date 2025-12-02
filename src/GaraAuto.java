import java.util.Scanner;

public class GaraAuto {
    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        Giudice giudice = new Giudice();
        GestoreFile file = new GestoreFile();
        int scelta = -1;

        while (scelta != 0 && scelta != 2) {
            System.out.println("1) Aggiungi auto");
            System.out.println("2) Avvia gara");
            System.out.println("0) Esci");
            System.out.print("Scelta: ");
            scelta = scanner.nextInt();

            switch (scelta) {
                case 1:
                    System.out.print("Inserisci ID auto: ");
                    int id = scanner.nextInt();
                    giudice.addAuto(new Auto(id, giudice));
                    break;

                case 2:
                    giudice.inizioGara();
                    file.salvaClassifica(giudice.getClassifica());
                    break;

                case 0:
                    System.out.println("Uscita dal programma");
                    break;

                default:
                    System.out.println("Scelta non valida"):
            }
        }
    }
}
