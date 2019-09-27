import java.io.File;
import java.util.List;
import java.util.Scanner;

public class Ronda {
	int turno;
	int cantTurnos;
	
	
	
	public Ronda(int cantTurnos) {
		super();
		this.cantTurnos = cantTurnos;
	}

	public boolean InicioRonda(List<Jugador> listaJugadores,int cantJugadores,Tablero tablero,int puntosObjetivo ) throws Exception {
		Scanner reader= new Scanner(new File("AccionesJugadores.txt"));
		this.turno=1;//Inicio el turno en 1
		Turno suTurno=null; 
		while(this.turno<cantJugadores && GanadorporObjetivo(puntosObjetivo,cantJugadores,listaJugadores)==null) {
			suTurno=new Turno(this.turno);//inicializo un turno 
			//Si esta ordenado por turno la lista
			this.turno=suTurno.turno(this.turno,listaJugadores.get(this.turno-1),tablero,reader);//Inicio turno	
			
			//Si no estan ordenados en la lista los jugadores por turno 
			/*int j=0;
			while(!(listaJugadores.get(j).getNroTurno()==this.turno) && j<listaJugadores.size()) {
				//si no encuentro al jugador con el numero de turno que corresponde 
				j++;//sigo buscando
			}
			this.turno=suTurno.turno(this.turno,listaJugadores.get(j),tablero,reader);//Inicio turno
			*/
			
		}
		reader.close();
		if(GanadorporObjetivo(puntosObjetivo,cantJugadores,listaJugadores)!=null)
			return true;
		return false;
	}
	
	
	public boolean terminaRonda(int cantJugadores) {
		if(this.turno<=cantJugadores)
			return false;
	return true;
	}

	public Jugador GanadorporObjetivo(int puntosObjetivo, int cantJugadores, List<Jugador> listaJugadores){
		int i=0;
		while(i<cantJugadores)
			if(listaJugadores.get(i).getPuntos()==puntosObjetivo) {
				System.out.println("GANO JUGADOR"+listaJugadores.get(i).getNombre());
				return listaJugadores.get(i);
			}
		return null;
	}
     
	
}	

