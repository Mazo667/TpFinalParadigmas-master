package clasesAbstractas;

public abstract class Guerrero {
	 private double nivelVida;
	 private double fuerza;
	 private Arma primaria;
	  private Arma secundaria;
	  
	  public Guerrero(double vida,double fuerza,Arma primaria,Arma secundaria){
	    this.nivelVida = vida;
	    this.fuerza = fuerza;
	    this.primaria = primaria;
	    this.secundaria = secundaria;
	  }
	  
	  public abstract Guerrero atacar(Guerrero otro);
	  
	  public double getNivelVida() {
			return nivelVida;
		}

		public void setNivelVida(double nivelVida) {
			this.nivelVida = nivelVida;
		}

		public Arma getPrimaria() {
			return primaria;
		}

		public void setPrimaria(Arma primaria) {
			this.primaria = primaria;
		}

		public Arma getSecundaria() {
			return secundaria;
		}

		public void setSecundaria(Arma secundaria) {
			this.secundaria = secundaria;
		}
		
		public double getFuerza() {
			return fuerza;
		}

		public void setFuerza(double fuerza) {
			this.fuerza = fuerza;
		}

}
