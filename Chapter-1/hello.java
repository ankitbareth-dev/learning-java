public class hello {

  static int[][] matrixAddition(int[][] a, int[][] b) {
    int rows = a.length;
    int cols = a[0].length;
   
    int[][] result = new int[rows][cols];

    for (int i = 0; i < rows; i++) {
      for (int j = 0; j < cols; j++) {
        result[i][j] = a[i][j] + b[i][j];
      }
    }

    return result;
  }

  public static void main(String[] args) {
    int[][] a = {{1, 2}, {3, 4}};
    int[][] b = {{5, 6}, {7, 8}};

    int[][] sum = matrixAddition(a, b);

    System.out.println("Result of Matrix Addition:");
    for (int i = 0; i < sum.length; i++) {
      for (int j = 0; j < sum[i].length; j++) {
        System.out.print(sum[i][j] + " ");
      }
      System.out.println();
    }
  }
}
