package basicsofprogramming;

public class MultiDimensionalArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Declarartion and allocation of array
		int a[][] = new int[2][4];
		
		//Initialization of array
		a[0][0] = 1;
		a[0][1] = 2;
		a[0][2] = 3;
		a[0][3] = 4;
		a[1][0] = 6;
		a[1][1] = 7;
		a[1][2] = 8;
		a[1][3] = 9;
		for(int i=0;i<2;i++)//for rows
		{
			for(int j=0;j<4;j++)//for columns
			{
				System.out.println(a[i][j]);
			}
		}
	}
}

/*logic
i=0
j=0
x[0][0]=1
i=0
j=1
x[0][1]=2
i=0;
j=2;
x[0][2]=3
i=0
j=3
x[0][3]=4
i=0
j=4
i=1
j=0
x[1][0]=5
*/
