class ArmStrongNum 
{
	public static void main(String[] args) 
	{
		int num = 153;
		//int temp = num;
		int cube = 0;
		/* while(num != 0) {
		  int rem = num % 10;
		  cube += rem * rem * rem;
		  num /= 10;
		}
		if(temp == cube ) {
			System.out.println("ArmStrong Number ");	
		}
		else {
		System.out.println("Not a ArmStrong Number ");	
		}
		
		*/
		
		
		for(int i = num; i != 0; i/=10){
			cube += ( i % 10) * ( i % 10) * ( i % 10) ;
		}
		
		if(num == cube ) {
			System.out.println("ArmStrong Number ");	
		}
		else {
		System.out.println("Not a ArmStrong Number ");	
		}
		
	}
}
