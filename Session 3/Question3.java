import java.util.Scanner;

class Question3 {
	public static boolean isSafe(int board[][], int row, int col)
    {

        for (int i = 0; i < col; i++)
            if (board[row][i] == 1)
                return false;
        for (int i = 0; i < row; i++)
            if (board[i][col] == 1)
                return false;

        return true;
    }
     public static void main(String[] args)
     {
    	 Scanner scn=new Scanner(System.in);
    	 
    	 int arr[][]= new int[8][8];
    	 for(int i=0;i<8;i++)
    	 {
    		 for(int j=0;j<8;j++)
    		 {
    			 arr[i][j]=0;
    		 }
    	 }
    	 
         int i=0;
         while(i<4)
         {
        	
        	 System.out.println("Enter row: ");
        	 int row=scn.nextInt();
        	 System.out.println("Enter col: ");
        	 int col=scn.nextInt();
        	 if(arr[row][col]==1)
        	 {
        		 System.out.println("Queen is already placed at this position.Try again ");
        	 }
        	 else if(isSafe(arr,row,col)==true)
        	 {
        		 i += 1;
        		 System.out.println("Queen placed successfully");
        		 arr[row][col]=1;
        	 }
        	 else
        	 {
        		 System.out.println("Not possible to place queen at this position.Try again");
        	 }
        	 
         }
         scn.close();
         char blackSquare = '\u25A1';	
 		 char whiteSquare = '\u25A0';	
 		 char queen = '\u2655';
 		for(i=0;i<8;i++) {
 			for(int j=0;j<8;j++) {
 				if(arr[i][j] == 1)
				{
					System.out.print(queen+" "); 
				}
 				else if(i%2==0) 
 				{
 					char square = ( (j+1) % 2 == 0 )? blackSquare : whiteSquare;
 					System.out.print(square+" ");
 				}
 				else 
 				{
 					char square = (j % 2) == 0 ? blackSquare : whiteSquare;
 					System.out.print(square+" ");
 				}
 				
 			}
 			System.out.println();
 		}
 		 
    	 
     }
}