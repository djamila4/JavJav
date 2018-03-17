package sn.objis.gestionrestauration.presentation;
import java.util.Scanner;

import sn.objis.gestionrestauration.domaine.*;
import sn.objis.gestionrestauration.service.*;
public class MainRestauration {

	public static void main(String[] args) {
		ServiceRestauration sr = new ServiceRestauration();
		PetitDejeuner ptd1 = new PetitDejeuner("Omelettes", "Sandwich", "Croissant");
		Dejeuner deje = new Dejeuner("Riz au poisson ", "Riz au viande ", "Poulet");
		Dinner dinne = new Dinner("Salade ordinnaire ", " Gratin de légumes à l'emmental léger ", "Papillote de poisson maigre aux petits légumes");
		System.out.println("Bienvenu/Welcome");
		System.out.println("Tapez 1 : pour commande petit dejeuner");
		System.out.println("Tapez 2 : pour commande dejeuner");
		System.out.println("Tapez 3 : pour commande dinner");
		Scanner sc = new Scanner(System.in);
		int a;
		a = sc.nextInt();
		
			if(a == 1){
			System.out.println(ptd1.toString());
		}else if(a==2){
			System.out.println(deje.toString());
		}else if(a==3){
			System.out.println(dinne.toString());
		}else{
			System.out.println("Veuillez choisir un numéro correspondant a un menu");
		}
			
		System.out.println("Tapez le numero correspondant pour choisir un menu");
		int b;
		do{
			
		b = sc.nextInt();
		if(b == 1){
			System.out.println("Vous avez choisi le menu Omelette a 500fr \n Voulez-vous faire une autre commande");
			
		}else if(b == 2){
			System.out.println("Vous avez choisi le menu Sandwich a 1000fr");
		}else if(b == 3){
			System.out.println("Vous avez choisi le menu Croissant a 800fr");
		}else{
				System.out.println("Erreur :Tapez le numero correspondant pour choisir un menu");
		}
		}while(b != 1 || b != 2 || b!=3);
	} 

}
