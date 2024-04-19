package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Cemetery {
    public static void JionOrNot() {
        System.out.println("Хотите войти на кладбище? \n1. Да\n2. Нет");
        Scanner scanner = new Scanner(System.in);
        String answer = scanner.nextLine();
        switch (answer) {
            case "1":
                System.out.println("Добро пожаловать на кладбище братишка!");
                Cemetery cemetery = new Cemetery();
                cemetery.Actoins();
                break;
            case "2":
                break;
        }
    }
    public void Flours() {
        ArrayList<String> flour = new ArrayList<>();
        flour.add(0, "1. Ромашки - 78 рублей");
        flour.add(1, "2. Подсолнух - 150 рублей");
        flour.add(2, "3. Гипсофилы - 700 рублей");
        System.out.println(flour);
        Scanner scanner = new Scanner(System.in);
        String answer = scanner.nextLine();
        switch (answer) {
            case "1":
                System.out.println("Ромашки поставили, будьте спокойны");
                break;
            case "2":
                System.out.println("Подсолнух поставили, будьте спокойны");
                break;
            case "3":
                System.out.println("Гипсофилы поставили, будьте спокойны");
                break;
        }
    }
    public static void Placesss() {
        int[][] Place = new int [3][3];
        Place[0][0] = 1;
        Place[0][1] = 2;
        Place[0][2] = 3;
        Place[1][0] = 4;
        Place[1][1] = 5;
        Place[1][2] = 6;
        Place[2][0] = 7;
        Place[2][1] = 8;
        Place[2][2] = 9;
        for (int i = 0; i < Place.length; i++) {
            System.out.println(Arrays.toString(Place[i]));
        }
    }
    public void Places() {
        System.out.println("Выберите место для уборки могилы: ");
        int[][] Place = new int [3][3];
        Place[0][0] = 1;
        Place[0][1] = 2;
        Place[0][2] = 3;
        Place[1][0] = 4;
        Place[1][1] = 5;
        Place[1][2] = 6;
        Place[2][0] = 7;
        Place[2][1] = 8;
        Place[2][2] = 9;
        for (int i = 0; i < Place.length; i++) {
            System.out.println(Arrays.toString(Place[i]));
        }
        Scanner scanner = new Scanner(System.in);
        String answer = scanner.nextLine();
        switch (answer) {
            case "1":
                System.out.println("Могила номер 1 убрана");
                break;
            case "2":
                System.out.println("Могила номер 2 убрана");
                break;
            case "3":
                System.out.println("Могила номер 3 убрана");
                break;
            case "4":
                System.out.println("Могила номер 4 убрана");
                break;
            case "5":
                System.out.println("Могила номер 5 убрана");
                break;
            case "6":
                System.out.println("Могила номер 6 убрана");
                break;
            case "7":
                System.out.println("Могила номер 7 убрана");
                break;
            case "8":
                System.out.println("Могила номер 8 убрана");
                break;
            case "9":
                System.out.println("Могила номер 9 убрана");
                break;
        }
    }

    public static void Vskritie () {
        System.out.print("Введите имя человека, которого вы хотите вскрыть: ");
        Scanner scanner = new Scanner(System.in);
        String answer = scanner.next();
        ArrayList<String> Vskrit = new ArrayList<>();
        Vskrit.add(answer + " Вскрыт успешно");
    }

    public static void Krem () {
        System.out.print("Введите имя человека, которого вы хотите кремировать: ");
        Scanner scanner = new Scanner(System.in);
        String answer = scanner.next();
        ArrayList<String> kremc = new ArrayList<>();
        kremc.add(answer + " Кремирован успешно");
    }
    public static void Fire () {
        System.out.print("Введите имя ведьмы, которую вы хотите сжечь: ");
        Scanner scanner = new Scanner(System.in);
        String answer = scanner.next();
        ArrayList<String> Firee = new ArrayList<>();
        Firee.add(answer + " Ведьма сожжена успешно, все будет хорошо");
    }

    public static void Horon () {
        System.out.print("Введите место для захоронения \n");
        int[][] Place = new int [3][3];
        Place[0][0] = 1;
        Place[0][1] = 2;
        Place[0][2] = 3;
        Place[1][0] = 4;
        Place[1][1] = 5;
        Place[1][2] = 6;
        Place[2][0] = 7;
        Place[2][1] = 8;
        Place[2][2] = 9;
        for (int i = 0; i < Place.length; i++) {
            System.out.println(Arrays.toString(Place[i]));
        }
        Scanner scanner = new Scanner(System.in);
        String answer = scanner.nextLine();
        switch (answer) {
            case "1":
                Place[0][0] = 0;
                break;
            case "2":
                Place[0][1] = 0;
                break;
            case "3":
                Place[0][2] = 0;
                break;
            case "4":
                Place[1][0] = 0;
                break;
            case "5":
                Place[1][1] = 0;
                break;
            case "6":
                Place[1][2] = 0;
                break;
            case "7":
                Place[2][0] = 0;
                break;
            case "8":
                Place[2][1] = 0;
                break;
            case "9":
                Place[2][2] = 0;
                break;

        }
        System.out.print("Вы заняли место, посмотрите: \n");
        for (int i = 0; i < Place.length; i++) {
            System.out.println(Arrays.toString(Place[i]));
        }
    }
    public static void Exit () {
        System.out.println("Вы успешно вышли из кладбища");
    }
    public void Actoins() {
        Cemetery cemetery = new Cemetery();
        ArrayList<String> empoyees = new ArrayList<>();
        empoyees.add("Михаил Евгеньевич Нокинов - 28 лет");
        empoyees.add("Эдуард Андреевич Климов - 67 лет");
            System.out.println("Что вы хотите увидеть? \n1. Список работников \n2. Платные услуги\n3. Выйти из кладбища");
            Scanner scanner = new Scanner(System.in);
            String answer = scanner.nextLine();
            switch (answer) {
                case "1":
                    System.out.println(empoyees);
                    break;
                case "2":
                    System.out.println("Вот все услуги, выбирай:\n1. Поставить цветы.\n2. Убраться на могиле\n3. Вывод мест" +
                            "\n4. Вскрытие\n5. Кремировать\n6. Сожжение(ведьму желательно, но можно кого угодно\n7. Захоронение");
                    String vibor = scanner.nextLine();
                    switch (vibor) {
                        case "1":
                            cemetery.Flours();
                            break;
                        case "2":
                            cemetery.Places();
                            break;
                        case "3":
                            Placesss();
                            break;
                        case "4":
                            Vskritie();
                            break;
                        case "5":
                            Krem();
                            break;
                        case "6":
                            Fire();
                            break;
                        case "7":
                            Horon();
                            break;
                    }
                    break;
                case "3":
                    Exit();
                    break;
            }
    }
    public static void main (String[]args){
        JionOrNot();
    }
}
