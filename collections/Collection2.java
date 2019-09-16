package collections;
import java.util.*;

public class Collection2 { // Collection = Vector

	public static void main(String[] args) {
		Collection2 c2 = new Collection2();
		
		Vector<String> list = c2.iniciar();
		
		System.out.println("Inserindo no inicio do vector: ");
		c2.inserir_inicio(list);
		c2.mostrar(list);
		
		System.out.println("\nInserindo no fim do vector: ");
		c2.inserir_fim(list);
		c2.mostrar(list);
		
		System.out.println("\nRemovendo item do vector: ");
		c2.remover(list);
		c2.mostrar(list);
	}
	
	public Vector<String> iniciar() {
		Vector<String> lista = new Vector<String>();
		return lista; 
	}
	
	public void inserir_inicio(Vector<String> lista) {
		lista.add("João");
		lista.add("Gabriela");
		lista.add("Isaac");
	}
	
	public void inserir_fim(Vector<String> lista) {	
		lista.addElement("Jorge");
	}	
	
	public void remover( Vector<String> lista) {
		lista.remove("João");
	}
	
	public void mostrar(Vector<String> lista) {
		System.out.println(lista);
	}
}
