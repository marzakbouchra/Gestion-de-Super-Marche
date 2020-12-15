package SuperMarche;

public class Article {
	//
	private String name;
	private double prix;
	private boolean solde;
	//Getters && Setters
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrix() {
		return prix;
	}
	public void setPrix(double prix) {
		this.prix = prix;
	}
	public boolean isSolde() {
		return solde;
	}
	public void setSolde(double solde) {
		this.prix=this.prix-(100-solde)/100;
		this.solde = true;
	}
	/// Constructor
	public Article(String name, double prix, boolean solde) {
		super();
		this.name = name;
		this.prix = prix;
		this.solde = solde;
	}
	
	public void afficher() {
		System.out.println("Nom de l'aritcle  : " + name);
		System.out.println("Prix d'article : " + prix);
		
		if(solde=true) System.out.println("(en solde)");
		else System.out.println("(non solde)");
	}
	
	
}
