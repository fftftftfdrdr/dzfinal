// // Напишите функцию removeEvenNumbers,
//  которая принимала бы  произвольный список целых чисел, 
// удаляла бы из него четные числа и выводила список без четных чисел.

// // Напишите свой код в методе removeEvenNumbers класса Answer. 
// Метод removeEvenNumbers принимает на вход один параметр:

// // Integer[] arr - список целых число
package lesson3;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

class dz2 {
    public static List<Integer> removeEvenNumbers(Integer[] arr) {
      // Введите свое решение ниже
        List<Integer> result = new ArrayList<>();
        
        for (Integer num : arr) {
            if (num % 2 != 0) {
                result.add(num);
            }
        }
        System.out.println(result);
        return result;
    }


// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки

    public static void main(String[] args) { 
      Integer[] arr = {};
      
      if (args.length == 0) {
        // При отправке кода на Выполнение, вы можете варьировать эти параметры
        arr = new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
      }
      else{
        arr = Arrays.stream(args[0].split(", "))
                        .map(Integer::parseInt)
                        .toArray(Integer[]::new);
      }     
      
      dz2 ans = new dz2();      
      ans.removeEvenNumbers(arr);
    }
}