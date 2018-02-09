//Cookie - Kayli Matsuyoshi, Kevin Lin, Victor Lin
//APCS2 -- Pd1
//Lab00 -- But What Does the Data Say?
//2018-02-09f

public class MFDriver {

  public static int[][] matrix;
  public static int size;
  public static double totalTime;


  public static void fill(){
    for(int i=0;i<matrix.length;i++){
      for(int j=0;j<matrix.length;j++)
      matrix[i][j] = 2 * i + j;
    }
  }

  public static void addTime(int target){
    matrix = new int[size][size];
    fill();
    for(int i=0;i<100;i++){
      double before = System.nanoTime();
      MatrixFinder.find(matrix,target);
      totalTime += System.nanoTime()-before;
    }
  }

  public static void write(){
    totalTime = 0;
    addTime(size * 2);
    double time = totalTime / 100;
    System.out.println(size + "," + time + "," + ( time / size ));
  }

  public static void main(String []args){
    size = 1000;
    for (int i = 0; i<100;i++) { //First trials seemed slow, so this is a "warmup"
      addTime(size * 2);
    }
    System.out.println("size,time(nanoSeconds),timePerSize");
    for(size =1000;size<=14401;size+=100){ //OutOfMemoryError at size 14500
      write();
    }
  }
}
