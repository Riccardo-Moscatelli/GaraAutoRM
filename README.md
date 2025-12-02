GaraAuto
Descrizione

Questo programma simula una gara di auto.
Ci sono quattro classi principali: Auto, Giudice, GaraAuto e GestoreFile.
Ogni auto corre fino a 1000 metri e viene registrata la classifica finale.

Classi
Auto
Rappresenta un’auto.
ùnumero: il numero dell’auto
metripercorsi: metri percorsi
giudice: il giudice della gara
Funzioni:
Aumenta i metri percorsi in modo casuale tra 0 e 200.
Quando arriva a 1000 metri, chiama il giudice per essere registrata in classifica.
Ogni auto è un thread e usa il metodo run().
Giudice
Controlla la gara.
Tiene due liste:
Tutte le auto partecipanti
La classifica finale
Funzioni:
Metodo inizioGara(): fa partire tutte le auto e aspetta che finiscano.
Alla fine stampa la classifica finale.
GaraAuto
La classe principale con main.
Funzioni:
Crea il giudice.
Mostra un menu all’utente:
Inserire un’auto
Avviare la gara
Uscire dal programma
Quando parte la gara, chiama il metodo inizioGara() del giudice.
GestoreFile
Gestisce il file della classifica.
Funzioni:
Scrive la classifica finale su Classifica.txt.
Legge la classifica da un file precedente se esiste.
Come funziona
Avvia il programma con GaraAuto.
Scegli dal menu:
Inserisci un’auto
Avvia la gara
Esci dal programma
Alla fine:La classifica viene mostrata sullo schermo
La classifica viene salvata su Classifica.txt
La classifica viene mostrata sullo schermo

La classifica viene salvata su Classifica.txt
