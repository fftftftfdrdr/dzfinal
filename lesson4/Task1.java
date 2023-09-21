package lesson4;

import java.util.LinkedList;

class Task1 {
    public static LinkedList<Object> revert(LinkedList<Object> ll) {

        LinkedList<Object> result = new LinkedList<>();
        for (Object a : ll) {
            result.add(0,a);
        }
        return result;
    }
        // Напишите свое решение ниже




// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки 
    public static void main(String[] args) { 
        LinkedList<Object> ll = new LinkedList<>();

        if (args.length == 0 || args.length != 4) {
        // При отправке кода на Выполнение, вы можете варьировать эти параметры
            ll.add(1);
            ll.add("One");
            ll.add(2);
            ll.add("Two");
        } else {
            ll.add(Integer.parseInt(args[0]));
            ll.add(args[1]);
            ll.add(Integer.parseInt(args[2]));
            ll.add(args[3]);
        }

        Task1 answer = new Task1();
        System.out.println(ll);
        LinkedList<Object> reversedList = answer.revert(ll);
        System.out.println(reversedList);
    }
    
}
