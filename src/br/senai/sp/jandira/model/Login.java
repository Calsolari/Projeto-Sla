package br.senai.sp.jandira.model;

import java.util.Scanner;
public class Login {
    public void Login(){
            Scanner scanner = new Scanner(System.in);

            cadastroPlayer cadastroPlayer = new cadastroPlayer();

            cadastroPlayer.cadastrarPlayer();

            System.out.println("Por favor, faça o login para continuar.");
            System.out.print("Nome de usuário: ");
            String username = scanner.nextLine();
            System.out.print("Senha: ");
            String password = scanner.nextLine();

            if (username.equals(cadastroPlayer.nome) && password.equals(cadastroPlayer.senha)) {
                System.out.println("Login bem-sucedido! Bem-vindo, " + cadastroPlayer.nome);
            } else {
                System.out.println("Login falhou. Nome de usuário ou senha incorretos.");
            }

            scanner.close();
        }
    }


