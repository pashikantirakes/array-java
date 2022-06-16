package in.arrays.com;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class PrintDuplicate {

	public static void main(String[] args) {

		int arr[]= {1,2,4,5,3,2,4,5};
		Set<Integer> s=new HashSet<>();
		for(int i=0;i < arr.length;i++) {
			if(s.contains(arr[i])) {
				System.out.println(arr[i]);
				
			}else {
				s.add(arr[i]);
			}		
		}
		System.out.println(",.,.,.,<<<<<<;;;>>>>>>>>>>");
		Map<Integer,Integer> m=new HashMap<>();
		for(int i=0;i<arr.length;i++) {
			if(m.containsKey(arr[i])) {
				m.put(arr[i],m.get(arr[i])+1);
			}else {
				m.put(arr[i],1);
			}
		}
		m.forEach((k,v)->{
			if(v>1) {
				System.out.println(k);
		}
			
		});
		System.out.println(",.,.,.,<<<<<<;;;>>>>>>>>>>");
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					System.out.println(arr[i]);
				}
			}
		}
	}

}
