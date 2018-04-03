package domain;

public class Mascota {
	private Estado estado;
	private int felicidad;

public boolean podesJugar(){
	return this.estado.podesJugar();
}
public int gradoFelicidad(){
	return felicidad;
	
}
public void incrementarFelicidad(int cantidad){
	this.felicidad =+ cantidad;
}
public void cambiarEstado(Estado unEstado){
	this.estado = unEstado;
}
public Estado estado(){
	return estado;
}
public void juga(){
	this.estado.juga(this);
}
public void come(){
	this.estado.come(this);
}
}
