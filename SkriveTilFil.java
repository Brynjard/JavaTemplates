import java.util.*;
import java.io.*;
import java.io.File;
import java.io.PrintWriter;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class LeseFraFil{

  File filen = new File("Test.txt");
  public static lesFraFil(File fil) throws FileNotFoundException{
    Scanner scanneren = new Scanner(fil);
    //leser første linje:
    String linje = scanneren.nextLine();
    //Gjør om linje til String array:
    String[] linjeOppdelt = linje.split(" ");
    //For å parse til Int/double:
    int tall = Integer.parseToInt(linjeOppdelt[1]);

    while (scanneren.hasNext()) //for å gjøre noe så lenge det er linjer::
    filen.close(); //når man er ferdig..
  }
}
public class SkriveTilFil{
  static void skriveTilFil() throws IOException{
    try {
      FileWriter filskriver = new Filewriter("info.txt");
      filskriver.write("heihei!");
      ...
      filskriver.close();
    }
  }
}
