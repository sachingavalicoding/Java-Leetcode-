class PerfectNum2 
{
	public static void main(String[] args) 
	{
		int limit = 50;
		int factSum = 0;
		for(int i = 2; i <= limit; i++){
			factSum = 0;
			for( int j = 1; j < i ; j++){
				if( i % j == 0) {
				  	factSum += j;
				}
			}
			if(i == factSum) {
				System.out.println(i + " " + factSum);
			}
			
		}
	}
}
