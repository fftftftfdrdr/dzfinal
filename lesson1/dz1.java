

// public class dz1 {
//     public int countNTriangle(int n){
//       // Введите свое решение ниже
//       int value = 0;
//       int count = 1;
//       while (value != n) {
//       value = value + count;
//       count++;
//       }
//     return value;  
//     }
// }

// // Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
// public class Printer{ 
//     public static void main(String[] args) { 
//       int n = 0;
      
//       if (args.length == 0) {
//         // При отправке кода на Выполнение, вы можете варьировать эти параметры
//         n = 4;
//       }
//       else{
//         n = Integer.parseInt(args[0]);
//       }     
      
//         // Вывод результата на экран
//       Answer ans = new Answer(); 
//       int itresume_res = ans.countNTriangle(n);     
//       System.out.println(itresume_res);
//     }
// }


// class dz1 {
//     public void printPrimeNums(){
//         // Напишите свое решение ниже
//         for (int i = 1; i <= 1000; i++) {
//             if (i < 1 && i % i == 0 && i % 1 == 0){
//                 System.out.printf("\n" + i);
//             }   
//     }
// }

// // Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
// public class Printer{ 
//     public static void main(String[] args) { 
      
//       Answer ans = new Answer();      
//       ans.printPrimeNums();
//     }
// }