package domain;
import java.time.*;

public class Aburrida extends Estado{
	private LocalTime horaInicioAburrimiento;

public void come(Mascota unaMascota){
	if(minutosAburrida() > 80){
		unaMascota.cambiarEstado(new Contenta());
	}
}
public long minutosAburrida(){
	LocalTime horaActual = LocalTime.now();
	long diferencia = Duration.between(horaInicioAburrimiento,horaActual).toMinutes();
	return diferencia;
}
@Override
public void juga(Mascota unaMascota){
	unaMascota.cambiarEstado(new Contenta());
	
}

}
