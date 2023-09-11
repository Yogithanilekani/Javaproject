package Comparatorpack;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.stream.Collectors;
//class MycComparator implements Comparator<Integer>{
//
//	@Override
//	public int compare(Integer o1, Integer o2) {
//		// TODO Auto-generated method stub
//		if(o1<02) {
//		return -1;
//		}
//		else if(o1>02) {
//			return 1;
//		}
//		else {
//			return 0;
//		}
//	}
//	
//
//}

public class  Test{
	public static void main(String args[]) {
		ArrayList<Integer> arr = new ArrayList<>();
		arr.add(3);
		arr.add(43);
		arr.add(30);
		arr.add(433);
		arr.add(31);
		arr.add(437);
		arr.add(39);
		arr.add(435);
//		Collections.sort(arr,new MycComparator());
		Comparator<Integer> c = (I1,I2) ->(I1<I2)?-1:(I1>I2)?1:0;
		Collections.sort(arr,c);
		System.out.println(arr); 
//		[3, 30, 31, 39, 43, 433, 435, 437]
		
		arr.stream().forEach(System.out::println);
//Output:		3
//		30
//		31
//		39
//		43
//		433
//		435
//		437
		
//		RETURN EVEN NUMBERS
		System.out.println(arr.stream().filter(i->i%2==0).collect(Collectors.toList()));
//		[30]
	}
}
