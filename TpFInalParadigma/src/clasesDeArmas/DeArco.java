package clasesDeArmas;

import clasesAbstractas.Arma;
import interfaces.Agotable;

public abstract class DeArco extends Arma implements Agotable{
	  private int cantidad;

	public DeArco(double daño,double efectividad,int cantidad){
	    super(daño,efectividad);
	    this.cantidad = cantidad;
	  }
	  
	  @Override
	public void agotar() {
		this.cantidad = 0;
	}
	  
	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	  
	  
}
