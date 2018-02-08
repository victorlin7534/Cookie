//Team Cookie - Kayli Matsuyoshi, Kevin Lin, Victor Lin
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
		for(int i=0;i<100;i++){
			matrix = new int[size][size];
			fill();
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
		System.out.println("size,time(nanoSeconds),timePerSize");
		for(size =1000;size<10001;size+=100)
			write();
	}
}
