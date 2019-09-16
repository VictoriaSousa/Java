package collections;
import java.util.*;

public class Collection3 { // Collection = TreeSet

	public static void main(String[] args) {
		Collection3 c3 = new Collection3();
		
		TreeSet<Integer> list = c3.iniciar();
		
		System.out.println("Inserindo item na TreeSet: ");
		c3.inserir(list, 3);
		c3.mostrar(list);
		
		System.out.println("\nRemovendo item da TreeSet: ");
		c3.remover(list, 0);
		c3.mostrar(list);
	}
	
	public TreeSet<Integer> iniciar() {
		TreeSet<Integer> lista = new TreeSet<Integer>();
		return lista; 
	}
	
	public void inserir(TreeSet<Integer> lista, int qntd) {
		Random r = new Random();
		while(qntd > 0) {
			int number = Math.abs(r.nextInt()) % 11;
			lista.add(number);
			qntd--;
		}
	}
	
	public void remover( TreeSet<Integer> lista, int index) {
		lista.remove(index);
	}
	
	public void mostrar(TreeSet<Integer> lista) {
		System.out.println(lista);
	}
}
