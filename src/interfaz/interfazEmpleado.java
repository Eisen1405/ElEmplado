package interfaz;

import mundo.Empleado;
public class interfazEmpleado {

	public static void main(String[] args)
	{
		Empleado empleado1;
		empleado1 = new Empleado( "eisenhawer", 1110447221, "calle 2 32-86 B/LIBERTADOR", 
									4000000.0, 8.0 );
		System.out.println( empleado1.getNombre() );
		System.out.println(empleado1.getCedula() );
		
	}

}
