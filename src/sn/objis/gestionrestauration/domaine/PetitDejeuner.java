package sn.objis.gestionrestauration.domaine;

public class PetitDejeuner extends Commande {
	
	/**
	 * 
	 */
	private String baguette;
	private String tartines;
	private String viennoiseries;
	private String jus;
	private String cafe;
	
	/**
	 * 
	 */
	public PetitDejeuner(){}
	
	public PetitDejeuner(int prix, String date, int nbCommande,String baguette, String tartines, String viennoiseries, String jus, String cafe){

		super(prix, date, nbCommande);
		this.baguette = baguette;
		this.tartines = tartines;
		this.viennoiseries = viennoiseries;
		this.jus = jus;
		this.cafe = cafe;
	}
	
	/**
	 * 
	 * @return
	 */

	public String getBaguette() {
		return baguette;
	}

	public String getTartines() {
		return tartines;
	}

	public String getViennoiseries() {
		return viennoiseries;
	}

	public String getJus() {
		return jus;
	}

	public String getCafe() {
		return cafe;
	}
	
	/**
	 * 
	 * @param baguette
	 */

	public void setBaguette(String baguette) {
		this.baguette = baguette;
	}

	public void setTartines(String tartines) {
		this.tartines = tartines;
	}

	public void setViennoiseries(String viennoiseries) {
		this.viennoiseries = viennoiseries;
	}

	public void setJus(String jus) {
		this.jus = jus;
	}

	public void setCafe(String cafe) {
		this.cafe = cafe;
	}

}
