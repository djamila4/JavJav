package sn.objis.gestionrestauration.domaine;

public class Commande {
	
	/**
	 * 
	 */
	private int prix;
	private String date;
	private int nbCommande;
	
	
	/**
	 * 
	 */
	public Commande(){}
	
	public Commande(int prix, String date, int nbCommande){
		this.prix = prix;
		this.date = date;
		this.nbCommande = nbCommande;
	}
	
	/**
	 * 
	 * @return
	 */

	public int getPrix() {
		return prix;
	}

	public String getDate() {
		return date;
	}

	public double getNbCommande() {
		return nbCommande;
	}
	
	/**
	 * 
	 * @param prix
	 */

	public void setPrix(int prix) {
		this.prix = prix;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public void setNbCommande(int nbCommande) {
		this.nbCommande = nbCommande;
	}
	

}
