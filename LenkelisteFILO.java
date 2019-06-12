//Bruker en dummynode (start), som ikke inneholder data
//QUEUE - elementer legges til bakerst i lenkelisten, og fjernes fra bakerst.
//Dette er en dobbelt lenkeliste.
public class LenkelisteFIFO<T> {
  Node forste;
  Node siste;
  int lengde = 0;
  //Konstruktør for lenkeliste
  public LenkelisteFIFO(){
    forste = new Node(null);
    siste = forste;
  }
  //Legger til data bakerst i lenkelisten:
  public void leggTil(T t){
    Node ny = new Node(t);
    ny.forrige = siste;
    siste.neste = ny;
    siste = ny;
    lengde ++;
  }
  //Fjerner siste node i lenkelisten, returnerer "data" fra den siste noden:
  public T fjern(){
    Node fjernes = siste;
    //Fjerner referansen til siste-noden, slik at garbagecollector henter den:
    siste = fjernes.forrige;
    siste.neste = null;

    lengde --;
    return fjernes.data;
  }
  //Alternativ metode, virker å være mer standard måte å gjøre det på, hvor vi iterer gjennom listen helt til vi finner bakerste node:
  /*public void leggTil(T t){
    Node ny = new Node(t);
    Node temp = forste;
    while (temp.neste != null){
      temp = temp.neste;
    }
    temp.neste = ny;
    lengde ++;
  }*/
//Nodeklasse:
  private class Node {
    Node neste;
    Node forrige;
    public T data;

    public Node(T data){
      this.data = data;
    }
  }
}
