package 종합실습과제;

public class ans46 {

	public static void main(String[] args) {
		int arr[][]={{0,95,100,88,65,76,89,58,93,77,99},{0,1,1,1,1,1,1,1,1,1,1}};
		for(int i=1;i<11;i++)
			for(int j=1;j<11;j++)
				if(arr[0][i]<arr[0][j])
					arr[1][i]++;
		System.out.println("[석차 연명부]");
		for(int i=1;i<11;i++)
			System.out.printf("%2d번: %d점(%d등)\n", i, arr[0][i], arr[1][i]);		
		
		

	}

}
