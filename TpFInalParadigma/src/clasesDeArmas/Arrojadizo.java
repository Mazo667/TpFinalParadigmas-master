package clasesDeArmas;

import clasesAbstractas.Arma;
import interfaces.Agotable;

public abstract class Arrojadizo extends Arma implements Agotable{
	 private int cantidad;
	  
	  public Arrojadizo(double daño,double efectividad,int cantidad){
	    super(daño,efectividad);
	    this.setCantidad(cantidad);
	  }
	
	  @Override
	public void disparar() {
		setCantidad(cantidad--);
		
	}
	  
	  @Override
	public int getCantidad() {
		return this.cantidad;
	}
	  

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	   
}
