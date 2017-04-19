/* Sample program illustrating input/output methods */
import java.util.*;

class Solution{
   public static void main( String args[] ){
      
// helpers for input/output      

      Scanner in = new Scanner(System.in);
      
      int N, K;
      N = in.nextInt();
      K = in.nextInt();
      
      int C[] = new int[N];
      for(int i=0; i<N; i++){
         C[i] = in.nextInt();
      }
      int[] friends = new int[K];
      Arrays.sort(C);
      int result = 0;
      int counter = 0;
       for(int i=N-1; i>= 0; i--){
           result += (friends[counter%K]+1)*C[i];
          friends[counter%K]++;
           counter++;
      }

      System.out.println( result );
      
   }
}
