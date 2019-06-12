
  /*
  Monitoren er den klassen som faktisk holder på kritiske regioner, og som oftest er det objektet
  som manipulerer kritiske regioner.
  */
  public class Monitor{
    //Trenger bare en lås som kan brukes for alle metoder:
    Lock laas = new ReentrantLock();
    //Lager condition fra låsobjekt. .await() når noe er tomt, .signal() når det ikke er tomt.
    Condition ikkeTom = laas.newCondition();

    ArrayList<int> intBeholder = new ArrayList<int>();

    public void settInnthrows InterruptedException(int i){
      //Låser før man manipulerer kritisk region:
      laas.lock();
      try {
        intBeholder.add(i); //kan også brukes med index: .add(int index, elem), legger til bakerst.
        ikkeTom.signal(); //Signaliserer til tråder som eventuelt venter, om at listen ikke er tom.
      }finally {
        //må alltid låse opp i finally, slik at vi er garantert at dette alltid skjer:
        laas.unlock();
      }
    }
    //henter det siste elementet i listen:
    public int hentUt()throws InterruptedException{
      laas.lock();
      try {
        //Dette er betingelsen som gjør at metoden må vente: OBS: Må være while, ikke if.
        while (intBeholder.size() < 1){
          ikkeTom.await();
        }
        int returVerdi = intBeholder[-1];
        intBeholder.remove(-1);

        return returVerdi;
      }finally {
        laas.unlock();
      }
    }

  }
