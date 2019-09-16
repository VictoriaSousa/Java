package collections;
import java.util.*;

public class Fila { // Collection = LinkedList

	public static void main(String[] args) {
		Fila fila = new Fila();
		
		LinkedList<Integer> list = fila.iniciar();
		
		System.out.println("Inserindo item na Fila: ");
		fila.inserir(list);
		fila.mostrar(list);
		
		System.out.println("\nInserindo item na Fila: ");
		fila.inserir(list);
		fila.mostrar(list);
		
		System.out.println("\nInserindo item na Fila: ");
		fila.inserir(list);
		fila.mostrar(list);
		
		System.out.println("\nInserindo item na Fila: ");
		fila.inserir(list);
		fila.mostrar(list);
		
		System.out.println("\nRemovendo item da Fila: ");
		fila.remover(list);
		fila.mostrar(list);
	}
	
	public LinkedList<Integer> iniciar() {
		LinkedList<Integer> lista = new LinkedList<Integer>();
		return lista; 
	}
	
	public void inserir(LinkedList<Integer> lista) {
		Random r = new Random();
		int number = Math.abs(r.nextInt()) % 11;
		lista.addLast(number);
	}
	
	public void remover( LinkedList<Integer> lista) {
		lista.removeFirst();
	}
	
	public void mostrar(LinkedList<Integer> lista) {
		System.out.println(lista);
	}
}
