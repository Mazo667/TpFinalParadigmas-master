package guerreros;

import clasesAbstractas.Arma;
import clasesAbstractas.Guerrero;

public class Mohicano extends Guerrero{
	  //Hacha
	  //fusil viejo
	  
	  public Mohicano(double vida,double fuerza, Arma primaria, Arma secundaria){
	   super(vida,fuerza,primaria,secundaria);
	  }
	

	  @Override
	  public void atacar(Guerrero otro) {
		  System.out.println("El guerrero mohicano esta atacando a "+otro.getClass().getSimpleName());
	  }
	
}
