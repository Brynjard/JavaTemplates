//Bruker en dummynode (start), som ikke inneholder data
//First in - first out.
//Elementer legges til bakerst, og hentes forrest.
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
  //Fjerner første node i lenkelisten, returnerer "data" fra den første noden:
  public T fjern(){
    Node fjernes = forste.neste;
    //Fjerner referanse til start-node:
    fjernes.forrige = null;
    //Referansen fra noden etter fjernes, skal settes til forste:
    fjernes.neste.forrige = forste;
    //Omdirigerer referansen forste.neste til noden etter 'fjernes':
    forste.neste = fjernes.neste;
    lengde --;
    return fjernes.data;
  }
  //Alternativ metode, virker å være mer standard måte å gjøre det på, hvor vi iterer gjennom listen helt til vi finner bakerste node:
  public void leggTil(T t){
    Node ny = new Node(t);
    Node temp = forste;
    while (temp.neste != null){
      temp = temp.neste;
    }
    temp.neste = ny;
    lengde ++;
  }
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
