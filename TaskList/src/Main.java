import java.util.ArrayList;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Tasks tasks1 = new Tasks();
        ArrayList<String> tasks = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println(""" 
                    
                    Выберите операцию:
                    
                    0. Выход из программы
                    1. Добавить дело
                    2. Показать дела
                    3. Удалить дело по номеру
                    4. Удалить дело по названию
                    5. Удалить по ключевому слову
                    """);

            switch (Integer.parseInt(scanner.nextLine())) {
                case 1 -> tasks1.AddTask(scanner, tasks);
                case 2 -> tasks1.printTasks(tasks);
                case 3 -> tasks1.deleteTaskIndex(scanner,tasks);
                case 4 -> tasks1.deleteTaskName(scanner,tasks);
                case 5->  tasks1.deleteWord(scanner, tasks);
                case 0 -> {
                    System.out.println(" Конец программы");
                    return;

                }
            }

        }

    }
}


