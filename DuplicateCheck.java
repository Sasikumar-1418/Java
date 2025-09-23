package array.index;

public class DuplicateCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {2, 4, 6, 2, 8, 4, 10,10};
		
		for(int i=0;i<arr.length;i++) {
			for(int k=i+1;k<arr.length;k++) {
				if(arr[i]==arr[k]) {
//					System.out.println("Found the Repeating items in an Array: ");
					System.out.print(arr[i]+" ");
				}
			}
		}
	}

}
