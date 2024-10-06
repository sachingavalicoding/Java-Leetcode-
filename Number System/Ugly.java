class Ugly 
{
	public static void main(String[] args) {
		int n = 14;
		
		
		while(n > 1){
            if(n % 2 == 0){
                n /= 2;
            }
            else if(n % 3 == 0){
                n /= 3;
            }
            else if(n % 5 == 0){
                n /= 5;
            }
            else{
				break;
            }
        }
        if(n > 1 ){
			 System.out.println(" Not a ugly number");
		}
		else{
			 System.out.println("  ugly number");
		}
	}
}
