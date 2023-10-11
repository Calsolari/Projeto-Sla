package br.senai.sp.jandira.model;

import java.util.Scanner;
public class Menu {



    public void Menu() {

            Scanner scanner = new Scanner(System.in);
            cadastroPlayer cadastroPlayer = new cadastroPlayer();
            Login login = new Login();

            while (true) {
                System.out.println("==========================================");
                System.out.println("Bem-vindo ao Sistema de Login e Cadastro!");
                System.out.println("==========================================");
                System.out.println("1. Cadastro de Jogador");
                System.out.println("2. Login");
                System.out.println("3. Sair");
                System.out.println("==========================================");
                System.out.print("Escolha uma opção: ");

                int escolha = scanner.nextInt();
                scanner.nextLine();

                switch (escolha) {
                    case 1:
                        cadastroPlayer.cadastrarPlayer();
                        break;
                    case 2:
                        login.Login();
                        break;
                }
            }
        }
    }

}
