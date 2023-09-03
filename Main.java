package Pilha;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int tamanhoDaPilha = 3; // Defina o tamanho da pilha aqui
        Pilha minhaPilha = new Pilha(tamanhoDaPilha);

        Scanner scanner = new Scanner(System.in);

        try {
            // Solicita ao usuário para inserir elementos na pilha
            for (int i = 1; i <= tamanhoDaPilha; i++) {
                System.out.print("Digite o elemento " + i + ": ");
                String elemento = scanner.nextLine();
                minhaPilha.push(elemento);
            }

            // Verifica se a pilha está cheia
            if (minhaPilha.isFull()) {
                System.out.println("A pilha está cheia.");
            } else {
                System.out.println("Têm algo na pilha.");
            }

            // Remove um elemento da pilha
            Object elementoRemovido = minhaPilha.pop();
            System.out.println("Elemento removido: " + elementoRemovido);

            // Verifica se a pilha está vazia
            if (minhaPilha.isEmpty()) {
                System.out.println("A pilha está vazia.");
            } else {
                System.out.println("Têm algo na pilha.");
            }
        } catch (PilhaCheiaException e) {
            System.out.println("Erro: " + e.getMessage());
        } catch (PilhaVaziaException e) {
            System.out.println("Erro: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}