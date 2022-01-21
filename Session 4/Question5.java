
// GrayScale the image

class Question5 {
public static void main(String[] args) {
		
		
		int[] pixel1 = {1,2,3};
	 	int[] pixel2 = {4, 5, 6};
	 	int[] pixel3 = {7, 8, 9};
	 	
	 	int[] pixel4 = {10, 11, 12};
	 	int[] pixel5 = {13, 14, 15};
	 	int[] pixel6 = {16, 17, 18};
	 	
	 	int[] pixel7 = {19, 20, 21};
	 	int[] pixel8 = {22, 23, 24};
	 	int[] pixel9 = {25, 26, 27};
	 	
	 	// Representation of an Image
	 	int[][][] image = {
	 						{pixel1, pixel2, pixel3},
	 						{pixel4, pixel5, pixel6},
	 						{pixel7, pixel8, pixel9},
	 					};
	 	for(int i=0;i<3;i++)
	 	{
	 		for(int j=0;j<3;j++)
	 		{//              
	 			int [] a = image[i][j];
	 			int sum=0;
	 			for(int k = 0; k < 3; k++)
	 			{
	 			   sum+=a[k];
	 			}
	 			sum /= 3;
	 			for(int k = 0; k < 3; k++)
	 			{
	 			   a[k]=sum;
	 			}
	 		}
	 	}

	 

	 	for(int i=0;i<3;i++)
	 	{
	 		for(int j=0;j<3;j++)
	 		{
	 			for(int k=0;k<3;k++)
	 			{
	 				System.out.print((image[i][j][k]<10)?" "+image[i][j][k]+" ":image[i][j][k]+" ");
	 			}
	 			System.out.print("       ");
	 		}
	 		System.out.println();
	 	}
	 	

	}

}