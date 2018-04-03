package domain;

public class Hambrienta extends Estado {
	public void come(Mascota unaMascota){
		unaMascota.cambiarEstado(new Contenta());
		
	}
	public boolean podesJugar(){
		return false;
	}

}
