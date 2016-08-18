package pe.edu.upc.entity;

public class Mermelada  extends Fruta{
	
	protected int tiempoPreparacion;
	protected String tipoEnsase;

	public Mermelada(String color, String sabor,
			int tiempoPreparacion,String tipoEnvase) {
		super(color, sabor);
		// TODO Auto-generated constructor stub
		this.tiempoPreparacion=tiempoPreparacion;
		this.tipoEnsase=tipoEnvase;
	}

	public int getTiempoPreparacion() {
		return tiempoPreparacion;
	}

	public void setTiempoPreparacion(int tiempoPreparacion) {
		this.tiempoPreparacion = tiempoPreparacion;
	}

	public String getTipoEnsase() {
		return tipoEnsase;
	}

	public void setTipoEnsase(String tipoEnsase) {
		this.tipoEnsase = tipoEnsase;
	}

	@Override
	public String toString() {
		return "Mermelada [tiempoPreparacion=" + tiempoPreparacion + ", tipoEnsase=" + tipoEnsase + "]";
	}

}
