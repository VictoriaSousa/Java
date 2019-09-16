package collections;
import java.util.*;

public class Collection1 { // Collection = LinkedList

	public static void main(String[] args) {
		Collection1 c1 = new Collection1();
		
		LinkedList<Integer> list = c1.iniciar();
		
		System.out.println("Inserindo no inicio da LinkedList: ");
		c1.inserir_inicio(list, 2);
		c1.mostrar(list);
		
		System.out.println("\nInserindo no fim da LinkedList: ");
		c1.inserir_fim(list, 2);
		c1.mostrar(list);
		
		System.out.println("\nRemovendo item da LinkedList: ");
		c1.remover(list, 2);
		c1.mostrar(list);
	}
	
	public LinkedList<Integer> iniciar() {
		LinkedList<Integer> lista = new LinkedList<Integer>();
		return lista; 
	}
	
	public void inserir_inicio(LinkedList<Integer> list, int qntd) {
		Random r = new Random();
		while(qntd > 0) {
			int number = Math.abs(r.nextInt()) % 11;
			list.add(number);
			qntd--;
		}
	}
	
	public void inserir_fim(LinkedList<Integer> lista, int qntd) {
		Random r = new Random();
		while(qntd > 0) {
			int number = Math.abs(r.nextInt()) % 11;
			lista.addLast(number);
			qntd--;
		}
	}	
	
	public void remover(LinkedList<Integer> lista, int index) {
		lista.remove(index);
	}
	
	public void mostrar(LinkedList<Integer> lista) {
		System.out.println(lista);
	}
}
