
public class TestArray 
{

	public static void main(String[] args) 
	{
		/*
		int []arr= {50,80,70,10,65};
		
		for(int i:arr)
		{
			System.out.println(arr[i]);// ArrayIndexOutOfBoundException 
		}
		*/
		
		//********************************************************************************************************
		
		/*
		int [][]arr= new int[3][3];      //{{10,20,30},{40,50,60},{70,80,90}};
				for(int i=0;i<3;i++)
				{
					for(int j=0;j<3;j++)
					{
						System.out.print(arr[i][j]+" " );
					}
				
					System.out.println();
				}
				*/
		//************************************************************************************************************
		/*
		int[][]arr= new int [3][];
		arr[0]=new int [3];
		arr[1]=new int [5];
		arr[2]=new int[2];
		
		int count=0;
		for(int i=0;i<arr.length;i++)
		{
			for (int j=0;j<arr[i].length;j++)    // example of jagged array
			{
				arr[i][j]=count++;
			}
		}
		
		for(int i=0;i<arr.length;i++)
		{
			for (int j=0;j<arr[i].length;j++)
			{
				System.out.print(arr[i][j]);
			}
			System.out.println();
	}
	*/
//*********************************************************************************************************************************
		/*
		int [][]arr1={{10,10,10},{20,20,20}};
		int [][]arr2={{10,10,10},{20,20,20}};
		int sum=0;
		int sum1=0;
		for (int i=0;i<2;i++)
		{
			for(int j=0;j<3;j++)
			{                                         // sum of an array
				sum=sum+arr1[i][j];
				sum1=sum1+arr2[i][j];
			}
		}
		System.out.println(sum+sum1);
		System.out.println(sum1);
		*/
		
//**********************************************************************************************************************************
		/*
		int arr1 [][]= {{2,3}};
		int arr2 [][]= {{4,5}};
		int arr3[][]= new int [1][2];
		try
		{
		for (int i=0;i<2;i++)
		{
			for (int j=0;j<2;j++)
			{
				arr3[i][j]=0;
				for(int k=0;k<2;k++)
				{
					arr3[i][j]+=arr1[i][j]*arr2[i][k];
				}
				System.out.print(arr3[i][j]+" ");
			}
			System.out.println();
		}
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			e.getMessage();
		}
		*/
		//***********************************************************************************************************************************
		
		int arr1[][]= {{1,1,1},{2,2,2},{3,3,3}};
		int arr2[][]= {{1,1,1},{2,2,2},{3,3,3}};
		int arr3[][]=new int [3][3];
		
		for (int i =0;i<arr1.length;i++)
		{
			for(int j=0;j<arr1.length;j++)
			{
				arr3[i][j]=0;
				for (int k=0;k<arr1.length;k++)
				{
					arr3[i][j]=arr1[i][k]*arr2[k][j];
				}
				System.out.print(arr3[i][j]+" ");
			}
			System.out.println(" ");
		}
		

		
		
		
}
}
