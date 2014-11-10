public class SudokuChecker
{

   public static void main(String[] args)
   {
      System.out.println("Hello world.");
   }
   
   //row is an integer array of size 9, containing the row of numbers that the user just modified
   //pos is the index within the row that the user modified
   //the method should return a boolean array of size 9, with a true in the ith position if the corresponding element in row is equal to row[pos]
   //but the element at the pos index in the boolean array should be false (because we already know it is equal to row[pos])
   //for example, if row is 9,3,8,0,2,6,2,1,7 and pos is 4, checkRow should return the following boolean array false,false,false,false,false,false,true,false,false
   public static boolean[] checkRow(int[] row, int pos)
   {
	   boolean[] check = new boolean[row.length];
	   for (int i = 0; i < row.length; i++){
		   if (i == pos){
			   check[i] = false;
		   } else if (row[i] == row[pos]){
			   check[i] = true;
		   } else {
			   check[i] = false;
		   }
	   }
	   return check;
   }
   
}