package 종합실습과제;

public class ans50 {

	public static void main(String[] args) {
		int arr[][] = new int[5][5];
		int tmp=1;
		int h=0,y=2;
		arr[h][y]=tmp++;
		//System.out.println(1);
		while(tmp<=25) {
			if(h-1<0)
				h=4;
			if(y+1>4)
				y=0;
			if(arr[h-1][y+1]!=0)
				h++;
			if(h-1<0 && y+1>4) 
				h++;
			
			arr[h-1][y+1]=tmp++;
		}
		//System.out.println(2);
		for(int i=0;i<5;i++) {
			for(int j=0;j<5;j++)
				System.out.printf("%2d ", arr[i][j]);
			System.out.println();
		}
		//System.out.println(3);
	}

}
