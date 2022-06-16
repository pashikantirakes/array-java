package in.arrays.com;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class removeDuplicate {
	
	public static void main(String[] args) {
		int arr[]= {5,1,3,2,4,5,6,7,4,2,1,7,78,97,7,7};
		//removeDuplicateUsingHash(arr);
		removeDuplicateUsingSet(arr);
	}

	private static void removeDuplicateUsingSet(int[] arr) {
Set<Integer> st=new HashSet<>();
int len=arr.length;
for(int i=0;i< len-1;i++) {
	st.add(arr[i]);
}
st.forEach(e->System.out.println(e + " "));
		
	}

	private static void removeDuplicateUsingHash(int[] arr) {
		Map<Integer,Integer> m=new HashMap<>();
		int len=arr.length;
		for(int i=0;i< len-1;i++) {
			if(m.containsKey(arr[i])) {
				m.put(arr[i], m.get(arr[i])+1);
			}else {
				m.put(arr[i],1);
			}
		}
		//Print Each Key
		m.forEach((k,v)->System.out.println(k + " " + v + " "));
		
	}

}
