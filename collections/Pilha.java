package collections;
import java.util.*;

public class Pilha { // Collection = LinkedList

	public static void main(String[] args) {
		Pilha pilha = new Pilha();
		
		LinkedList<Integer> list = pilha.iniciar();
		
		System.out.println("Inserindo item na Pilha: ");
		pilha.inserir(list);
		pilha.mostrar(list);
		
		System.out.println("\nInserindo item na Pilha: ");
		pilha.inserir(list);
		pilha.mostrar(list);
		
		System.out.println("\nInserindo item na Pilha: ");
		pilha.inserir(list);
		pilha.mostrar(list);
		
		System.out.println("\nInserindo item na Pilha: ");
		pilha.inserir(list);
		pilha.mostrar(list);
		
		System.out.println("\nRemovendo item da Pilha: ");
		pilha.remover(list);
		pilha.mostrar(list);
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
		lista.removeLast();
	}
	
	public void mostrar(LinkedList<Integer> lista) {
		System.out.println(lista);
	}
}
