package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String line;

        ArrayList<String> listA = new ArrayList<>();

        System.out.println("Enter 1a - line: ");
        line = scanner.nextLine();
        listA.add(line);

        System.out.println("Enter 2a - line: ");
        line = scanner.nextLine();
        listA.add(line);

        System.out.println("Enter 3a - line: ");
        line = scanner.nextLine();
        listA.add(line);

        System.out.println("Enter 4a - line: ");
        line = scanner.nextLine();
        listA.add(line);

        System.out.println("Enter 5a - line: ");
        line = scanner.nextLine();
        listA.add(line);

        System.out.println("___________________");
        System.out.println("Список А: ");

        Iterator<String> iteratorA = listA.iterator();
        while (iteratorA.hasNext()) {
            System.out.println(iteratorA.next());
        }
        System.out.println("___________________");

        ArrayList<String> listB = new ArrayList<>();

        System.out.println("Enter 1b - line: ");
        line = scanner.nextLine();
        listB.add(line);

        System.out.println("Enter 2b - line: ");
        line = scanner.nextLine();
        listB.add(line);

        System.out.println("Enter 3b - line: ");
        line = scanner.nextLine();
        listB.add(line);

        System.out.println("Enter 4b - line: ");
        line = scanner.nextLine();
        listB.add(line);

        System.out.println("Enter 5b - line: ");
        line = scanner.nextLine();
        listB.add(line);

        System.out.println("___________________");
        System.out.println("Список Б: ");

        Iterator<String> iteratorB = listB.iterator();
        while (iteratorB.hasNext()) {
            System.out.println(iteratorB.next());
        }
        scanner.close();
        System.out.println("___________________");
        System.out.println("Список С в указанном порядке: ");

        ArrayList<String> listC = new ArrayList<String>();
        Collections.reverse(listB);
        listC.addAll(listA);
        listC.addAll(listB);

        for (int i = 0; i < listA.size(); i++) {
            System.out.println(listA.get(i));
            System.out.println(listB.get(i));
        }

        System.out.println("___________________");
        System.out.println("Список С по длине: " );

        listC.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.length() - o2.length();
            }
        });

        Iterator<String> iteratorC = listC.iterator();
        while (iteratorC.hasNext()) {
            System.out.println(iteratorC.next());
        }
    }
}
