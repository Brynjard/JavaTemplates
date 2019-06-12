//Arraylist:
ArrayList<String> arrayList = new ArrayList<String>();
//legge til et element bakerst i listen:
arrayList.add("heihei");
//Legge til elmeent på spesifikk indeks:
arrayList.add(0, "Tjohei");
//Fjerner alt:
arrayList.clear();
//Sjekke om et spesielt objekt er inne i beholderen:
arrayList.contains("tjobing");
//Hente element fra indeksplass:
arrayList.get(0);
//Fjerne ett element fra en spesifikk indeks:
arrayList.remove(0);
//størrelse:
arrayList.size();

//Array:
int[] array = new int[12];
//kan også lages sånn her:
int[] nrArray = {2, 3, 4, 5, 6, 7};
//Størrelse:
array.length; //Men vil alltid vise 10, selv om kanskje bare 9 plasser er opptatt..
