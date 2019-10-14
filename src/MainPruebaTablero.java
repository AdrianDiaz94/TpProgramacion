import java.util.LinkedList;
import java.util.List;

public class MainPruebaTablero {

	public static void main(String[] args) throws InterruptedException {
		// TODO Ap�ndice de m�todo generado autom�ticamente
		Jugador jugador1 = new Jugador("pepe","pepe");
		jugador1.setLugarTableroX(0);
		jugador1.setLugarTableroY(0);
		jugador1.setPosicionAnteriorX(0);
		jugador1.setPosicionAnteriorY(0);
		Jugador jugador2 = new Jugador("pepe","pepe");
		jugador2.setLugarTableroX(3);
		jugador2.setLugarTableroY(0);
		jugador2.setPosicionAnteriorX(0);
		jugador2.setPosicionAnteriorY(0);
		Jugador jugador3 = new Jugador("pepe","pepe");
		jugador3.setLugarTableroX(5);
		jugador3.setLugarTableroY(5);
		jugador3.setPosicionAnteriorX(4);
		jugador3.setPosicionAnteriorY(5);
		Jugador jugador4 = new Jugador("pepe","pepe");
		jugador4.setLugarTableroX(7);
		jugador4.setLugarTableroY(10);
		jugador4.setPosicionAnteriorX(0);
		jugador4.setPosicionAnteriorY(0);

		List<Jugador> jugadores= new LinkedList<Jugador>();
		jugadores.add(jugador1);
		jugadores.add(jugador2);
		jugadores.add(jugador3);
		jugadores.add(jugador4);
		
		Tablero tablero = new TableroNormal(jugadores);
		Thread.sleep(10000);
		tablero.avanzarJugador(jugador3, 3);
	}
	

}