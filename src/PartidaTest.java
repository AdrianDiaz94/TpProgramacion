import static org.junit.Assert.*;

import java.util.*;
import java.util.List;

import org.junit.Test;

public class PartidaTest {
	@Test
	public void test() {
		
		List<Jugador> jugadores= new ArrayList<Jugador>();
		jugadores.add(new Jugador(2,"Perro",10,0,0,1,0,0,"pepe3"));
		jugadores.add(new Jugador(1,"Mono",20,0,0,1,0,0,"pepe4"));
		jugadores.add(new Jugador(3,"Rana",25,0,0,1,0,0,"pepe2"));
		jugadores.add(new Jugador(4,"Orca",15,0,0,1,0,0,"pepe1"));
		Partida p1 = new Partida(10,30,4,jugadores);
		//Pruebo que ordene por puntos
		p1.OrdenarporPuntos(jugadores);
		assertEquals(jugadores.get(0).getNombre(),"pepe2");
		assertEquals(jugadores.get(1).getNombre(),"pepe4");
		assertEquals(jugadores.get(2).getNombre(),"pepe1");
		assertEquals(jugadores.get(3).getNombre(),"pepe3");
		
		p1.mostrarPosicionesFinales();
	}

}
