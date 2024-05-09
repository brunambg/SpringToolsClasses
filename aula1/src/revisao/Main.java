package revisao;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Cliente> clientes = new ArrayList<>();

        do {
            System.out.println("Digite o ID do cliente (negativo para sair): ");
            int id = scanner.nextInt();
            if (id < 0) {
                break;
            }
            scanner.nextLine(); 
            System.out.println("Digite o nome do cliente: ");
            String nome = scanner.nextLine();
            System.out.println("Digite a idade do cliente: ");
            int idade = scanner.nextInt();
            scanner.nextLine(); 
            System.out.println("Digite o telefone do cliente: ");
            String telefone = scanner.nextLine();

            clientes.add(new Cliente(id, nome, idade, telefone));
        } while (true);


        System.out.println("\nDados dos clientes:");
        for (Cliente cliente : clientes) {
            System.out.println("ID: " + cliente.getId());
            System.out.println("Nome: " + cliente.getNome());
            System.out.println("Idade: " + cliente.getIdade());
            System.out.println("Telefone: " + cliente.getTelefone());
            System.out.println();
        }
    }
}