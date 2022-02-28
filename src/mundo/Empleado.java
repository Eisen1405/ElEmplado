package mundo;

public class Empleado
{
	//-----------------------------------------
	// Atributos
	//-----------------------------------------
	private String nombre;
	private int cedula;
	private String direccion;
	private double salarioBase;
	private double porcentajeRetencion;
	
	
	//------------------------
	//Constructor
	//-----------------------
	public Empleado(String pNombre, int pCedula,String pDireccion, 
			double pSalarioBase,double pPorcentajeRetencion)
	{
		nombre = pNombre;
		cedula = pCedula;
		direccion = pDireccion;
		salarioBase = pSalarioBase;
		porcentajeRetencion =pPorcentajeRetencion;
	}
	//--------------------------
	//Metodos
	//--------------------------
		
	public double calcularDescuento( )
	{
		return salarioBase * porcentajeRetencion / 100;
	}
	
	public double calcularSalarioPorPagar()
	{
		return salarioBase - calcularDescuento();
	}
	
	//--------------------
	//metodo get = para conocer el valor de UN atributo 
	//se utiliza  get por cada atributo
	//-------------------------------
	//public tipoDatosAtributo getAtributo( )
	//{
	//return atributo;
	//}
	
	public String getNombre( )
	{
		return nombre;
	}
	public int getCedula( )
	{
		return cedula;
	}
	
	public String getDireccion( )
	{
		return direccion;
	}
	public double getSalarioBase( )
	{
		return salarioBase;
	}
	public double getPorcentajeretencion( )
	{
		return porcentajeRetencion;
	}
	
	//----------------------------------
	//metodo set =no da a concer el valor o resultado
	//------------------------
	//public void setAtributo (atributo parametro)
	//{
	//	algoritmo= parametro;
	//}
	
	public void setNombre(String pNombre )
	{
		nombre = pNombre;
	}
	public void setCedula ( int pCedula )
	{
		cedula= pCedula;
	}
	public void setDireccion(String pDireccion )
	{
		direccion = pDireccion;
	}
	public void setSalarioBase(double pSalarioBase )
	{
		salarioBase = pSalarioBase;
	}
	public void setPorcentajeRetencion (double pPorcentajeRetencion)
	{
		porcentajeRetencion = pPorcentajeRetencion;
	}
	
	
}

