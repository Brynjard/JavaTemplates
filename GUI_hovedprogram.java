//Dette er hovedprogrammet vårt:
public class Minesveiper extends Application{
  private final int STORRELSE = 10;

  public void start(Stage stage){
      GridPane root = new GridPane();
      Scene scene = new Scene(root);
      Rute[][] ruter = settOppBrett();

      for (int i = 0; i < STORRELSE; i++) {
          for (int j = 0; j < STORRELSE; j++) {
              root.add(ruter[i][j], j, i);
          }
      }

      stage.setScene(scene);
      stage.setTitle("Minesveiper");
      stage.show();
  }

  private Rute[][] settOppBrett() {
      Rute[][] ruter = new Rute[STORRELSE][STORRELSE];

      for (int i = 0; i < STORRELSE; i++) {
          for (int j = 0; j < STORRELSE; j++) {
              ruter[i][j] = new Rute();
          }
      }

      for (int i = 0; i < STORRELSE; i++) {
          for (int j = 0; j < STORRELSE; j++) {
              ArrayList<Rute> naboer = hentNaboer(i, j, ruter);
              ruter[i][j].settNaboer(naboer);
          }
      }

      return ruter;
  }


}
