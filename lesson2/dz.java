// import java.util.Arrays;


// class dz {
//     public static int[] mergeSort(int[] a) {
//         // Напишите свое решение ниже
//         Arrays.sort(a);
//         System.out.println(a);
//         return a;
//     }


// // Не удаляйте этот класс - он нужен для вывода результатов на экран и пр
//     public static void main(String[] args) { 
//         int[] a;

//         if (args.length == 0) {
//         // При отправке кода на Выполнение, вы можете варьировать эти параметры
//             a = new int[]{5, 1, 6, 2, 3, 4};
//         } else {
//             a = Arrays.stream(args[0].split(", ")).mapToInt(Integer::parseInt).toArray();
//         }

//         dz answer = new dz();
//         String itresume_res = Arrays.toString(answer.mergeSort(a));
//         System.out.println(itresume_res);
//     }
// }
