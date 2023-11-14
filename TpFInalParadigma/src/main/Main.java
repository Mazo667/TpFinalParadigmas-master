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
									generarNumeroAleatorio(70, 96),
									new Hacha(85, 62, 100),
									new Winchester(60,45, 20)
									);
					mohicanos.add(mohicano);
				}
				
			
			//SemiFinal
			List<Guerrero> ganador1 = peleaDeEJercitos(marines, mohicanos);
			imprimirEjercito(ganador1);
			System.out.println(ganador1.size());
			System.out.println(ganador1.get(2).getNivelVida());

			List<Guerrero> ganador2 = peleaDeEJercitos(samurais, ninjas);	
			imprimirEjercito(ganador2);
			System.out.println(ganador2.size());
			System.out.println(ganador2.get(0).getNivelVida());
			
			List<Guerrero> ganador3 = peleaDeEJercitos(zulus, ganador1);	
			imprimirEjercito(ganador3);
			System.out.println(ganador3.size());
			
			//Final
			List<Guerrero> final1 = peleaDeEJercitos(ganador1,ganador2);
			
			List<Guerrero> final2 =  peleaDeEJercitos(final1,ganador3);
			System.out.println("El ganador de la final es: ");
			imprimirEjercito(final2);

	}



	    public static List<Guerrero> peleaDeEJercitos(List<Guerrero> ejercito1, List<Guerrero> ejercito2) {
	        Iterator<Guerrero> iterator1 = ejercito1.iterator();
	        Iterator<Guerrero> iterator2 = ejercito2.iterator();

	        while (iterator1.hasNext() && iterator2.hasNext()) {
	            Guerrero soldado1 = iterator1.next();
	            Guerrero soldado2 = iterator2.next();

	            while (soldado1.getNivelVida() > 0 && soldado2.getNivelVida() > 0) {
	                soldado2 = soldado1.atacar(soldado2);
	                soldado1 = soldado2.atacar(soldado1);
	            }

	            if (soldado1.getNivelVida() <= 0) {
	                System.out.println("El " + soldado1.getClass().getSimpleName() + " murió");
	                iterator1.remove();
	            }

	            if (soldado2.getNivelVida() <= 0) {
	                System.out.println("El " + soldado2.getClass().getSimpleName() + " murió");
	                iterator2.remove();
	            }
	        }

	        return ejercito1.isEmpty() ? ejercito2 : ejercito1;
	    }

	

	public static void imprimirEjercito(List<Guerrero> ejercito){
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
