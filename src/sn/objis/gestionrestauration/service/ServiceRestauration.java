package sn.objis.gestionrestauration.service;
import sn.objis.gestionrestauration.domaine.*;

public class ServiceRestauration {
	
	PetitDejeuner ptd1 = new PetitDejeuner("Omelettes", "Sandwich", "Croissant");
	Dejeuner deje = new Dejeuner("Riz au poisson ", "Riz au viande ", "Poulet");
	Dinner dinne = new Dinner("Salade ordinnaire ", "Gratin de légumes à l'emmental léger ", "Papillote de poisson maigre aux petits légumes");
	Client client = new Client();
	public void Menu1(PetitDejeuner pd){
		
		ptd1.setPrixMenu1(500);
		ptd1.setPrixMenu2(1000);
		ptd1.setPrixMenu3(800);
		System.out.println(ptd1.toString());
	
		
	}
	public void Menu2(Dejeuner de){
		
		deje.setPrixMenu1(1500);
		deje.setPrixMenu2(2000);
		deje.setPrixMenu3(2500);
		System.out.println(deje.toString());
	
		
	}
	public void Menu3(Dinner di){
		
		dinne.setPrixMenu1(2000);
		dinne.setPrixMenu2(2500);
		dinne.setPrixMenu3(4000);
		System.out.println(dinne.toString());
		
	}
	public void SousMenu1(PetitDejeuner pd, int a){
		
		if( a==1 ){
			System.out.println("Vous avez choisi le menu: "+ ptd1.getMenu1()+ " qui coute "+ ptd1.getPrixMenu1());
		}else if( a==2){
			System.out.println("Vous avez choisi le menu: "+ ptd1.getMenu2()+ " qui coute "+ ptd1.getPrixMenu2());
		}else if( a==3){
			System.out.println("Vous avez choisi le menu: "+ ptd1.getMenu3()+ " qui coute "+ ptd1.getPrixMenu3());
		}else{
			System.out.println("Erreur: le chiffre que vous avez choisi ne correspond a aucun menu ");	
	    }
	
	}
	public void SousMenu2(Dejeuner de, int b){
		
		if( b==1){
			System.out.println("Vous avez choisi le menu: "+ deje.getMenu1()+ " qui coute "+ deje.getPrixMenu1());
		}else if( b==2){
			System.out.println("Vous avez choisi le menu: "+ deje.getMenu2()+ " qui coute "+ deje.getPrixMenu2());
		}else if( b==3){
			System.out.println("Vous avez choisi le menu: "+ deje.getMenu3()+ " qui coute "+ deje.getPrixMenu3());
		}else{
			System.out.println("Erreur: le chiffre que vous avez choisi ne correspond a aucun menu ");	
	    }
	}
	public void SousMenu3(Dinner di, int c){
		
		if( c==1){
			System.out.println("Vous avez choisi le menu: "+ dinne.getMenu1()+ " qui coute "+ dinne.getPrixMenu1());
		}else if( c==2){
			System.out.println("Vous avez choisi le menu: "+ dinne.getMenu2()+ " qui coute "+ dinne.getPrixMenu2());
		}else if( c==3){
			System.out.println("Vous avez choisi le menu: "+ dinne.getMenu3()+ " qui coute "+ dinne.getPrixMenu3());
		}else{
			System.out.println("Erreur: le chiffre que vous avez choisi ne correspond a aucun menu ");	
	    }	
	}
}

	
		
	
	
	


