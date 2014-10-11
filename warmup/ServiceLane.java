import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

   

public class ServiceLane {
	public static void main(String args[] ) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] first = br.readLine().split(" ");
      	int N = Integer.parseInt(first[0]);
      	int T = Integer.parseInt(first[1]);
      	String[] width = br.readLine().split(" ");
  		int[] widtharray = new int[N];
  		for(int j=0;j<N;j++){
  		 widtharray[j]=Integer.parseInt(width[j]);
  		}
  		int[] answer = new int[T];
      	for(int i=0;i<T;i++){
      	    String[] temp = br.readLine().split(" ");
      		int start = Integer.parseInt(temp[0]);
          	int end = Integer.parseInt(temp[1]);
      		int[] subWidthArray =Arrays.copyOfRange(widtharray, start, end+1);
      		answer[i] = getMinValue(subWidthArray);
      	}  
      	
      	for(int i=0;i<T;i++){
      		System.out.println(answer[i]);
      	}
	}
	
	public static int getMinValue(int[] numbers){  
		int minValue = numbers[0];  
		for(int i=1;i<numbers.length;i++){  
			if(numbers[i] < minValue){  
				minValue = numbers[i];  
			}  
		}  
		return minValue;  
	}
