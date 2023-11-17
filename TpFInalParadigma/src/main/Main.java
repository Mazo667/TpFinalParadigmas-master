package main;

import java.util.*;

import guerreros.Marine;
import guerreros.Ninja;
import guerreros.Mohicano;
import guerreros.Zulu;
import guerreros.Samurai;

import armas.M4A1;
import armas.Glock19;
import armas.Ninjato;
import armas.Shuriken;
import armas.Katana;
import armas.Yumi;
import armas.Lanza;
import armas.Cuchillo;
import armas.Hacha;
import armas.Winchester;

import clasesAbstractas.Guerrero;
import comparators.ComparadorDeGuerrero;

public class Main {

	public static void main(String[] args) {
		//CREO LOS EJERCITOS
		
		//Ejercito de marines
		List<Guerrero> marines = new LinkedList<Guerrero>();
		
		//Creo 30 marines 
		for(int i = 0;i < 30;i++) {
			Marine marine = new 
					Marine(100,
							generarNumeroAleatorio(40, 60),
							new M4A1(82, 89, 90),
							new Glock19(42, 68, 45)
							);
			marines.add(marine);
		}
		
		
		//Ejercito de Ninjas
		List<Guerrero> ninjas = new LinkedList<Guerrero>();
		
		//Creo 30 ninjas 
		for(int i = 0;i < 30;i++) {
			Ninja ninja = new 
					Ninja(100,
							generarNumeroAleatorio(35, 56),
							new Ninjato(92, 66, 100),
							new Shuriken(60, 45, 3)
							);
			ninjas.add(ninja);
		}

		//Ejercito de Samurais
		List<Guerrero> samurais = new LinkedList<Guerrero>();
		
		//Creo 30 samurais
		for(int i = 0;i < 30;i++) {
			Samurai samurai = new Samurai(
									100,
									generarNumeroAleatorio(57, 71),
									new Katana(92, 70, 100),
									new Yumi(90, 55, 25) );
					samurais.add(samurai);
				}
		
		//Ejercito de Zulus
		List<Guerrero> zulus = new LinkedList<Guerrero>();
		
		//Creo 30 zulus
		for(int i = 0;i < 30;i++) {
			Zulu zulu = new 
					Zulu(100,
							generarNumeroAleatorio(50, 68),
							new Lanza(78, 67, 100),
							new Cuchillo(40, 26, 100)
							);
			zulus.add(zulu);
		}
		
		//Ejercito de Mohicanos
		List<Guerrero> mohicanos = new LinkedList<Guerrero>();
		
		//Creo 30 mohicanos
				for(int i = 0;i < 30;i++) {
					Mohicano mohicano = new 
							Mohicano(100,
									generarNumeroAleatorio(70,96),
									new Hacha(85, 62, 100),
									new Winchester(60,45,20)
									);
					mohicanos.add(mohicano);
				}
				
			
			//SemiFinal
			List<Guerrero> ganador1 = peleaDeEJercitos(marines, mohicanos);
			imprimirEjercito(ganador1);

			System.out.println("---------------------------------------");
			List<Guerrero> ganador2 = peleaDeEJercitos(samurais, ninjas);	
			imprimirEjercito(ganador2);
			
			System.out.println("---------------------------------------");
			List<Guerrero> ganador3 = peleaDeEJercitos(zulus, ganador1);	
			imprimirEjercito(ganador3);
			
			System.out.println("---------------------------------------");
			
			//Final
			List<Guerrero> final1 = peleaDeEJercitos(ganador1,ganador2);
			System.out.println("---------------------------------------");
			List<Guerrero> final2 =  peleaDeEJercitos(final1,ganador3);
			System.out.println("El ganador de la final es: ");
			imprimirEjercito(final2);
			
	}



	    public static List<Guerrero> peleaDeEJercitos(List<Guerrero> ejercito1, List<Guerrero> ejercito2) {
	    		
	    		for(int i = 0; i < ejercito1.size() && i < ejercito2.size();i++) {
	    			
	    			if(ejercito1.get(i) != null && ejercito2.get(i) != null) {
			
						// ataco al soldado del ejercito 2
						ejercito1.get(i).atacar(ejercito2.get(i));
			
						// verifico su vida
						if (ejercito2.get(i).getNivelVida() <= 0) {
							System.out.println("El soldado " + ejercito2.get(i).getClass().getSimpleName() + " murio.");
							ejercito2.remove(i);
						} else {
							// soldado del ejercito 2 contraataca a soldado del ejercito 1
							ejercito2.get(i).atacar(ejercito1.get(i));
						}
						
						// verifico su vida
						if (ejercito1.get(i).getNivelVida() <= 0) {
							System.out.println("El soldado " + ejercito1.get(i).getClass().getSimpleName() + " murio.");
							ejercito1.remove(i);
						}
						
	    			}else {
	    				break;
	    			}
		    		
		    	}
		    	
	    		
	    		if(ejercito1.size() > 0 && ejercito2.size() > 0) {
	    			System.out.println( ">>>>" + ejercito1.size() + " " +  ejercito2.size());
	    			List<Guerrero> ganador;
	    			return ganador = peleaDeEJercitos(ejercito1,ejercito2);
	    		}
	    		
	    		
	    	
	    		
	    		return ejercito1.size() > ejercito2.size() ? ejercito1 : ejercito2;
	    }

	

	public static void imprimirEjercito(List<Guerrero> ejercito){
		if (ejercito == null ) {
			return;
		}
		Guerrero soldado = ejercito.get(0);
		if(soldado instanceof Marine){
			System.out.println("Ganaron los Marines");
		}if (soldado instanceof Zulu) {
			System.out.println("Ganaron los Zulus");
		} if (soldado instanceof Samurai) {
			System.out.println("Ganaron los Samurais");
		} if (soldado instanceof Mohicano){
			System.out.println("Ganaron los Mohicanos");
		} if (soldado instanceof Ninja) {
			System.out.println("Ganaron los Ninjas");
		} 
	}

	public static double generarNumeroAleatorio(double rangoMinimo, double rangoMaximo){
		Random random = new Random();
		return rangoMinimo + (rangoMaximo - rangoMinimo) * random.nextDouble();
	}

}
