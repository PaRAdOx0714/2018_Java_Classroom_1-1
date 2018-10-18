package 종합실습과제;

public class ans50 {

	public static void main(String[] args) {
		int arr[][] = new int[5][5];
		int tmp=1;
		int h=0,y=2;
		arr[h][y]=tmp++;
		while(tmp<=25) {
			h--; y++;
			if(h<0 && y<=4)
				h=4;
			else if(y>4 && h>=0)
				y=0;
			else if(tmp%5==1) {
				h+=2;
				y--;
			}
			arr[h][y]=tmp++;
		}
		for(int i=0;i<5;i++) {
			for(int j=0;j<5;j++)
				System.out.printf("%2d ", arr[i][j]);
			System.out.println();
		}
	}

}
