public class Auto extends Thread{
 int numero;
 int metripercorsi;
 Giudice giudice;

 public Auto(int numero, Giudice giudice) {
  this.numero = numero;
  this.metripercorsi = 0;
  this.giudice = giudice;
 }

 public void addMetripercorsi() {
  int numero = (int)(Math.random() * 200);
  this.metripercorsi += numero;
 }

 @Override
 public void run() {
  while (metripercorsi < 1000) {
   addMetripercorsi();
   System.out.println("Auto " + numero + " ha percorso " + metripercorsi + "m\n");
   try {
    Thread.sleep(2000 + (int)(Math.random() * 5000));
   } catch (InterruptedException e) {
    throw new RuntimeException(e);
   }

  }
  System.out.println("Auto " + numero + " ha finito");
  giudice.autoArrivata(this);
 }

 @Override
 public String toString() {
  return "auto " + numero;
 }
}