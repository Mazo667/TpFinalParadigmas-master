package guerreros;

import clasesAbstractas.Arma;
import clasesAbstractas.Guerrero;

public class Marine extends Guerrero{
	  
	  public Marine(double vida,double fuerza, Arma primaria, Arma secundaria){ //Agregar mas caracteristicas si las tiene.....
	    super(vida,fuerza,primaria,secundaria);
	  }

	  @Override
	  public void atacar(Guerrero otro) {
		  System.out.println("El guerrero Marine esta atacando a "+otro.getClass().getSimpleName());
	  }



}
