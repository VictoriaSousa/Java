package collections;
import java.util.*;

public class Collection2 { // Collection = Vector

	public static void main(String[] args) { // metodo main, que vai ser executado automaticamente ao executar a classe
		Collection2 c2 = new Collection2(); // instancia um objeto da propria classe
		
		Vector<String> list = c2.iniciar(); //instancia um objeto da classe Vector com o retorno do metodo iniciar()
		
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
	
	public Vector<String> iniciar() { //retorna um objeto Vector<String>
		Vector<String> lista = new Vector<String>(); //instancia um obejeto da classe Vector
		return lista; //retorna o objeto criado
	}
	
	public void inserir_inicio(Vector<String> lista) { //adiciona elementos no Vector recebido como parametro
		lista.add("Joao"); //adiciona uma string
		lista.add("Gabriela"); //adiciona uma string
		lista.add("Isaac"); //adiciona uma string
	}
	
	public void inserir_fim(Vector<String> lista) { //adiuciona ao fim do Vector recebido como parametro
		lista.addElement("Jorge"); //adiciona uma string
	}	
	
	public void remover( Vector<String> lista) { //remove um elemento do Vector passado como parametro
		lista.remove("Joao"); //remove a String passada como argumento
	}
	
	public void mostrar(Vector<String> lista) { //imprime o Vector passado como parametro
		System.out.println(lista); //imprime a lista no terminal
	}
}
