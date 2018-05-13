package sn.objis.gestionrestauration.domaine;
/**
 * 
 * @see Repas
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
		String dej = "Menu du "+ this.titre+": \n" +"1:"+ this.getMenu1()+" "+ this.getPrixMenu1()+ " \n"+"2:"+ this.getMenu2()+" "+this.getPrixMenu2()+" \n"+"3:"+ this.getMenu3()+" "+this.getPrixMenu3();
		return dej;
		
	}
	

}
