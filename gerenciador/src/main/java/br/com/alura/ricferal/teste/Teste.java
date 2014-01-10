package br.com.alura.ricferal.teste;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class Teste {
	
	public static void main(String[] args) {
		List<Integer> numeros = new ArrayList<Integer>();	
		Map<String, Integer> n = new HashMap<String, Integer>();
		n.put("1", 3);
		n.put("2",4);
		n.put("3",1 );
		
		numeros.add(3);
		numeros.add(4);
		numeros.add(1);
	    Integer i = Collections.max(numeros);
	    Integer j = Collections.min(numeros);
	    System.out.println("ArrayList:");
	    System.out.println("O maior eh "+ i);
	    System.out.println("O maior eh "+ j);
	    
	    System.out.println("Map:");
	    String k = Collections.max(n.keySet());
	    String w = Collections.min(n.keySet());
	    
	    Integer r = Collections.max(n.values());
	    Integer s = Collections.min(n.values());
	    System.out.println("Considerando os indices do Mapa");
	    System.out.println("O maior eh "+ k);
	    System.out.println("O menor eh "+ w);
	    System.out.println("Considerando os valores do Mapa");
	    System.out.println("O maior eh "+ r);
	    System.out.println("O menor eh "+ s);
	}

}
