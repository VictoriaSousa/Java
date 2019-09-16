package collections;
import java.util.*;

public class Collection5 { // Collection = Stack

	public static void main(String[] args) {
		Collection5 c5 = new Collection5();
		
		Stack<Integer> list = c5.iniciar();
		
		System.out.println("Inserindo no inicio da Stack: ");
		c5.inserir_inicio(list, 3);
		c5.mostrar(list);
		
		System.out.println("\nInserindo no fim da Stack: ");
		c5.inserir_fim(list, 3);
		c5.mostrar(list);
		
		System.out.println("\nRemovendo item da Stack: ");
		c5.remover(list, 0);
		c5.mostrar(list);
	}
	
	public Stack<Integer> iniciar() {
		Stack<Integer> lista = new Stack<Integer>();
		return lista; 
	}
	
	public void inserir_inicio(Stack<Integer> lista, int qntd) {
		Random r = new Random();
		while(qntd > 0) {
			int number = Math.abs(r.nextInt()) % 11;
			lista.add(number);
			
			qntd--;
		}
	}
	
	public void inserir_fim(Stack<Integer> lista, int qntd) {
		Random r = new Random();
		while(qntd > 0) {
			int number = Math.abs(r.nextInt()) % 11;
			lista.addElement(number);
			qntd--;
		}
	}
	
	public void remover( Stack<Integer> lista, int index) {
		lista.remove(index);
	}
	
	public void mostrar(Stack<Integer> lista) {
		System.out.println(lista);
	}
}

