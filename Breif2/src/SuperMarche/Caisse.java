package SuperMarche;

public class Caisse {
	Article article;
	Chariot chariot;
	// Characteristic
	private  int numeroCaisse;
	private double montantTotal;
	//Constructor
	public Caisse(int numeroCaisse, double montantTotal) {
		super();
		this.numeroCaisse = numeroCaisse;
		this.montantTotal = montantTotal;
	}
	//Getters && Setters
	
	public int getNumeroCaisse() {
		return numeroCaisse;
	}
	public void setNumeroCaisse(int numeroCaisse) {
		this.numeroCaisse = numeroCaisse;
	}
	public double getMontantTotal() {
		return montantTotal;
	}
	
	//Methods
	public void montantTotal() {
		System.out.println("la caisse "+numeroCaisse+"a encaissé "+montantTotal+"MAD");
	}
	
	public void scanner(Chariot chariot) {
		
		
		
		for (Article i : chariot.ensembleArticleAchete.keySet()) {
//          chariot.remplir(i, chariot.articlesList.get(i));

          double produit = i.getPrix() * chariot.ensembleArticleAchete.get(i);
          System.out.println( i.getName() + ": " + i.getPrix() + " * " + chariot.ensembleArticleAchete.get(i) + " = " + produit + "MAD " );
          montantTotal = (montantTotal+produit);

      }
		
	}
	
	
	
}
