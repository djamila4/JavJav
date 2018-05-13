
package sn.objis.gestionrestauration.domaine;

/**
 * @since 20/03/2018
 * @version 1.0
 * @author Houleye SOW
 *
 */
public class Repas {

	private String menu1;
	private int prixMenu1;
	private String menu2;
	private int prixMenu2;
	private String menu3;
	private int prixMenu3;
	/**
	 * 
	 */
	public Repas() {}
	/**
	 * @param menu1
	 * @param menu2
	 * @param menu3
	 */
	public Repas(String menu1, String menu2, String menu3) {
		this.menu1 = menu1;
		this.menu2 = menu2;
		this.menu3 = menu3;
	}
	/**
	 * @return the menu1
	 */
	public String getMenu1() {
		return menu1;
	}
	/**
	 * @return the menu2
	 */
	public String getMenu2() {
		return menu2;
	}
	/**
	 * @return the menu3
	 */
	public String getMenu3() {
		return menu3;
	}
	
	
	/**
	 * @return the prixMenu1
	 */
	public int getPrixMenu1() {
		return prixMenu1;
	}
	/**
	 * @return the prixMenu2
	 */
	public int getPrixMenu2() {
		return prixMenu2;
	}
	/**
	 * @return the prixMenu3
	 */
	public int getPrixMenu3() {
		return prixMenu3;
	}
	/**
	 * @param menu1 the menu1 to set
	 */
	public void setMenu1(String menu1) {
		this.menu1 = menu1;
	}
	/**
	 * @param menu2 the menu2 to set
	 */
	public void setMenu2(String menu2) {
		this.menu2 = menu2;
	}
	/**
	 * @param menu3 the menu3 to set
	 */
	public void setMenu3(String menu3) {
		this.menu3 = menu3;
	}
	/**
	 * @param prixMenu1 the prixMenu1 to set
	 */
	public void setPrixMenu1(int prixMenu1) {
		this.prixMenu1 = prixMenu1;
	}
	/**
	 * @param prixMenu2 the prixMenu2 to set
	 */
	public void setPrixMenu2(int prixMenu2) {
		this.prixMenu2 = prixMenu2;
	}
	/**
	 * @param prixMenu3 the prixMenu3 to set
	 */
	public void setPrixMenu3(int prixMenu3) {
		this.prixMenu3 = prixMenu3;
	}
	
}
