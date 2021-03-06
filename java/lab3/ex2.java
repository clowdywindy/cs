import java.util.Scanner;
public class ex2 {
 /** Main method */
 public static void main(String[] args) {
   long startTime, endTime, executionTime;
   startTime = System.currentTimeMillis();
   Scanner keyboard = new Scanner(System.in);
   int n;
   double num;

   System.out.print("Enter the size of each matrix: ");
   n = keyboard.nextInt();
   System.out.println("Enter the matrix element");
   System.out.print("All elements of the matrices are assumed to be the same: ");
   num = keyboard.nextDouble();

   double[][] matrix1 = new double[n][n];
   for (int i = 0; i < n; i++)
   for (int j = 0; j < n; j++)
   matrix1[i][j] = num;
   double[][] matrix2 = new double[n][n];
   for (int i = 0; i < n; i++)
   for (int j = 0; j < n; j++)
   matrix2[i][j] = num;//crete tow matrix base on the number

   double[][] resultMatrix = multiplyMatrix(matrix1, matrix2);
   endTime = System.currentTimeMillis();
   executionTime = endTime - startTime;
   System.out.println("Execution time: " + executionTime + "millisecs");
 }
 /** The method for multiplying two matrices */
 public static double[][] multiplyMatrix(double[][] m1, double[][] m2)
 {
   double[][] m3 = new double[m1.length][m1[0].length];
   for (int i = 0; i < m3.length; i++)
   for (int j = 0; j < m3.length; j++)
   m3[i][j]= m1[i][0]*m2[0][j]+m1[i][1]*m2[1][j]+m1[i][2]*m2[2][j];
   return m3;//calculate the value of the third matrix
 }


}
