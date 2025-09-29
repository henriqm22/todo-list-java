import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class TaskManager {
    private List<Task> tasks = new ArrayList<>();
    private static final String FILE_NAME = "tasks.txt";

    public TaskManager() {
        loadTasksFromFile(); // Carrega ao iniciar
    }

    public void addTask(String description) {
        tasks.add(new Task(description));
        saveTasksToFile();
    }

    public void listTasks() {
        if (tasks.isEmpty()) {
            System.out.println("Nenhuma tarefa adicionada ainda.");
        } else {
            for (int i = 0; i < tasks.size(); i++) {
                System.out.println((i + 1) + ". " + tasks.get(i));
            }
        }
    }

    public void completeTask(int index) {
        if (index >= 0 && index < tasks.size()) {
            tasks.get(index).markAsCompleted();
            System.out.println("Tarefa marcada como concluída!");
            saveTasksToFile();
        } else {
            System.out.println("Índice inválido!");
        }
    }

    public void removeTask(int index) {
        if (index >= 0 && index < tasks.size()) {
            tasks.remove(index);
            System.out.println("Tarefa removida com sucesso!");
            saveTasksToFile();
        } else {
            System.out.println("Índice inválido!");
        }
    }

    private void saveTasksToFile() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_NAME))) {
            for (Task task : tasks) {
                writer.write(task.getDescription() + ";" + task.isCompleted());
                writer.newLine();
            }
        } catch (IOException e) {
            System.out.println("Erro ao salvar as tarefas: " + e.getMessage());
        }
    }

    private void loadTasksFromFile() {
        File file = new File(FILE_NAME);
        if (!file.exists()) {
            return; // não tem nada ainda
        }

        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_NAME))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(";");
                if (parts.length == 2) {
                    String description = parts[0];
                    boolean completed = Boolean.parseBoolean(parts[1]);
                    tasks.add(new Task(description, completed));
                }
            }
        } catch (IOException e) {
            System.out.println("Erro ao carregar as tarefas: " + e.getMessage());
        }
    }
}
