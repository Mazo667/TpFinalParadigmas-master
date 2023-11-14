package guerreros;

import java.util.Collections;
import java.util.List;

import clasesAbstractas.Arma;
import clasesAbstractas.Guerrero;
import comparators.ComparadorDeGuerrero;

public class Samurai extends Guerrero{
	//Katana 
	//yumi
	  
	public Samurai(double vida,double fuerza, Arma primaria, Arma secundaria){
		 super(vida,fuerza,primaria,secundaria);
	}



	@Override
	public void atacar(Guerrero otro) {
		System.out.println("El guerrero Samurai esta atacando a "+otro.getClass().getSimpleName());
	}
	
	



}
