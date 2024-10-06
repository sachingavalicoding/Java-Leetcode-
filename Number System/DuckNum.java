class DuckNum  
{
	public static void main(String[] args) 
	{
		int num = 128;
		while(num != 0) {
			if(num % 10 == 0) {
				break;	
			}
			num = num / 10;
		}
		if(num == 0) {
		   System.out.println( " Not a Duck number ");
		}
		else{
			 System.out.println( "  Duck number ");
		}
	}
}
