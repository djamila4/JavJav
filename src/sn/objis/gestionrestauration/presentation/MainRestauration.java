package sn.objis.gestionrestauration.presentation;
import sn.objis.gestionrestauration.service.*;
import java.util.Scanner;

import sn.objis.gestionrestauration.domaine.*;
import sn.objis.gestionrestauration.service.*;
public class MainRestauration {

	public static void main(String[] args) {
		
		System.out.println("Bienvenu/Welcome");
		System.out.println("Tapez 1 : pour commande petit dejeuner");
		System.out.println("Tapez 2 : pour commande dejeuner");
		System.out.println("Tapez 3 : pour commande dinner");
		Scanner sc = new Scanner(System.in);
		ServiceRestauration sr= new ServiceRestauration();
		PetitDejeuner ptd1 = new PetitDejeuner();
		Dejeuner deje = new Dejeuner();
		Dinner dinne = new Dinner();
		Client client = new Client();
		
		int a;
		a = sc.nextInt();
		if(a == 1){
		   sr.Menu1(ptd1);
	    }else if(a == 2){
	    	sr.Menu2(deje); 	
	    }else if(a == 3){
	    	sr.Menu3(dinne);
	    }else{
	    	System.out.println("Erreur: le chiffre que vous avez taper ne correspond a aucun menu");
	    }
		
		int b;
		b = sc.nextInt();
		if(b == 1){
			sr.SousMenu1(ptd1, 1);
		}else if(b == 2){
			sr.SousMenu2(deje, 2);
		}else if(b == 3){
			sr.SousMenu3(dinne, 3);
		}else{
	    	System.out.println("Erreur: le chiffre que vous avez taper ne correspond a aucun menu");
	    }
		System.out.println("Afin de confirmer la commande veuiller saisir les indications suivantes");
        System.out.println("Vorte nom svp");
        String info;
        info = sc.nextLine();
		client.setNom(info);
		sc.nextLine();
        System.out.println("Vorte prenom svp");
        info = sc.nextLine();
		client.setPrenom(info);
        System.out.println("Vorte adresse svp");
        info = sc.nextLine();
		client.setAdresse(info);
        System.out.println("Vorte numéro de telephone svp");
        info = sc.nextLine();
	    client.setNumTel(info);
        System.out.println(client.toString());

	}
		
}

