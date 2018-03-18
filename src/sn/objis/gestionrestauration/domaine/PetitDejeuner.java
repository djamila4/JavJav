package sn.objis.gestionrestauration.domaine;

public class PetitDejeuner extends Repas {
	
	private String titre = "Petit Dejeuner";

	/*private int prixMenu1 = this.getPrixMenu1();
	private int prixMenu2 = this.getPrixMenu2();
	private int prixMenu3 = this.getPrixMenu3();*/
	/**
	 * 
	 */
	public PetitDejeuner() {
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * @param titre
	 */
	public PetitDejeuner(String titre) {
		this.titre = titre;
	}

	/**
	 * @param menu1
	 * @param menu2
	 * @param menu3
	 * @param titre
	 */
	public PetitDejeuner(String menu1, String menu2, String menu3) {
		super(menu1, menu2, menu3);
	}
	
	public String toString(){
		String etatDeObjet = "Menu du "+ this.titre+": \n" +"1:"+ this.getMenu1()+ " ->500fr \n"+"2:"+ this.getMenu2()+ " ->1000fr \n"+"3:"+ this.getMenu3()+ " ->800fr";
		return etatDeObjet;	
	}
	
}