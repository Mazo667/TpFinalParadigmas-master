package guerreros;


import clasesAbstractas.Arma;
import clasesAbstractas.Guerrero;

public class Ninja extends Guerrero{
	  
	  public Ninja(double vida,double fuerza,Arma primaria,Arma secundaria){
	    super(vida,fuerza,primaria,secundaria);
	  }
	

	@Override
	public void atacar(Guerrero otro) {
		System.out.println("El guerrero zulu esta atacando a "+otro.getClass().getSimpleName());
	}
	

}
