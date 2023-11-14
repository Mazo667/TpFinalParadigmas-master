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
		public void disparar() {
			setMunicion(municion--);
		}
	
		@Override
		public int getCantidad() {
			return municion;
		}
	  
		  @Override
		public void recargar() {
			System.out.println("Se esta recargando");
		}
	  

		public void setMunicion(int municion) {
			this.municion = municion;
		}
	  
}
