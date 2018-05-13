package sn.objis.gestionrestauration.domaine;

public class Client {
	
	/**
	 * 
	 */
	private String nom;
	private String prenom;
	private String numTel;
	private String adresse;
	
	/**
	 * 
	 */
	public Client(){}
	
	public Client(String nom, String prenom, String numTel, String adresse){
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

	public String getNumTel() {
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

	public void setNumTel(String numTel) {
		this.numTel = numTel;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	
	public String toString(){
		String c=this.getNom()+" ,"+ this.getPrenom()+" ,"+ this.getAdresse()+" ,"+this.getNumTel()+". Votre commande a bien été prise en compte \n Merci a la prochaine";
				return c;
	}


}
