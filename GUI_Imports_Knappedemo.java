/*Noe JavaFX
Tatt utgangspunkt i plenumstimer med Minesveiper som utgangspunkt.
Har fjernet noe av koden som ikke er relevant, eks. metode .finnNabo()*/
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.event.EventHandler;
import javafx.event.ActionEvent;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.shape.Rectangle;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.paint.Color;
import java.util.Random;
import java.util.ArrayList;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Text;


  //Programmet må alltid extende application:
  public class Knapper extends Application {
    @Override
    public void start(Stage stage) {

      Button knapp3 = new Button("Knapp 3");
      //Knappen sin event:
      knapp3.setOnAction(e -> System.out.println("Lambda!!!"));
      //må legge knappen i root dersom den skal vises:
      HBox root = new HBox(knapp3);
      //til h og vbox elementer kan man også legge til ved å skrive:
      root.getChildren().add(/*det som skal legges til*/);
      //legge til flere ting: root.getChildren().addAll();
      //Lager scene med root som argument:
      Scene scene = new Scene(root);
      //Må gjøre dette:
      stage.setScene(scene);

      stage.setTitle("Knapper!");
      //Må også gjøre dette for at program skal starte:
      stage.show();


    }


  }
