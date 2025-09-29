import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TaskManager manager = new TaskManager();

        while (true) {
            System.out.println("\n==== TO-DO LIST ====");
            System.out.println("1. Adicionar tarefa");
            System.out.println("2. Listar tarefas");
            System.out.println("3. Marcar tarefa como concluída");
            System.out.println("4. Remover tarefa");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");

            int choice;
            try {
                choice = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida! Digite um número.");
                continue;
            }

            switch (choice) {
                case 1:
                    System.out.print("Digite a descrição da tarefa: ");
                    String desc = scanner.nextLine();
                    manager.addTask(desc);
                    break;

                case 2:
                    manager.listTasks();
                    break;

                case 3:
                    System.out.print("Digite o número da tarefa para concluir: ");
                    int completeIndex = Integer.parseInt(scanner.nextLine()) - 1;
                    manager.completeTask(completeIndex);
                    break;

                case 4:
                    System.out.print("Digite o número da tarefa para remover: ");
                    int removeIndex = Integer.parseInt(scanner.nextLine()) - 1;
                    manager.removeTask(removeIndex);
                    break;

                case 5:
                    System.out.println("Saindo... Até mais!");
                    return;

                default:
                    System.out.println("Opção inválida, tente novamente.");
            }
        }
    }
}
