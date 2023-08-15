import java.nio.channels.AlreadyConnectedException;

/*
    Avtor datoteke: Adriana Felicijan
    Ime datoteke: Plevel
 */
//deklariramo javni razred, ki razširja razred Rastlina
abstract class Plevel extends Rastlina{
    //vse latnosti nadrazreda se prenesejo
    //definiramo nove lastnosti
    private String ime;
    protected boolean jeViden;

    //javni konstruktor
    //vhodni paramteri:
    //potek/opis: ustvari nov objekt tipa Vrtnarastlina
    //vrne vrednost: nov objekt
    public Plevel() {
        //lastnosti objekta
        jeNaSoncu = true;
        jeZalita = true;
        aliCveti = false;
        jeViden = true;


    }
    //dodajmo abstraktno metodo izpuli()
    public abstract void izpuli();

    //podrazred plevela, mandragora
    class Mandragora extends Plevel {
        public void izpuli() {
            System.out.println("AAAAAAAAAAAAAAAAAAAAAAAAAAAA, NEHAAAJJ!!");
        }
    }


    }

