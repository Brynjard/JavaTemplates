import java.util.concurrent.CountDownLatch;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.Condition;
import java.util.ArrayList;

/*
Har en arraylist<int>, hvor vi har to trådklasser som setter inn tallet 5,
og henter ut tallet 5 fra listen.
Bruker konseptene: CountdownLatch, lock, condition, monitor.*/
  //Hovedprogram:
  public static void main(String[] args){
    //lager ett monitorobjekt som kan brukes av begge trådklassene:
    Monitor monitor = new Monitor();
    //lager en countdown latch, skal ha 30 tråder:
    CountDownLatch latch = new CountDownLatch(30);
    //Starter 30 tråder:
    for (int i = 0; i < 15; i++){
      Thread traad = new Thread(new HenteTraad(monitor, latch));
      traad.start();
    }
    for (int i = 0; i < 15; i++){
      Thread traad = new Thread(new SetteTraad(monitor, latch));
      traad.start();
    }
    //Hovedtråden venter til alle 30 arbeidere har gitt beskjed om at de er ferdige:
    try{
      latch.await();
    }
    catch(Exception e){
      e.printStackTrace();
    }

    System.out.println("Program ferdig.");
  }
