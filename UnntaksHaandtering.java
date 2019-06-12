public class Exception{
  public static void main(String[] args){

  }

  //når vi faktisk håndtererer feilen her og nå:
  try {
    //Gjør noe...
  }catch (Exception e){
    //Faktisk Feilhåndtering, dersom det vi prøver å gjøre går ikke fungerer
  }

  //Throw i metodesignatur indikerer at denne metoden kan kaste følgende unntak..
  //Throw i metodesignaturen indikerer at unntakene kan oppstå, men metoden behandler de ikke.
  //Dette indikerer at programmet på et 'øvrigere' plan må behandle feilen:
  EKS:
  public class Dele{
    //Hei! På et eller annet tidspunkt så kan denne metoden kaste unntaket, dette må du være klar over..
    static int dele(int a) throws DivideByZeroException{
      return a / 0;
    }
  }

  //Her må main-metode fange unntaket, fordi det er main-metoden som faktisk bruker metoden:
  public static void main(String[] args){
    try {
      Dele.dele(2);
    } catch(DivideByZeroException e) {
      System.out.println("Kan ikke dele på null, din idiot..:)");
    }
  }

  //Throw handler om å eksplisitt kaste unntak:
  public class Dele{
    static int dele(int a, int b){
      //Vi kan ikke dele på null, så må eksplisitt kaste unntak:
      if (b == 0){
        throw new DivideByZeroException();
      } else {
        return a / b;
      }
    }
  }
}
