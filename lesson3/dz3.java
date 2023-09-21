// Напишите функцию analyzeNumbers, 
// которая принимает на вход целочисленный список arr и:

// Сортирует его по возрастанию и выводит на экран

// Находит минимальное значение в списке и выводит на экран - Minimum is {число}

// Находит максимальное значение в списке и выводит на экран - Maximum is {число}

// Находит среднее арифметическое значений списка 
// и выводит на экран - Average is =  {число}

// Напишите свой код в методе analyzeNumbers класса Answer. 
// Метод analyzeNumbers принимает на вход один параметр:

// Integer[] arr - список целых чисел

package lesson3;

import java.util.Arrays;
import java.util.Collections;
import java.util.ArrayList;
import java.util.List;

class dz3 {
    public static List<Integer> analyzeNumbers(Integer[] arr) {
      // Введите свое решение ниже
      // Сортирует его по возрастанию и выводит на экран
        int count = 0;
        List<Integer> sortedArr = new ArrayList<>();
        for (Integer num : arr) {
            sortedArr.add(num);
        }
        Collections.sort(sortedArr);
        System.out.println(sortedArr);
      // Находит минимальное значение в списке и выводит на экран - Minimum is {число}
        System.out.format("Minimum is %d",Collections.min(sortedArr) );
      // Находит максимальное значение в списке и выводит на экран - Maximum is {число}
        System.out.format("\nMaximum is %d",Collections.max(sortedArr) );
      // Находит среднее арифметическое значений списка 
      // и выводит на экран - Average is =  {число}  
        List<Integer> avgArr = new ArrayList<>();
        for (Integer number : arr) {
            avgArr.add(number);
        }
        for (Integer avg : avgArr) {
            count = count + avg;
        }
        count = count / avgArr.size();
        System.out.format("\nAverage is %d",count );
        return sortedArr;
    }


// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки

    public static void main(String[] args) { 
      Integer[] arr = {};
      
      if (args.length == 0) {
        // При отправке кода на Выполнение, вы можете варьировать эти параметры
        arr = new Integer[]{4, 2, 7, 5, 1, 3, 8, 6, 9};
      }
      else{
        arr = Arrays.stream(args[0].split(", "))
                        .map(Integer::parseInt)
                        .toArray(Integer[]::new);
      }     
      
      dz3 ans = new dz3();      
      ans.analyzeNumbers(arr);
    }
}