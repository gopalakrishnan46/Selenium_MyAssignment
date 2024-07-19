package homeassignment.week3.day2;


import java.util.Arrays;




public class MissingElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int[] arr ={1, 2, 3, 4, 10, 6, 8};
                           
         Arrays.sort(arr);
        
         System.out.println("Before sort array" + Arrays.toString(arr));
         
         for(int i=0;i<arr.length-1;i++) {
        	 int current =arr[i];
        	 int nxt =arr[i+1];
        	 
        	 if(current+1 != nxt) {
        		 for(int j=current +1;j<nxt;j++) {
        			 System.out.println("Missing Numbers "+ j);
        		 }
        	 }
        	 
         }
         
	}

}
