package com.dio;

import com.dio.base.Order;

public class Main{

	public static void main(String[] args) {
		
		Order order = new Order("Lua", "Preto", 3);
		Livros livros = new Livros();
		
		System.out.println(order);
		System.out.println(livros);
		
	}
	
}

class Livros{
	private String nome;
	private Integer npag;
}
