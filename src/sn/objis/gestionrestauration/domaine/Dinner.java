package sn.objis.gestionrestauration.domaine;
/**
 * 
 * @author user
 *
 */
public class Dinner extends Repas { 
	
	private String titre = "Dinner";

	/**
	 * 
	 */
	public Dinner() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param titre
	 */
	public Dinner(String titre) {
		this.titre = titre;
	}

	/**
	 * @param menu1
	 * @param menu2
	 * @param menu3
	 */
	public Dinner(String menu1, String menu2, String menu3) {
		super(menu1, menu2, menu3);
	}
	public String toString(){
		String dinn = "Menu du "+ this.titre+ ": \n" + this.getMenu1()+" \n"+ this.getMenu2()+" \n"+ this.getMenu3();
		return dinn ;
		}
	
	

}
