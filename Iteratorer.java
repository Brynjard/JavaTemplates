import java.util.Iterator;
public class Iteratorer{
  //Tar her utgangspunkt i vår vanlige FIFO-lenkeliste:
  public class LenkelisteFIFO<T> implements Iterable<T>{
    Node forste;
    Node siste;
    int lengde = 0;

    public LenkelisteFIFO(){
      forste = new Node(null);q
      siste = forste;

    }
    //Denne metoden må med fra Iterator-grensesnittet:
    @Override
    public Iterator<T> iterator(){
      //Returnerer et objekt av Iteratoren vi skal lage:
      return new LenkelisteIterator();
    }
    private class LenkelisteIterator implements Iterator<T>{
      private Node pos;

      public LenkelisteIterator(){
        //Setter pos til å være første Node i beholderen:
        pos = forste;
      }
      //Metoden sjekker om beholderen har en 'neste'-verdi:
      @Override
      public boolean hasNext(){
        return pos.neste != null;
      }

      @Override
      public T next(){
        //Kaster feil dersom vi prøver å iterere til en posisjon hvor tomt:
        if (!hasNext()){
          throw new NoSuchElementException();
        }
        pos = pos.neste;
        //Returnerer data på den neste noden:
        return pos.data;
      }
      @Override
      public void remove(){
        throw new UnsupportedOperationException();
      }
    }

}
