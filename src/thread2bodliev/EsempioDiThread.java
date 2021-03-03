package thread2bodliev;

// @author Bodliev
 
public class EsempioDiThread implements Runnable{
    
    EsempioDiThread(){
        Thread threadPadre = Thread.currentThread();
        threadPadre.setName("Padre");
        System.out.println(threadPadre);
        Thread threadFiglio1 = new Thread(this, "Figlio");
        Thread threadFiglio2 = new Thread(this, "Nipote");
        System.out.println(threadFiglio1);
        System.out.println(threadFiglio2);
        threadFiglio1.start();
        threadFiglio2.start();
        try{
            Thread.sleep(2000);
        }catch (InterruptedException e){
            System.out.println("Primo thread: Mi hanno interrotto");
        }
        System.out.println("Terminato: " + Thread.currentThread().toString());
    }
    
    public void run(){
        try{
            int i;
            for (i = 1; i < 9; i++) {
                System.out.println("\t\t" + i + " <-- " + Thread.currentThread().toString());
                Thread.sleep(1000);
            }
        }catch (InterruptedException e){
            System.out.println("\t\tThread figlio: Mi hanno interrotto");
        }
        System.out.println("\t\tThread: " + Thread.currentThread().toString());
    }
}
