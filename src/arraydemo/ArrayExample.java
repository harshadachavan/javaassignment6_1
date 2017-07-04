package arraydemo;

/*
 * Java array is an object the contains elements of similar data type. It is a data structure where we store similar elements. 
 * We can store only fixed set of elements in a java array.
 * 
 * Array in java is index based, first element of the array is stored at 0 index.
 * */
public class ArrayExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]=new int[10];//declaration 
		
		//we create loop for adding values to the array.
		for(int i=0;i<a.length;i++) {
			a[i] = i+1;
		}
		
		System.out.println("Even numbers between 1-10 :");
		//we loop thru the array and add condition to find even numbers
		for(int i = 0 ; i < a.length ; i++)
        {
            if(a[i] % 2 == 0)
            {
                System.out.print(a[i]+" ");
            }
        }
	}

}
