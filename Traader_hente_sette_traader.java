
  public class HenteTraad implements Runnable{
    Monitor monitor;
    CountDownLatch latch;
    //Bruker konstruktør for å få tilgang til monitor, og countdownlatch:
    public HenteTraad(Monitor m, CountDownLatch l){
      monitor = m;
      latch = l;
    }
    //Dette er selve oppgaveutføringen for tråden:
    @Override
    public void run(){
      try {
        /*OBS: VAnligvis har vi en eller annen condition her,
        da trådene pleier å gjøre noe x-antall ganger.*/
        monitor.hentUt();
        //Gir beskjed til countDown latch om at tråden er ferdig
        latch.countDown();
        return;
      }catch (InterruptedException e){

      }
    }
  }
  public class SetteTraad implements Runnable{
    Monitor monitor;
    CountDownLatch latch;
    //Bruker konstruktør for å få tilgang til monitor, og countdownlatch:
    public HenteTraad(Monitor m, CountDownLatch l){
      monitor = m;
      latch = l;
    }

    @Override
    public void run(){
      try {
        /*OBS: VAnligvis har vi en eller annen condition her,
        da trådene pleier å gjøre noe x-antall ganger.*/
        monitor.settInn(5);
        latch.countDown();



      }catch (InterruptedException e){


      }
    }
  }
