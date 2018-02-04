//Team Cookie - Kayli Matsuyoshi, Kevin Lin, Victor Lin
//APCS2 -- Pd1
//
//

import java.util.*; 

public class MatrixTester{
	public static int[][] matrix;
	public static int size;
	public static ArrayList list;

	public static void fill(){
		for(int i=0;i<matrix.length;i++){
			for(int j=0;j<matrix.length;j++)
				matrix[i][j] = 2 * i + j;
		}
	}

	public static void addTime(int target){
		for(int i=0;i<1000;i++){
			matrix = new int[size][size];
			fill();
			double before = System.nanoTime();
			MatrixFinder.find(matrix,target);
			list.add(System.nanoTime()-before);
		}
		list.remove(0);
	}

	public static void write(){	
		list = new ArrayList();		
		addTime(35);
		//System.out.println(list);
		System.out.println(size + "," + getAverageTime(list)  + "\n");
	}

	public static double getAverageTime(ArrayList x){
		double total = 0.0;
		for(int i=0;i<x.size();i++)
			total += (double)(x.get(i));
		return total/x.size();
	}

	public static void main(String []args){
		System.out.println("size,time(nanoSeconds)");
		for(size =1;size<1001;size++)
			write();
	}
}