
public class Main {

	public static void main(String[] args) {
	/*	
		//Creo tablero de 3 casillas y coloco 1 jugador en (0,0)
		Tablero tablero = new Tablero();
		Casilla[][] mapa = new Casilla[1][3];
		tablero.crearMapa1(mapa);
		Jugador j1 = new Jugador();
		j1.lugarTableroX = j1.lugarTableroY = 0;
		//////////////////////
		
		//Simulo que jugador recien llego a casilla 1 y aplico efecto
		tablero.mapa[j1.lugarTableroY][j1.lugarTableroX].aplicarEfecto(j1);
		System.out.println(j1.puntos);
		
		*/
		Tablero tablero = new Tablero();
		Jugador jugador= new Jugador(0, "pepe",0, 5, 9,0,0, "oepe");
		if(tablero.puedeAvanzar(jugador, "arriba")) {
			System.out.println("puede");
		}
		else
			System.out.println("no puede");
		

	}

}
