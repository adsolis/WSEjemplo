package mc.com.sintelti.client;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.client.RestTemplate;

import java.rmi.RemoteException;
import java.util.HashMap;
import java.util.Map;

import NET.webserviceX.www.GlobalWeather;
import NET.webserviceX.www.GlobalWeatherSoap;
import NET.webserviceX.www.GlobalWeatherSoapProxy;
import mc.com.sintelti.EjemploWSBean;
import mc.com.sintelti.EjemploWSBeanProxy;

public class Principal {

	public static void main(String[] args) {
		EjemploWSBean ejemplo = new EjemploWSBeanProxy("http://localhost:8080/DemoWebService/services/EjemploWSBean");
		try {
			System.out.println(ejemplo.crearPersona("Alejandro", "Diaz Solis", "Ingeniero de Software"));
		} catch (RemoteException e) {
			e.printStackTrace();
		}
		
		Map<String, String> mapa = new HashMap<String, String>();
		RestTemplate rest = new RestTemplate();
		mapa.put("name", "Luis");
		//System.out.println(rest.put("http://localhost:8080/crear", mapa));
		
	}

}
