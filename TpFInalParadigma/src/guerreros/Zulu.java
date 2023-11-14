package guerreros;

import java.util.Collections;
import java.util.List;

import clasesAbstractas.Arma;
import clasesAbstractas.Guerrero;
import comparators.ComparadorDeGuerrero;

public class Zulu extends Guerrero{
	  private double efectotalP;
	  private double efectotalS;

	public Zulu(double vida,double fuerza,Arma primaria,Arma secundaria){
	   super(vida,fuerza, primaria, secundaria);
	   setEfectotalP(super.getFuerza(),super.getPrimaria().getDaño(),super.getPrimaria().getEfectividad());
	    setEfectotalS(super.getFuerza(),super.getSecundaria().getDaño(),super.getSecundaria().getEfectividad());
	 }


	 @Override
	  public Guerrero atacar(Guerrero otro) {
		 System.out.println("El zulu ataco al "+otro.getClass().getSimpleName()
				 + " con "+ super.getPrimaria().getClass().getSimpleName()+ ", ocasionando "+getEfectotalP()+" de daño.");
		 otro.setNivelVida(otro.getNivelVida()-getEfectotalP());
		 return otro;
	  }
	  
	  	public double getEfectotalP() {
			return efectotalP;
		}

		public void setEfectotalP(double fuerza,double daño, double efectividad ) {
			this.efectotalP = (fuerza * daño) / efectividad;
		}
		
		public double getEfectotalS() {
			return efectotalS;
		}

		public void setEfectotalS(double fuerza,double daño, double efectividad ) {
			this.efectotalS = (fuerza * daño) / efectividad;
		}
	
	
}
