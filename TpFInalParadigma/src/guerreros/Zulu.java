package guerreros;

import java.util.Collections;
import java.util.List;

import clasesAbstractas.Arma;
import clasesAbstractas.Guerrero;
import comparators.ComparadorDeGuerrero;

public class Zulu extends Guerrero{

	public Zulu(double vida,double fuerza,Arma primaria,Arma secundaria){
	   super(vida,fuerza, primaria, secundaria);
	 }


	@Override
	public void atacar(Guerrero otro) {
		System.out.println("El guerrero zulu esta atacando a "+otro.getClass().getSimpleName());
	}
	
	
}
