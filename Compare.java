public class Compare implements Comparable<Compare>{
  int karakter;
  /*Har bare en metode, int compareTo()
  Fungerer på 'magisk vis' på strenger:
  string1.compareTo(string2);
  - returverdi < 0 hvis string1 er mindre enn string2
  - returverdi 0 dersom string1 er like stor som string2
  - returverdi > 0 dersom string1 er større enn string2.

  CompareTo på Strings:
  Hva som menes med større:
  Dersom en Char eller string er 'større' så har denne Char'en en høyere Unicode-verdi.
  compareTo() returverdien er differansen i UniCodeverdi. Derfor kan man si at
  a.compareTo(c) vil returnere en negativ verdi, fordi c har en høyere UniCode-verdi enn a.
  Compares two strings lexicographically.
  The comparison is based on the Unicode value of each character in the strings.
  */

  //eks fra oblig:
  //Her er T comparable.
  public class SortertLenkeliste<T extends Comparable<T>> extends Lenkeliste<T>{
    @Override
    public void leggTil(T x){
      Node ny = new Node(x);
      if (start == null) {
        start = ny;
        lengde ++;
        return;
        /*Hvis den første noden er større enn Node(x), så skal den nye
        noden stå først.*/
      } else if (start.data.compareTo(x) > 0) {
        ny.neste = start;
        start = ny;
        lengde ++;
        return;
      }
  }
  //egen implementasjon:
  @Override
  public int compareTo(Compare annen){
    //Hvis this karakter er større enn annen:
    if (karakter > annen.karakter){
      return 1;
      //Hvis annen er større enn this:
    } else if (karakter < annen.karater){
      return -1;
    } else {
      return 0;
    }
  }
}
