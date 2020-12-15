package SuperMarche;

import java.util.HashMap;

public class Chariot {
	//Charctiristique
	public HashMap<Article, Integer> ensembleArticleAchete = new HashMap<>();
	//Constructor
	public Chariot() {
		
	}
	//Method Remplir un Chariot
	public void remplir(Article article, int quantite) {
		ensembleArticleAchete.put(article, quantite);
	}
	// Getters
	public HashMap<Article, Integer> getEnsembleArticleAchete() {
		return ensembleArticleAchete;
	}

	
}
