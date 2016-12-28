
public class Ratation {
	static int[][] rotate(int[][] Matrix,int N) {   //N*N matrix
		int[][] newMatrix=new int[N][N];
		//assume clockwise
		for(int i=N-1;i>=0;i--) { //row
			for(int j=0;j<N;j++) {//col
				newMatrix[j][N-1-i]=Matrix[i][j];
			}
		}
		return newMatrix;		
	}
	public static void main(String[] args) {
		int[][] Matrix={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
		int N=4;
		int[][] newMatrix=rotate(Matrix,N);
		for(int i=0;i<N;i++) { //row
			for(int j=0;j<N;j++) {//col
				System.out.print(newMatrix[i][j]+ " ");
			}
			System.out.println();
		}
	}
}
