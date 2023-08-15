/*
    Avtor datoteke: Adriana Felicijan
    Ime datoteke: Vrtnarastlina
 */
//deklariramo javni razred, ki razširja razred Rastlina
public class Vrtnarastlina extends Rastlina{
    //vse latnosti nadrazreda se prenesejo
    //definiramo nove lastnosti
    private String vrstaRastline;
    private boolean jePognojen;

    //javni konstruktor
    //vhodni paramteri: ime - i,
    //potek/opis: ustvari nov objekt tipa Vrtnarastlina
    //vrne vrednost: nov objekt
    public Vrtnarastlina(String v, String z) {
        //lastnosti objekta
        jeNaSoncu = true;

        if (z.equals("Ja") || z.equals("Da")){
            jeZalita = true;
        }
        else {
            jeZalita = false;
        }

        aliCveti = false;
        jePognojen = false;
        vrstaRastline = v;
        }
    //Javna metoda za gnojenje rastlin
    //Vhodni parametri: /
    //Potek/opis: spremeni vrednost jePognojena na true
    //Vrne vrednost: true - gnojenje uspešno, false - gnojenje ni uspešno
    public boolean pognoji() {

        System.out.println("Gnojimo...");
        //Če je rastlina že pognojena
        if (jePognojen) {
            //Vrnemo false
            System.out.println("Rastlina je že pognojena.");
            return false;
        } else {
            //pognojili smo
            jePognojen = false;
            //vrnemo true
            System.out.println("Uspešno smo pognojili.");
            return true;

        }
    }
    //Javna metoda za pridobitev vrste rastline
    //Vhodni parametri: /
    //Potek/opis: spremeni vrednost vrstarastline na poljuben niz
    //Vrne vrednost: niz
    public String getVrstarastline(){
        return vrstaRastline;
    }
    //Javna metoda za pridobitev zalitosti rastlin
    //Vhodni parametri: /
    //Potek/opis: vrne zalitost rastline
    //Vrne vrednost: true - gnojenje uspešno, false - gnojenje ni uspešno
    public String getZalitost(){
        if (jeZalita == true){
            return "Ja";}
        else{
            return "Ne";}
    }
}
