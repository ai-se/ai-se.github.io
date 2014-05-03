import java.io.BufferedReader;
import java.io.InputStreamReader;
   

public class UtopiaTree {
	
    public static void main(String args[] ) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        int[] result = new int[T];
        for(int i=0;i<T;i++){
        	int N =  Integer.parseInt(br.readLine());
        	int length=1;
        	while(N>1){
        		length = 2*length + 1;
        		N-=2;
        	}
        	if(N!=0){
        		length*=2;
        	}
        	result[i]=length;
        }
        
        for(int i=0;i<result.length;i++)
        	System.out.println(result[i]);
        
    }
}
