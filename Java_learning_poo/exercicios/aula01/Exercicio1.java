package aula01;

import java.util.Scanner;

public class Exercicio1 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        boolean repeticao = true;
        int conta = 0;

        // captura a senha do usuario pela 1° vez
        System.out.print("Digite seu usuario: ");
        String nome = entrada.nextLine();

        // laço que repete o codigo de checagem enquanto for true o erro do usuario
        while (repeticao) {
            // captura a senha do usuario
            System.out.print("Digite sua senha: ");
            int senha = Integer.parseInt(entrada.nextLine());

            // verifica a senha e o nome
            if (nome.equalsIgnoreCase("administrador") && senha == 123) {
                System.out.println("Logado");
                System.out.println("Voce tentou entrar: " + conta);
                repeticao = false;
            } else {
                System.out.println("Usuario ou senha inválidos");
                conta++;
            }

            // Verifica se o número de tentativas ultrapassou 3
            if (conta > 3) {
                System.out.println("Você digitou a senha de forma incorreta mais de 3 vezes");
                break;
            }
        }

        entrada.close(); // Fecha o scanner
    }
}

