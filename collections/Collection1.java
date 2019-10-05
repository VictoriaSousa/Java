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
	
	public LinkedList<Integer> iniciar() { //função para iniciar a LinkedList, devolve um list que vai ser atribuida a um objeto no main
		LinkedList<Integer> lista = new LinkedList<Integer>();	//instancia um objeto LinkedList 
		return lista;	//retorna o LinkedList 
	}
	
	public void inserir_inicio(LinkedList<Integer> list, int qntd) { //função que vai inserir objetos no inicio da LinkedList que foi passada como parametro, na quantidade que foi passada como parametro
		Random r = new Random(); //instancia um objeto da classe Random
		while(qntd-- > 0) {	//fica em laço enquanto a variavel qntd for maior que 0, depois da verificação decrementa a variavel
			int number = Math.abs(r.nextInt()) % 11;	//atribui a number um inteiro aleatorio entre 0 e 10
			list.addFirst(number); //adiciona no inico da List
		}
	}
	
	public void inserir_fim(LinkedList<Integer> lista, int qntd) { //função que vai inserir objetos no inicio da LinkedList que foi passada como parametro, na quantidadeque foi passada como parametro
		Random r = new Random();	//instancia um objeto da classe Random
		while(qntd-- > 0) {	//fica em laço enquanto a variavel qntd for maior que 0, depois da verificação decrementa a variavel
			int number = Math.abs(r.nextInt()) % 11;	//atribui a number um inteiro aleatorio entre 0 e 10
			lista.addLast(number);	//insere no final da List
		}
	}	
	
	public void remover(LinkedList<Integer> lista, int index) {	//função vai remover da List o elemento com o indice que foi passado como parametro
		lista.remove(index);	//remove o elemento com o indice passado como parametro
	}
	
	public void mostrar(LinkedList<Integer> lista) {	//função para mostrar a List
		System.out.println(lista);	//imprime no console a List
	}
}
