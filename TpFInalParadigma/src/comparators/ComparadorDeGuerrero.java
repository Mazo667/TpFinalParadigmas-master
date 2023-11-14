package comparators;

import java.util.Comparator;

import clasesAbstractas.Guerrero;

public class ComparadorDeGuerrero implements Comparator<Guerrero>{

	@Override
	public int compare(Guerrero guerrero1, Guerrero guerrero2) {
		double radio = (guerrero1.getFuerza() * guerrero1.getPrimaria().getDaño() / guerrero1.getPrimaria().getEfectividad());
		return Double.compare(
	( (guerrero1.getFuerza()) * (guerrero1.getPrimaria().getDaño()) / guerrero1.getPrimaria().getEfectividad() ),
	( (guerrero2.getFuerza() * (guerrero2.getPrimaria().getDaño() / guerrero2.getPrimaria().getEfectividad()))  )
				);
	}

}
