package clienteServidor;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import clienteServidor.MiServidor.HiloServidor;
import logica.AbstractAdapter;
import logica.EfectoDarObjeto;
import logica.Jugador;
import logica.MyExclusionStrategy;

public class ManejadorDeImputOutput {
	
	
	
	public static void avisarCambio(Jugador jugador, PaqueteMensaje paquete,HashMap<Jugador, HiloServidor> jugadoresLobby) {

		GsonBuilder builder = new GsonBuilder();
//		builder.registerTypeAdapter(EfectoDarObjeto.class, new AbstractAdapter()).setExclusionStrategies(new MyExclusionStrategy());
		builder.setExclusionStrategies(new MyExclusionStrategy());
		builder.registerTypeAdapter(EfectoDarObjeto.class, new AbstractAdapter());
		Gson gson = builder.create();
		String mensaje = gson.toJson(paquete);
		DataOutputStream salida;
		for (Map.Entry<Jugador, HiloServidor> cliente : jugadoresLobby.entrySet()) {
			System.out.println("ubicacion de cliente: "+cliente.getValue().getUbicacion());
			System.out.println("ubicacion destino: "+ paquete.getUbicacionDestino());
			if (!cliente.getValue().getJugador().getNombre().equals(jugador.getNombre()) && cliente.getValue().getUbicacion().equals(paquete.getUbicacionDestino())) {
				try {
					salida = new DataOutputStream(cliente.getValue().getSocketServidorCliente().getOutputStream());
					salida.writeUTF(mensaje);
					if(mensaje.equals("InicioPartida"))
						cliente.getValue().setCorriendo(false);
				} catch (IOException e) {
					System.out.println(e.getMessage());
				}

			}
		}
	}

}