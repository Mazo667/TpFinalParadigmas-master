package clasesAbstractas;

public abstract class Arma {
	private double daño;
	private double efectividad;
  
  
  	public Arma(double daño,double efec){
      this.setDaño(daño);
      this.setEfectividad(efec);
    }


	public double getDaño() {
		return daño;
	}


	public void setDaño(double daño) {
		this.daño = daño;
	}


	public double getEfectividad() {
		return efectividad;
	}


	public void setEfectividad(double efectividad) {
		this.efectividad = efectividad;
	}
}
