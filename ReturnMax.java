public class ReturnMax {
 /** Main method */
 public static void main(String[] args) {
 int i = 5;
 int j = 2;
 int k = max(i, j);
       System.out.println("The maximum of " + i +
 " and " + j + " is " + k);
     }
   public static int max(int num1, int num2){
   int max;
   if(num1>num2){
   	max=num1;
   } else { 
   	max=num2;}
   	return max;




    }
}