class SelfDivNum2 
{
	public static void main(String[] args) 
	{
		int left = 2;
		int right = 100;
		for(int j = left; j <= right; j++){
			int i = j;
			if(j % 10 != 0) {
				
			while(i != 0) {
			if(j % (i % 10) != 0){
				break;
			}
			else{
				i = i / 10;
			}
		}
			if(i == 0) {
				System.out.print(j + "  ");
				}
			}
		}
		
	}
}
