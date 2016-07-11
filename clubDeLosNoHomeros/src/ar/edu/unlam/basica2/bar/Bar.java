package ar.edu.unlam.basica2.bar;

import java.util.*;

public class Bar {
	
	private Boolean abiertoCerrado = false;
	private TreeSet<Cliente> listaDeClientes;
	

	public Bar(){
		
		this.abiertoCerrado = false;
		this.listaDeClientes = new TreeSet <Cliente>();
	}

	public Bar(String estado){
		
		if(estado == "abierto"){
			this.abiertoCerrado = true;
		}
		this.listaDeClientes = new TreeSet <Cliente>();
	}
	
	public Bar(String estado, TreeSet<Cliente> listaDeClientes){
		
		if(estado == "abierto"){
			this.abiertoCerrado = true;
		}
		this.listaDeClientes = listaDeClientes;
	}
	
	public Bar(TreeSet<Cliente> listaDeClientes){
		
		this.abiertoCerrado = false;
		
		this.listaDeClientes = listaDeClientes;
	}
	
	
	
	
	public Boolean getAbiertoCerrado() {
		return abiertoCerrado;
	}

	public void setAbiertoCerrado(String estado) {
		
		if(estado == "abierto"){
			this.abiertoCerrado = true;
		}else this.abiertoCerrado = false;
	}
	
	public TreeSet<Cliente> getListaDeClientes(){
		
		return this.listaDeClientes;
	}
	
	public void setListaDeClientes(Cliente nuevoCliente){
		
		listaDeClientes.add(nuevoCliente);
	}
	
	
	public Boolean siElBarEstaAbierto(){
		
		if(abiertoCerrado){
			System.out.println("El bar esta abierto");
			return true;
		}else{
			System.out.println("El Bar aun esta cerrado.");
			return false;
		}
	}
	
	
	public Boolean siIngresaElClienteAlBar(Cliente elCliente){
		
		if(siElBarEstaAbierto()){
			
			Iterator<Cliente> it = listaDeClientes.iterator();
			
			while (it.hasNext()) {
				
				if(elCliente.equals(it.next())){
					System.out.println("El cliente no puede pasar porque ya hay un " + elCliente.getNombre() + " dentro del bar");
					return false;
					
				}
				
			}
			
			System.out.println("El cliente puede pasar");
			listaDeClientes.add(elCliente);
			return true;
		}
		
		System.out.println("El Bar esta cerrado");
		return false;
		
	}
	
}	
	
	
// este codigo no va!
	
	/*public static class ListaDeClientes {
		
		private TreeSet<Cliente> listado;
		
		
		
		public ListaDeClientes(Cliente clienteParaAnotar){
			listado.add(clienteParaAnotar);
		}

		public ListaDeClientes(String nombre, int edad) {
			
			Cliente elCliente = new Cliente(nombre,edad);
			listado.add(elCliente);
		}

		public void agregarClienteEnLista(Cliente elCliente){
			listado.add(elCliente);
		}
		
		
	}*/
	
	
		/*@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + getOuterType().hashCode();
			result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
			return result;
		}*/
		
		/*public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Cliente other = (Cliente) obj;
			if (!getOuterType().equals(other.getOuterType()))
				return false;
			if (nombre == null) {
				if (other.nombre != null)
					return false;
			} else if (!nombre.equals(other.nombre))
				return false;
			return true;
		}

		private Bar getOuterType() {
			return Bar.this;
		}*/
		


