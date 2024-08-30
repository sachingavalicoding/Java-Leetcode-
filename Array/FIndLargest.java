class FindLargest {

public static void main(String [] args ) {

  System.out.println(" Array Largest element " );

int [] arr = { 10,43,2,53,23,32,5};
int max = arr[0];

 // check which is biggest element in that array 

for(int i = 0; i < arr.length; i++){
    if(max < arr[i] ) {

    max = arr[i];

}


}


}

}