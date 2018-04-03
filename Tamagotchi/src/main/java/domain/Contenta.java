package domain;

public class Contenta extends Estado{
	private int cantidadVecesJugo;
public void come(Mascota unaMascota){
	unaMascota.incrementarFelicidad(1);
}
public void juga(Mascota unaMascota){
	if(cantidadVecesQueJugo() > 5){
		unaMascota.cambiarEstado(new Hambrienta());
	}else{
		unaMascota.incrementarFelicidad(2);
		this.cantidadVecesJugo =+ 1;
	}
}
public int cantidadVecesQueJugo(){
	return cantidadVecesJugo;
}
}
