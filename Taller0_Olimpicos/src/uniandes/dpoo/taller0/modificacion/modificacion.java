package uniandes.dpoo.taller0.modificacion;

import java.io.IOException;
import uniandes.dpoo.taller0.procesamiento.CalculadoraEstadisticas;
import uniandes.dpoo.taller0.procesamiento.LoaderOlimpicos;


public class modificacion
{
	public static void main(String[] args)
	{
		System.out.println("hola mundo!!");
		CalculadoraEstadisticas calc;
		try {
			calc = LoaderOlimpicos.cargarArchivo("./data/atletas.csv");
			System.out.println(calc.paisConMasMedallistas());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
