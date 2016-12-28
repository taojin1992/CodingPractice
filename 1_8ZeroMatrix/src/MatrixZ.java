import java.util.ArrayList;
public class MatrixZ {
	static int[][] set(int[][] Matrix,int M,int N) {//M*N Matrix
		boolean[] columnMark=new boolean[N];
		boolean[] rowMark=new boolean[M];
		for(int col=0;col<N;col++) {
			for(int row=0;row<M;row++) {
				if(Matrix[row][col]==0) {
					columnMark[col]=true;
					rowMark[row]=true;
				}
			}
		}
		for(int i=0;i<N;i++) {
			if(columnMark[i]==true) {
				for(int k=0;k<M;k++) {
					Matrix[k][i]=0;
				}
				
			}
		}
		for(int i=0;i<M;i++) {
			if(rowMark[i]==true) {
				for(int k=0;k<N;k++) {
					Matrix[i][k]=0;
				}
				
			}
		}
		return Matrix;
	}
	public static void main(String[] args) {
		int[][] Matrix={{1,1,1,0},{1,1,2,3},{1,1,1,1}};
		int M=3,N=4;
		int[][] newMatrix=set(Matrix,M,N);
		for(int i=0;i<M;i++) {
			for(int j=0;j<N;j++) {
				System.out.print(newMatrix[i][j]);
				
			}
			System.out.println();
		}	
	}
}
