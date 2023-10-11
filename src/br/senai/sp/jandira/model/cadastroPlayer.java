package br.senai.sp.jandira.model;

import java.util.Scanner;

public class cadastroPlayer {

    Scanner scanner = new Scanner(System.in);

    String nome,senha;


    public void cadastrarPlayer(){

        System.out.println("Nome de usuario: ");
        nome = scanner.nextLine();
        scanner.nextLine();
        System.out.println("Digite uma senha: ");
        senha = scanner.nextLine();

    }
}
