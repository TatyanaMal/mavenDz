package LibraryWork;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.ApplicationContext;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Service service = (Service) context.getBean("Service");

        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        System.out.println("Приветствую Вас в библиотеке!");
        while (running){
            System.out.println("Выберите действие: ");
            System.out.println("1. Добавить книгу");
            System.out.println("2. Изменить книгу");
            System.out.println("3. Удалить книгу");
            System.out.println("4. Посмотреть все книги, хранящиеся в библиотеке");
            System.out.println("5. Выйти");
            System.out.println("Ваш ответ: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice){
                case 1: //обавление
                    System.out.println("Напишите название книги: ");
                    String addTitle = scanner.nextLine();
                    System.out.println("Напишите автора: ");
                    String addAuthor = scanner.nextLine();
                    service.addBook(addTitle,addAuthor);
                    break;
                case 2: //изменение
                    System.out.println("Напишите старое название книги: ");
                    String oldTitle = scanner.nextLine();
                    System.out.println("Напишите новое название книги: ");
                    String newTitle = scanner.nextLine();
                    System.out.println("Напишите нового автора: ");
                    String newAuthor = scanner.nextLine();
                    service.editsABook(oldTitle,newTitle,newAuthor);
                    break;
                case 3: //удаление
                    System.out.println("Напишите название книги, которую хотите удалить: ");
                    String deleteTitle = scanner.nextLine();
                    service.deleteBook(deleteTitle);
                    break;
                case 4: //просмотр
                    service.bookIN();
                    break;
                case 5:
                    running = false;
                    System.out.println("Завершено");
                    break;
                default:
                    System.out.println("Ошибка");
            }
        }
        ((ClassPathXmlApplicationContext) context).close();
    }
}
