package ar.edu.unlam.basica2.bar;

import static org.junit.Assert.*;

import java.util.TreeSet;

import org.junit.Test;


public class TestDelBar {

	@Test // este Test tiene 4 instancias de Bar, para probar los distintos constructores de la clase.
	public void testBarAbiertoSinClientes() {
		
		TreeSet<Cliente> listaDeClientes = new TreeSet<Cliente>();
		//TreeSet<Cliente> listaDeClientes;
		
		Bar barNoHomeros = new Bar();
		assertEquals(0, barNoHomeros.getListaDeClientes().size(),0.01);
		
		Bar barNoHomeros2 = new Bar("abierto");
		assertEquals(0, barNoHomeros.getListaDeClientes().size(),0.01);
		
		Bar barNoHomeros3 = new Bar("abierto", listaDeClientes);
		assertEquals(0, barNoHomeros.getListaDeClientes().size(),0.01);
		if(barNoHomeros3.siElBarEstaAbierto()){
			System.out.println("barNoHomeros3 esta abierto pero sin clientes");
			System.out.println("--------------------------------------------");
		}
		
		Bar barNoHomeros4 = new Bar(listaDeClientes);
		assertEquals(0, barNoHomeros.getListaDeClientes().size(),0.01);
		if(!barNoHomeros4.siElBarEstaAbierto()){
			System.out.println("barNoHomeros4 esta cerrado y sin clientes aun");
			System.out.println("--------------------------------------------");

		}
		
	}
	
	@Test
	public void TestAgregarClientes(){
		
		Bar barNoHomeros = new Bar();
		
		Cliente nuevoCliente = new Cliente("clint eastwood", 86);		
		barNoHomeros.setListaDeClientes(nuevoCliente);
		
		Cliente nuevoCliente2 = new Cliente("Bon Scott", 65);		
		barNoHomeros.setListaDeClientes(nuevoCliente2);	
		
		assertEquals(2, barNoHomeros.getListaDeClientes().size(),0.01);
	}
	
	@Test
	public void TestImprimirListaDeClientesOrdenadosPorNombre(){
		Bar barNoHomeros = new Bar();
		
		Cliente cl1 = new Cliente("clint eastwood", 86);
		Cliente cl2 = new Cliente("Bon Scott", 65);
		Cliente cl3 = new Cliente("yo", 33);
		
		barNoHomeros.setListaDeClientes(cl1);	
		barNoHomeros.setListaDeClientes(cl2);
		barNoHomeros.setListaDeClientes(cl3);	
		
		for(Cliente unCliente: barNoHomeros.getListaDeClientes()){
			System.out.println(unCliente.getNombre());
		}
	}
	

	@Test
	public void TestCompararClientes(){
		
		Cliente cl1 = new Cliente("clint eastwood", 86);
		Cliente cl2 = new Cliente("clint eastwood", 86);
		
		assertEquals(true, cl1.equals(cl2));
	}
	
	@Test
	public void TestSiElClientePuedePasar(){
		
		Bar barNoHomeros = new Bar("abierto");
		
		Cliente cl1 = new Cliente("clint eastwood", 86);
		Cliente cl2 = new Cliente("Bon Scott", 65);
		Cliente cl3 = new Cliente("yo", 33);
		
		Cliente cl5 = new Cliente("clint eastwood", 20);
		Cliente cl6 = new Cliente("Gerardo", 33);
		Cliente cl7 = new Cliente("Hugo", 33);
		
		// creo la lista de clientes
		barNoHomeros.setListaDeClientes(cl1);	
		barNoHomeros.setListaDeClientes(cl2);
		barNoHomeros.setListaDeClientes(cl3);
		
		//pruebo si puede pasar el cliente con el bar abierto, pero es repetido
		barNoHomeros.siIngresaElClienteAlBar(cl5);
		
		//pruebo si puede pasar el cliente con el bar abierto y no es cliente repetido
		barNoHomeros.siIngresaElClienteAlBar(cl6);
		
		//cierro el bar
		barNoHomeros.setAbiertoCerrado("cerrado");
		
		//pruebo si puede pasar el cliente 7
		barNoHomeros.siIngresaElClienteAlBar(cl7);

	}	
	
	

}
