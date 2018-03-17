package sn.objis.gestionrestauration.domaine;

public class Client {
	
	/**
	 * 
	 */
	private String nom;
	private String prenom;
	private double numTel;
	private String adresse;
	
	/**
	 * 
	 */
	public Client(){}
	
	public Client(String nom, String prenom, double numTel, String adresse){
		this.nom = nom;
		this.prenom = prenom;
		this.numTel = numTel;
		this.adresse = adresse;
	}
	
	/**
	 * 
	 * @return
	 */

	public String getNom() {
		return nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public double getNumTel() {
		return numTel;
	}

	public String getAdresse() {
		return adresse;
	}
	
	/**
	 * 
	 * @param nom
	 */

	public void setNom(String nom) {
		this.nom = nom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public void setNumTel(double numTel) {
		this.numTel = numTel;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}


}
