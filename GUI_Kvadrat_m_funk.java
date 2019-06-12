
  //Hvordan lage en fungerende knapp ut av ett rektangel:
  public class Rute extends StackPane{
    private boolean erMine = false;
    private boolean erBesokt = false;
    private ArrayList<Rute> naboer;
    private Rectangle firkant;

    public Rute(){
        //Lager den synlige firkanten:
        firkant = new Rectangle(30, 30, Color.GREY);
        firkant.setStroke(Color.BLACK);
        //legger firkanten til i dette objektet:
        getChildren().add(firkant);
        //lambdafunksjon:
        firkant.setOnMouseClicked(e -> klikk());
        int i = new Random().nextInt(10);
        erMine = (i == 5);
    }

    private void klikk(){
        if(erBesokt) return;
        erBesokt = true;

        if(erMine) firkant.setFill(Color.RED);
        else{
            firkant.setFill(Color.WHITE);

            int antall = antallNabominer();
            if(antall == 0) {
                for(Rute r : naboer) r.klikk();
            }else{
                Text t = new Text("" + antall);
                getChildren().add(t);
            }
        }
    }
    public boolean erMine(){
        return erMine;
    }

    public void settNaboer(ArrayList<Rute> naboer) {
        this.naboer = naboer;
    }

    private int antallNabominer(){
        int teller = 0;
        for(Rute nabo : naboer){
            if(nabo.erMine()) teller++;
        }
        return teller;
    }
  }
