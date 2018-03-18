package sn.objis.gestionrestauration.domaine;
/**
 * 
 * @author user
 *
 */
public class Dejeuner extends Repas {
	
	private String titre = "Dejeuner";

	/**
	 * 
	 */
	public Dejeuner() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param titre
	 */
	public Dejeuner(String titre) {
		this.titre = titre;
	}

	/**
	 * @param menu1
	 * @param menu2
	 * @param menu3
	 */
	public Dejeuner(String menu1, String menu2, String menu3) {
		super(menu1, menu2, menu3);
		// TODO Auto-generated constructor stub
	}
	
	public String toString(){
		String dej = "Menu du "+ this.titre+ ": \n1:"   + this.getMenu1()+" \n2:"+ this.getMenu2()+" \n3:"+ this.getMenu3();
		return dej;
		
	}
	

}
