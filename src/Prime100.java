
public class Prime100 {

	public void prime(){
		
		int[] numArray = new int[100];
				
		for (int i = 1; i <= 100; i++){			
			numArray[i - 1] = i;			
		}
		
		for (int j : numArray) {
			int k = j - 1;
			while (k != 1){
				if (j % k == 0) { 
					continue;
				}
			}
			System.out.println(j);
		}
	}	
}
