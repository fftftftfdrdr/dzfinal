// package lesson1;

// public class conspect1 {
//     public static void main(String[]){
//                 // Напишите свое решение ниже
//         int i = 1;
//         while (i <= 1000) {        
//             if (i < 1 && i % i == 0 && i % 1 == 0){
//                 System.out.printf("\n" + i);
//                 i++;
//             }  
//             else{
//                 i++;
//             } 
//         }
//     }
// }
// class Answer {
//     public void printPrimeNums(){
//         // Напишите свое решение ниже
// //         int st = 1;
// //         System.out.printf("\n" + st);
//             for (int i=1;i<1000;i++){
//         if (i == 1)
//         ;
//         else if(checkSimple(i))
//             System.out.println(i);
//     }
// }

// public static boolean checkSimple(int i){
//     if (i<=1)
//         return false;
//     else if (i <=3)
//         return true;
//     else if (i%2==0 || i %3 ==0)
//         return false;
//     int n = 5;
//     while (n*n <=i){
//         if (i % n ==0 || i % (n+2) == 0)
//             return false;
//         n=n+6;
//     }
//     return true;
//     }
// }

// // Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
// public class Printer{ 
//     public static void main(String[] args) { 
      
//       Answer ans = new Answer();      
//       ans.printPrimeNums();
//     }
// }