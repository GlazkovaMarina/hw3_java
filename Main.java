// // 1 Реализовать алгоритм сортировки слиянием
// import java.util.ArrayList;
// import java.util.Random;
// import java.io.FileWriter;
// import java.io.BufferedWriter;
// import java.io.IOException;
// import java.util.Date;

// public class Main {
//     public static ArrayList<Integer> merge(ArrayList<Integer> arrayA, ArrayList<Integer> arrayB) {

//         ArrayList<Integer> arrayC = new ArrayList<Integer>(arrayA.size() + arrayB.size());
//         int positionA = 0, positionB = 0;

//         for (int i = 0; i < arrayA.size() + arrayB.size(); i++) {
//             if (positionA == arrayA.size()) {
//                 arrayC.add(i, arrayB.get(positionB));
//                 positionB++;
//             } else if (positionB == arrayB.size()) {
//                 arrayC.add(i, arrayA.get(positionA));
//                 positionA++;
//             } else if (arrayA.get(positionA) < arrayB.get(positionB)) {
//                 arrayC.add(i, arrayA.get(positionA));
//                 positionA++;
//             } else {
//                 arrayC.add(i, arrayB.get(positionB));
//                 positionB++;
//             }
//         }
//         return arrayC;
//     }

//     public static ArrayList<Integer> mergeSort(ArrayList<Integer> arrayA) {
//         if (arrayA == null) {
//             return null;
//         } else if (arrayA.size() < 2) {
//             return arrayA;
//         }

//         ArrayList<Integer> arrayB = new ArrayList<Integer>(arrayA.size() / 2);
//         for (int i = 0; i < arrayA.size() / 2; i++) {
//             arrayB.add(i, arrayA.get(i));
//         }
//         ArrayList<Integer> arrayC = new ArrayList<Integer>(arrayA.size() - arrayA.size() / 2);
//         int j = 0;
//         for (int i = arrayA.size() / 2; i < arrayA.size(); i++) {
//             arrayC.add(j++, arrayA.get(i));
//         }
//         return merge(mergeSort(arrayB), mergeSort(arrayC));
//     }

//     public static void main(String[] args) {
//         try {
//             FileWriter writer = new FileWriter("log.txt", true);
//             BufferedWriter bufferWriter = new BufferedWriter(writer);
//             Date date = new Date();
//             bufferWriter.write(date.toString());
//             bufferWriter.write("\n");

//             Random r = new Random();
//             ArrayList<Integer> arr = new ArrayList<Integer>(10);
//             for (int i = 0; i < 10; i++) {
//                 arr.add(i, r.nextInt(10));
//             }
//             bufferWriter.write("Initial array: ");
//             bufferWriter.write(arr.toString());
//             bufferWriter.write("\n");
//             ArrayList<Integer> arr_new = new ArrayList<Integer>(10);
//             arr_new.addAll(mergeSort(arr));
//             bufferWriter.write("Sorted array: ");
//             bufferWriter.write(arr_new.toString());
//             bufferWriter.write("\n");
//             bufferWriter.close();
//         } catch (IOException e) {
//             System.out.println(e);
//         }
//     }
// }

// // 2 Пусть дан произвольный список целых чисел, удалить из него четные числа
// import java.util.ArrayList;
// import java.util.Random;
// import java.util.logging.Logger;

// public class Main {
//     public static void main(String[] args) {
//         Logger logger = Logger.getAnonymousLogger();
//         Random r = new Random();
//         ArrayList<Integer> numbers = new ArrayList<>();

//         logger.info("Initial array");
//         for (int i = 0; i < 15; i++) {
//             numbers.add(i, r.nextInt(10));
//         }
//         logger.info(numbers.toString());
//         ArrayList<Integer> numb_even = new ArrayList<>();
//         for (int i = 0; i < 15; i++) {
//             if (numbers.get(i) % 2 == 0) {
//                 numb_even.add(numbers.get(i));
//             }
//         }
//         numbers.removeAll(numb_even);
//         logger.info("New array");
//         logger.info(numbers.toString());
//     }
        
// }

// // 3 Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее из этого списка.
// import java.util.ArrayList;
// import java.util.Random;
// import java.util.logging.Logger;
// public class Main {
//     public static void main(String[] args) throws Exception {
//         Logger logger = Logger.getAnonymousLogger();
//         Random r = new Random();
//         int max = -10;
//         int min = 10;
//         int sum = 0;
//         ArrayList<Integer> numbers = new ArrayList<>();
//         for (int i = 0; i < 10; i++) {
//             numbers.add(i, (int)(Math.pow(-1.0,i))*r.nextInt(10));
//             if (numbers.get(i) < min)
//             {
//                 min = numbers.get(i);
//             }
//             if (numbers.get(i) > max)
//             {
//                 max = numbers.get(i);
//             }
//             sum += numbers.get(i);
//         }
//         StringBuilder str = new StringBuilder();
//         str.append("Initial array: ");
//         str.append(numbers.toString());
//         str.append("\nMinimum: ");
//         str.append(min);
//         str.append("\nMaximum: ");
//         str.append(max);
//         str.append("\nAverage: ");
//         str.append(sum/10.0);
//         logger.info(str.toString());
//     }
// }
