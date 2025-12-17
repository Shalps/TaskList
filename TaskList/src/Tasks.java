import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Tasks {


    public void AddTask(Scanner scanner, ArrayList<String> tasks) {
        System.out.print("Введите название дела:");

        String s = scanner.nextLine();
        if (!tasks.contains(s)) {
            tasks.add(s);
            System.out.println("Добавлено!");
        }
        printTasks(tasks);
    }

    public void printTasks(ArrayList<String> tasks) {
        System.out.println("Ваш список дел:");
        for (int i = 0; i < tasks.size(); i++) {
            System.out.println(i + 1 + "." + tasks.get(i));
        }
        if (tasks.isEmpty()) {
            System.out.println("Ваш список пуст");
        }

    }

    public void deleteTaskIndex(Scanner scanner, ArrayList<String> tasks) {
        System.out.println("Введите номер задачи которую хотите удалить");
        int number = Integer.parseInt(scanner.nextLine());
        int index = number - 1;
        if (index >= 0 && index < tasks.size()) {
            tasks.remove(index);
            System.out.println("дело удалено");
        } else System.out.println("Неверный номер дела");
        printTasks(tasks);
    }

    public void deleteTaskName(Scanner scanner, ArrayList<String> tasks) {
        System.out.println("Введите название дела, которое хотите удалить");
        String s = scanner.nextLine();
        Iterator<String> iterator = tasks.iterator();
        boolean isFlag = false;
        while (iterator.hasNext()) {
            String next = iterator.next();
            if (next.equalsIgnoreCase(s)) {
                iterator.remove();
                System.out.println("Дело удалено");
                isFlag=true;
            }
        }
        if (!isFlag){
            System.out.println("Дело <"+s+"> не найдено");

        }
        printTasks(tasks);
    }

    public void deleteWord(Scanner scanner, ArrayList<String> tasks) {
        System.out.println(" Введите слово для поиска и удаления всех дел содержащих данное слово");
        String s = scanner.nextLine();
        Iterator<String> iterator = tasks.iterator();
        boolean isFlag = false;
        while (iterator.hasNext()) {
            if (iterator.next().contains(s)) {
                iterator.remove();
                isFlag = true;
            }
        }
        if (!isFlag) {
            System.out.println("Ничего не наййдено");
        }
        printTasks(tasks);

    }
}



