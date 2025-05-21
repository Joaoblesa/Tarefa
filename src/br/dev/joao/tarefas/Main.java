package br.dev.joao.tarefas;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;

import br.dev.joao.tarefas.model.Tarefa;

public class Main {

	static String caminho = "/Users/25132585/tarefasDS1TA/tarefas";
	
	public static void main(String[] args) {
		
		Tarefa tarefa1 = new Tarefa("Lavar a louça");
		
		//escreverArquivo();
		//lerArquivo();
		
}
	
	private static void escreverArquivo() {
		
		FileWriter fw = null;
		BufferedWriter bw =null;
		
		try {
			fw = new FileWriter(caminho, true);
			bw = new BufferedWriter(fw);
			
			bw.append("Senai Jandira");
			bw.append("Joao");
			bw.append("XPTO\n");
			bw.append("Senai Jandira\n");
			bw.append("Programacao de computadores\n");
			
			bw.flush();
			
		} catch (Exception e) {
			 }
	}

	private static void lerArquivo() {
		
		FileReader fr = null;
		BufferedReader br = null;
		
		try {
		fr = new FileReader(caminho);
		br = new BufferedReader (fr);
		
		String retorno = br.readLine();
		
		while (retorno != null) {
			System.out.println(retorno);
			retorno = br.readLine();
		}
		
		
	} catch (FileNotFoundException erro) {
		System.out.println("O arquivo nao foi encontrado!");
	} catch (Exception erro) {
		System.out.println("Ocorreu um erro!");
	}
		
		System.out.println("fim");
	}
	
}
