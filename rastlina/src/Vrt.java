// Uvozimo pakete za delo z GUI
import javax.swing.*;

// Uvozimo paket za delo z dogodki
import java.awt.event.*;

/*
    Ime datoteke: GUIrastline.java
    Avtor datoteke: Adriana Felicijan
    Vhodni podatki: /
    Opis: Aplikacija z grafičnim uporabniškim vmesnikom za delo s steklenicami
    Izhodni podatki: Okno grafičnega uporabniškega vmesnika

 */
//Deklariramo javni razred
public class Vrt extends JFrame implements ActionListener{

	//deklariramo zasebne lastnosti
	private JPanel povrsina;
	private JButton dodajJButton;
	private JTextField vrstaPolje, zalitostPolje;
	private JTable tabela;
	private VrtnarastlinaTableModel modelTabele;
	//deklariramo javno statično metodo, ki se izvede ob zagonu programa
	// Vhodni parametri: vhodni parametri iz konzole
	// Potek/opis: ustvari novo okno
	// Vrne vrednost: /
	public static void main(String[] args) {
		Vrt m = new Vrt ("Vrt z rastlinami");


	}
	//Javni konstruktor
	//Vhodni parametri: n - naslov okna
	//Potek/opis: vrne objekt tipa Miza
	//Vrne vrednost: vrne objekt tipa Vmesnik
	public Vrt(String n) {
		//kličemo konstruktor nadrazreda
		super(n);

		//inicializiramo lastnosti
		povrsina = new JPanel();
		dodajJButton = new JButton("Dodaj rastlino");
		vrstaPolje = new JTextField(32);
		zalitostPolje = new JTextField(8);
		modelTabele = new VrtnarastlinaTableModel();
		tabela = new JTable(modelTabele);

		//površino dodamo na mizo
		add(povrsina);

		// Gumbu za dodajanje dodamo action listener
		dodajJButton.addActionListener(this);

		// Dodamo gumb, vnosna polja in tabelo na površino
		povrsina.add(new JLabel("Vrsta:"));
		povrsina.add(vrstaPolje);
		povrsina.add(new JLabel("Ali je zalita?"));
		povrsina.add(zalitostPolje);
		povrsina.add(dodajJButton);
		povrsina.add(tabela);

		// Pokažemo okno
		setVisible(true);

		// Nastavimo velikost
		setSize(800, 600);

		// Nastavimo obnašanje križca (x) - da konča aplikacijo
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		System.out.println("Ustvarjam novo rastlino na vrtu");

	}

	// Metoda, ki jo predpisuje vmesnik ActionListener
	// Vhodni parametri: ae - dogodek
	// Potek/opis: doda rastlino v tabelo
	// Vrne vrednost: /
	public void actionPerformed(ActionEvent ae) {

		System.out.println("Dodajam rastlino ...");
		System.out.println("Vrsta je " + vrstaPolje.getText());
		System.out.println("Ali je zalita? " + zalitostPolje.getText());


		// Dodamo objekt v seznam
		//modelTabele.addVrtnarastlina(rastlina);
		modelTabele.addVrtnarastlina(new Vrtnarastlina(vrstaPolje.getText(), zalitostPolje.getText()));

	}

}
