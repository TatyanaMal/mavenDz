package telv;

import java.util.Arrays;
import java.util.Scanner;


public class TVApp {
    public static void main(String[] args) {
        //Передачи
        //первый
        Program prog1 = new Program("Новости");
        Program prog2 = new Program("Модный приговор");
        Program prog3 = new Program("Жить здорово!");
        Program prog4 = new Program("Информационный канал");
        Program prog5 = new Program("АнтиФейк");
        Program prog6 = new Program("Давай поженимся!");
        Program prog7 = new Program("Мужское/Женское");
        //нтв
        Program prog8 = new Program("Сегодня");
        Program prog9 = new Program("Пес");
        Program prog10 = new Program("Пес-2");
        Program prog11 = new Program("Черезвычайное происществие");
        Program prog12 = new Program("Место встречи");
        Program prog13 = new Program("За гранью");
        Program prog14 = new Program("ДНК");
        //стс
        Program prog15 = new Program("Ералаш");
        Program prog16 = new Program("Ивановы-Ивановы");
        Program prog17 = new Program("Реальная белка");
        Program prog18 = new Program("Реальная белка-2");
        Program prog19 = new Program("Статус:Обновлен");
        Program prog20 = new Program("Костя-Вера");
        Program prog21 = new Program("Красотка на всю голову");
        //тв3
        Program prog22 = new Program("Гадалка");
        Program prog23 = new Program("Слепая");
        Program prog24 = new Program("Лиса");
        Program prog25 = new Program("Новости");
        Program prog26 = new Program("Глухарь");
        Program prog27 = new Program("Бим-2");
        Program prog28 = new Program("Мистические истории");
        //тнт
        Program prog29 = new Program("Утро ТНТ");
        Program prog30 = new Program("Однажды в России");
        Program prog31 = new Program("Игры без границ");
        Program prog32 = new Program("СашаТаня");
        Program prog33 = new Program("Исправление и наказание");
        Program prog34 = new Program("Телохранители");
        Program prog35 = new Program("Свободные отношения");
        //пятница
        Program prog36 = new Program("Кондитер.Дети");
        Program prog37 = new Program("Четыре дачи");
        Program prog38 = new Program("Четыре свадьбы");
        Program prog39 = new Program("Битва шефов");
        Program prog40 = new Program("Свадьба в слепую");
        Program prog41 = new Program("Вчера, сегодна, завтра");
        Program prog42 = new Program("Пятница News");
        //ю
        Program prog43 = new Program("Маша и медведь");
        Program prog44 = new Program("Запредный плод");
        Program prog45 = new Program("Моя свекровь-монстр");
        Program prog46 = new Program("Беременна в 45");
        Program prog47 = new Program("Няня особого назначения");
        Program prog48 = new Program("Дом-2.Новая жизнь");
        Program prog49 = new Program("Измены");
        //Каналы
        Channel ch1 = new Channel("Первый", Arrays.asList(prog1,prog2,prog3,prog4,prog5,prog6,prog7));
        Channel ch2 = new Channel("НТВ", Arrays.asList(prog8,prog9,prog10,prog11,prog12,prog13,prog14));
        Channel ch3 = new Channel("СТС", Arrays.asList(prog15,prog16,prog17,prog18,prog19,prog20,prog21));
        Channel ch4 = new Channel("ТВ3", Arrays.asList(prog22,prog23,prog24,prog25,prog26,prog27,prog28));
        Channel ch5 = new Channel("ТНТ", Arrays.asList(prog29,prog30,prog31,prog32,prog33,prog34,prog35));
        Channel ch6 = new Channel("Пятница", Arrays.asList(prog36,prog37,prog38,prog39,prog40,prog41,prog42));
        Channel ch7 = new Channel("Ю", Arrays.asList(prog43,prog44,prog45,prog46,prog47,prog48,prog49));

        TVHD tv = new TVHD(Arrays.asList(ch1,ch2,ch3,ch4,ch5,ch6,ch7));
        //Channel cha = new Channel(Arrays.asList(prog1,prog2,prog3,prog4,prog5,prog6,prog7,prog8,prog9,prog10,prog11,prog12,prog13,prog14,prog15,prog16,prog17,prog18,prog19,prog20,prog21,prog22,prog23,prog24,prog25,prog26,prog27,prog28,prog29,prog30,prog31,prog32,prog33,prog34,prog35,prog36,prog37,prog38,prog39,prog40,prog41,prog42,prog43,prog44,prog45,prog46,prog47,prog48,prog49));

        RemoteController remote = new RemoteController(tv);

        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running){
            System.out.println("Телевизор включен");
            System.out.println("*приятная музыка*");
            System.out.println("Вас приветствует Hyundai");
            System.out.println("***");
            System.out.println("Текущий канал: " + tv.getCurrentChannel().getName());
            System.out.println("Текущая передача: " + tv.getCurrentChannel().getCurrentProgram().getNameProgram());
            System.out.println("***");
            System.out.println("Выберите действие: ");
            System.out.println("1 - выбрать номер канала");
            System.out.println("2 - следующий канал");
            System.out.println("3 - предыдущий канал");
            System.out.println("4 - следующая передача");
            System.out.println("5 - предыдущая передача");
            System.out.println("0 - выключить телевизор");

            int choice = scanner.nextInt();
            scanner.nextLine();

             switch (choice){
                 case 1:
                     System.out.println("Введите номер канала: ");
                     int channelNumber = scanner.nextInt();
                     remote.setChannel(channelNumber);
                     break;
                 case 2:
                     remote.nextChannel();
                     break;
                 case 3:
                     remote.previousChannel();
                     break;
                 case 4:
                     remote.nextProgram();
                     break;
                 case 5:
                     remote.previousProgram();
                     break;
                 case 0:
                     System.out.println("Телевизор выключен");
                     running = false;
                     break;
                 default:
                     System.out.println("Неверный выбор, введите: 1, 2, 3, 4, 0");
             }
        }
        scanner.close();
    }
}
