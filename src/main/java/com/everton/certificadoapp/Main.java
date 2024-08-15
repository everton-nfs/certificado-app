package main.java.com.everton.certificadoapp;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        // Criando um cliente
        User cliente = new User("123.456.789-00", "João Silva", "joao@email.com", null);

        // Criando um processo de registro
        Process processo = new Process("2024-001", cliente.getNome(), cliente.getCpf(), "Trabalho de Conclusão", new Date());

        // Simulando a análise do processo por um profissional
        processo.setDataAnalise(new Date());
        processo.setMatriculaAnalista("PROF001");
        processo.setStatus("deferido");

        // Exibindo as informações do processo
        System.out.println("Protocolo: " + processo.getProtocolo());
        System.out.println("Autor: " + processo.getAutorNome());
        System.out.println("Título: " + processo.getTituloTrabalho());
        System.out.println("Status: " + processo.getStatus());
    }
}