package sn.objis.gestionrestauration.domaine;

/**
 * @see Repas
 *
 */

public class PetitDejeuner extends Repas {
	
	private String titre = "Petit Dejeuner";

	/**
	 * 
	 */
	public PetitDejeuner() {
		// TODO Auto-generated constructor stub
	}
	

	/**
	 * @param menu1
	 * @param menu2
	 * @param menu3
	 */
	public PetitDejeuner(String menu1, String menu2, String menu3) {
		super(menu1, menu2, menu3);
	}
	
	/**
	 * 
	 */
	public String toString(){
		String etatDeObjet = "Menu du "+ this.titre+": \n" +"1:"+ this.getMenu1()+" "+ this.getPrixMenu1()+ " \n"+"2:"+ this.getMenu2()+" "+this.getPrixMenu2()+" \n"+"3:"+ this.getMenu3()+" "+this.getPrixMenu3();
		return etatDeObjet;	
	}
	
}