package datastructure.stack;

import java.util.ArrayList;
import java.util.List;

public class BuildAnArray {

//	public List<String> buildArray(int[] target, int n) {
//        List<String> list = new ArrayList<>();
//        int k = 0;
//        for(int i= 1; i <= n; i++){
//            if(i > target[target.length -1]){
//                break;
//            }
//           int index = Arrays.binarySearch(target, i);
//            if(index >= 0 ){
//                list.add("Push");
//            } else {
//                  list.add("Push");
//                  list.add("Pop");
//            }
//        }
//        
//        return list;
//    }
	
	
	
	 public static List<String> buildArray(int[] target, int n) {
	        List<String> list = new ArrayList<>();
	        int k = 0;
	        for(int i= 1; i <= n; i++){
	            if(i <= target[target.length - 1]){
	                if(target[k++] == i){
	                    list.add("Push");
	                } else {
	                    list.add("Push");
	                    list.add("Pop");
	                    k--;
	                }
	            } else {
	                break;
	            }
	        }
	        
	        return list;
	    }
	public static void main(String[] args) {
		int target[]= {1,3};
		List<String> list = buildArray(target,3);
		System.out.print(list);
		

	}

}
