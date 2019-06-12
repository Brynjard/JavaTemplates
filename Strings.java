str1==str2 //Sammenligner adresser;
String newStr = str1.equals(str2); //Sammenligner verdier
String newStr = str1.equalsIgnoreCase() //Sammenligner verdier, driter i caps/lower
int newStr = str1.length() //viser lengde
char newStr = str1.charAt(i) //henter char på index
String newStr = str1.toUpperCase() //returnerer alle som caps
String newStr = str1.toLowerCase() //returnerer alle som lower
String newStr = str1.replace(gammelVerdi, nyVerdi) //Søker og erstatter
String newStr = str1.trim() //gjerner white space
boolean ewStr = str1.contains("verdi"); //Sjekker om har verdi
char[] chars = str1.toCharArray(); // Konverterer String til char array
boolean ewStr = str1.IsEmpty(); //Sjekker om tom
boolean ewStr = str1.endsWith(); //Sjekker om slutter på
boolean jdsa = str1.startsWith(); //sjekker om begynner på
int compare = str1.compareToIgnoreCase(String str); // Driter i caps/lower
boolean test = str1.contains(chars); //Sjekker mot charArray;
String blabla = copyValueOf(chars); // lager string fra charArray;

//alle indexOf returnerer -1 om parameter ikke finnes
int balbal = str1.indexOf(char ch); // returnerer int av index på første treff av char
int blablsda = str1.indexOf(char ch, int Startindex); // se over, men etter gitt indexOf
int bdsa = str1.indexOf(String s); // returnerer index der s begynner
int dsna = str1.indexOf(String s, int Startindex); //blablabla

//kan sjekke motsatt vei med. Bruker akkurat samma para som indexOf:
int blas = str1.lastIndexOf(int ch);

String str="123";
int i = Integer.parseInt(str);// Konverterer fra String til int

String str = "100.222";
double dobbel = Double.parseDouble(str); //Konverterer fra String til int

int var = 111;
String str = String.valueOf(var); //Konverterer fra int til String

double dobbel = 88.9999;
String str = String.valueOf(dobbel);  //Konverterer fra double til String


//rekursiv metode for reversering og printing av String. Funnet på nettet
class StringReverse {

    void baklengs(String str){
        if ((str==null)||(str.length() <= 1))
           System.out.println(str);
        else
        {
            System.out.print(str.charAt(str.length()-1));
            baklengs(str.substring(0,str.length()-1));
        }
    }

    public static void main(String[] args){
        String str = "Faen i helvette";
        StringReverse obj = new StringReverse();
        obj.baklengs(str);
    }
}
