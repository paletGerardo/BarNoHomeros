package ar.edu.unlam.basica2.bar;


public class Cliente implements Comparable{

	// campos de la clase
	private String nombre;
	private Integer edad;
	
	public Cliente(String nombre, Integer edad){
		this.nombre = nombre;
		this.edad = edad;
	}

	// Geters y Seters
	public String getNombre() {
		return nombre;
	}
	
	public String getEdad() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public void setEdad(int edad) {
		this.edad = edad;
	}

	@Override
	public boolean equals(Object obj){
		
		if(obj instanceof Cliente){
			
			Cliente clienteRecibido = (Cliente) obj;
			if(this.nombre == clienteRecibido.getNombre()){
				return true;
			}else return false;
			
		}else return false;
	}
	
	@Override
	public int hashCode() {
		/*final int prime = 31;
		int result = 1;
		result = prime * result + getOuterType().hashCode();
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		return result;*/
		return 1;
	}
	
	@Override
	public int compareTo(Object obj){
		
		if(obj instanceof Cliente){
			
			Cliente clienteRecibido = (Cliente) obj;
			return this.nombre.compareTo(clienteRecibido.getNombre());
		}
		return 1;
	}
	
	
}
