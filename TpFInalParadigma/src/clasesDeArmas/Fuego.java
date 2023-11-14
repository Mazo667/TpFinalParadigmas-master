package clasesDeArmas;

import clasesAbstractas.Arma;
import interfaces.Recargable;

public abstract class Fuego extends Arma implements Recargable{
	private int municion;
	  

	public Fuego(double daño,double efectividad,int municion){
	    super(daño,efectividad);
	    this.municion = municion;
	  }
	  
	  @Override
	public void agotar() {
		this.municion = 0;
		
	}
	  
	  @Override
	public void recargar() {
		// TODO Auto-generated method stub
		
	}
	  
	  public int getMunicion() {
			return municion;
		}

		public void setMunicion(int municion) {
			this.municion = municion;
		}
	  
}
