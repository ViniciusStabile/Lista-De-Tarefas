package Programa;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class programa {

	public static void main(String[] args) {
		List<String> listaDeTarefas = new ArrayList<>();
		List<String> listaConcluida = new ArrayList<>();

		Scanner sc = new Scanner(System.in);

		System.out.println("Bem-vindo ao Gerenciador de Tarefas!");
		while (true) {

			System.out.println("[1]Adicionar uma nova tarefa");
			System.out.println("[2]Marcar uma tarefa como concluída");
			System.out.println("[3]Editar uma tarefa existente");
			System.out.println("[4]Remover uma tarefa");
			System.out.println("[5]Exibir lista de tarefas");
			System.out.println("[6]Exibir lista de tarefas concluidas");
			System.out.println("[7]Sair");

			int opcao = sc.nextInt();
			sc.nextLine();

			if (opcao == 1) {
				adicionarTarefa(listaDeTarefas, sc);
			}

			else if (opcao == 2) {
				adicionarConcluida(listaDeTarefas, listaConcluida, sc);

			}

			else if (opcao == 3) {
				editar(listaDeTarefas, sc);
			}

			else if (opcao == 4) {
				remover(listaDeTarefas, sc);

			}

			else if (opcao == 5) {
				listaTarefa(listaDeTarefas);
			}

			else if (opcao == 6) {
				listaTarefaConcluidas(listaConcluida);
			}

			else if (opcao == 7) {
				System.exit(0);
				;
			}

			else {
				System.out.println("Opção inválida. Tente novamente.");
				System.out.println();
				;
			}

		}

	}

	// funcao para adicionar tarefas para fazer
	public static void adicionarTarefa(List<String> listaDeTarefas, Scanner sc) {
		System.out.println("Digite uma nova tarefa: ");
		String novaTarefa = sc.nextLine();
		listaDeTarefas.add(novaTarefa);
		System.out.println("Tarefa adicionada com sucesso.");
	}

	// funcao para adicionar elementos a lista de tarefas concluidas
	public static void adicionarConcluida(List<String> listaDeTarefas, List<String> listaConcluida, Scanner sc) {
		System.out.println("Digite o número da tarefa que deseja marcar como concluída: ");
		int tarefaConcluida = sc.nextInt();
		sc.nextLine();
		String elemento = listaDeTarefas.get(tarefaConcluida - 1);
		listaConcluida.add(elemento);
		listaDeTarefas.remove(tarefaConcluida - 1);
	}

	// funcao para editar um elemento da lista
	public static void editar(List<String> listaDeTarefas, Scanner sc) {
		System.out.println("Digite o número da tarefa que deseja editar: ");
		int tarefaEditar = sc.nextInt();
		sc.nextLine();
		System.out.println("Digite a nova descrição da tarefa: ");
		String novaDescricao = sc.nextLine();
		listaDeTarefas.set(tarefaEditar - 1, novaDescricao);
		;

	}

	// funcao para remover um elemento da lista
	public static void remover(List<String> listaDeTarefas, Scanner sc) {
		System.out.println("Digite o número da tarefa que deseja remover: ");
		int tarefaRemover = sc.nextInt();
		sc.nextLine();
		listaDeTarefas.remove(tarefaRemover - 1);
	}

	// Funçao para exibir a lista de tarefas a serem feitas
	public static void listaTarefa(List<String> listaDeTarefas) {
		System.out.println("Lista de tarefas:");
		for (int i = 0; i < listaDeTarefas.size(); i++) {
			System.out.println((i + 1) + "# " + listaDeTarefas.get(i));
		}

	}

	// Funçao para exibir a lista de tarefas concluidas
	public static void listaTarefaConcluidas(List<String> listaConcluida) {
		System.out.println("Lista de tarefas concluidas:");
		for (int i = 0; i < listaConcluida.size(); i++) {
			System.out.println((i + 1) + "# " + listaConcluida.get(i));
		}

	}

}
