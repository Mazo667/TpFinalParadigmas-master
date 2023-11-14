package clasesDeArmas;

import clasesAbstractas.Arma;

public abstract class Blanca extends Arma{
	 private int uso;
	  
	 public Blanca(double daño,double efectividad,int uso){
	    super(daño,efectividad);
	    this.setUso(uso);
	 }

	public int getUso() {
		return uso;
	}

	public void setUso(int uso) {
		this.uso = uso;
	}
}
