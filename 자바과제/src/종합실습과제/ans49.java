package 종합실습과제;

public class ans49 {
	public static void main(String[] args) {
		int d=-1;
		int h=0,y=-1;
		int tmp=1;
		int arr[][] = new int[5][5];
		for(int i=5;i>0;i--) {
			d*=-1;
			for(int j=0;j<i;j++) {
				y+=d;
				arr[h][y]=tmp++;
			}
			for(int k=0;k<i-1;k++) {
				h+=d;
				arr[h][y]=tmp++;
			}		
		}
		for(int i=0;i<5;i++) {
			for(int j=0;j<5;j++)
				System.out.printf("%2d ", arr[i][j]);
			System.out.println();
		}
	}

}
