package collections;
import java.util.*;

public class Collection4 { // Collection = LinkedHashSet

	public static void main(String[] args) {
		Collection4 c4 = new Collection4();
		
		LinkedHashSet<String> list = c4.iniciar();
		
		System.out.println("Inserindo no inicio do LinkedHashSet: ");
		c4.inserir_inicio(list);
		c4.mostrar(list);
		
		System.out.println("\nInserindo no fim do LinkedHashSet: ");
		c4.inserir_fim(list);
		c4.mostrar(list);
		
		System.out.println("\nRemovendo item do LinkedHashSet: ");
		c4.remover(list);
		c4.mostrar(list);
	}
	
	public LinkedHashSet<String> iniciar() {
		LinkedHashSet<String> lista = new LinkedHashSet<String>();
		return lista; 
	}
	
	public void inserir_inicio(LinkedHashSet<String> lista) {
		lista.add("Maçã");
		lista.add("Laranja");
		lista.add("Limão");
	}
	
	public void inserir_fim(LinkedHashSet<String> lista) {	
		lista.add("Melancia");
		lista.add("Abacate");
	}	
	
	public void remover( LinkedHashSet<String> lista) {
		lista.remove("Laranja");
	}
	
	public void mostrar(LinkedHashSet<String> lista) {
		System.out.println(lista);
	}
}
