package knightingale;
import java.util.Arrays;
public class FrequencyOfNumber {

	public static void MaxRepeatingElement(int [] A){
        int maxCounter = 0;
        int element=0;
        for (int i = 0; i <A.length ; i++) {
            int counter =1;
            for (int j = i+1; j <A.length ; j++) {
                if(A[i]==A[j]){
                    counter++;
                }
            }
            if(maxCounter<counter){
                maxCounter=counter;
                element = A[i];
            }
        }
        System.out.println("Element repeating maximum no of times: " + element + ", maximum count: " + maxCounter);
    }

	public static void main(String[] args) 
	{
		int i, j, count =1;
		int[] myNum = {5, 6, 2, 3, 1, 4, 2, 5, 1, 5};
		 boolean visited[] = new boolean[10];
		 int findmax[] = new int[10];
	     Arrays.fill(visited, false);
		for(i=0; i<myNum.length; i++)
		{
			 if (visited[i] == true)
		            continue;
			count =1;
			for(j=i+1; j<myNum.length; j++)
			{
				if(myNum[i]==myNum[j])
				{
					visited[j] = true;
					count++;
					findmax[i]=count;
				}	
			} 
			System.out.println("The number of times " + myNum[i]+" is repeated is " + count);
		}
		MaxRepeatingElement(myNum);
	}

}
