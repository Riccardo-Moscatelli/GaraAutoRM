import java.util.Scanner;

public class GaraAuto {
    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        Giudice giudice = new Giudice();
        boolean stop = false;
        int scelta = 3;

        while(scelta != 2 && scelta != 0) {
            System.out.println("1: inserisci un'auto 2: fai partire la gara 0: quit");
            scelta = scanner.nextInt();
            switch (scelta) {
                case 1:
                    System.out.println("inserisci il numero dell'auto: \n");
                    giudice.addAuto(new Auto(scanner.nextInt(), giudice));
                    break;
                case 2:
                    giudice.inizioGara();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("inserisci 1 o 2\n");
            }
        }
    }
}