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
		
		System.out.println(marines.size());
		
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
				
			
		
			List<Guerrero> ganador1 = peleaDeEJercitos(marines, mohicanos);
			imprimirEjercito(ganador1);

			List<Guerrero> ganador2 = peleaDeEJercitos(samurais, ninjas);	
			imprimirEjercito(ganador2);

			List<Guerrero> ganador3 = peleaDeEJercitos(zulus, marines);	
			imprimirEjercito(ganador3);


	}
	
	public static List<Guerrero> peleaDeEJercitos(List<Guerrero> ejercito1,List<Guerrero> ejercito2){
		int i = 0;
		while (i < ejercito1.size() && i < ejercito2.size()) {
			Guerrero guerrero1 = ejercito1.get(i);
			Guerrero guerrero2 = ejercito2.get(i);
			
			guerrero1.atacar(guerrero2);
			List<Guerrero> enfrentamiento = new ArrayList<Guerrero>();
			enfrentamiento.add(guerrero1);
			enfrentamiento.add(guerrero2);

			Collections.sort(enfrentamiento, new ComparadorDeGuerrero());

			// El primer guerrero en la lista es el que tiene mayor "potencia de ataque"
			Guerrero ganador =enfrentamiento.get(0);

			if(ejercito1.contains(ganador)) {
				ejercito2.remove(i);
			}else {
				ejercito1.remove(i);
			}
		}

		if(ejercito1.size() < ejercito2.size()) {
			return ejercito2;
		}
		
		return ejercito1;
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
