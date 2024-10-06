class SelfDivNum 
{
	public static void main(String[] args) 
	{
		int num = 45;
		int i = num;
		while(i != 0) {
			if(num % (i % 10) != 0){
				break;
			}
			else{
				i = i / 10;
			}
		}
	    if(i == 0) {
			System.out.println(" Self Div Number ");
		}else{
			System.out.println(" Not self Div Number");
		}
	}
}
