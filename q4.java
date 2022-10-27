package Lab8;

import java.util.*;

public class q4 {

	public static void main(String[] args) {
		ArrayList<Integer> newList = new ArrayList<Integer>();
		
		
		newList.add(28);
		newList.add(8);
		newList.add(31);
		newList.add(45);
		newList.add(6);
		newList.add(7);
		newList.add(19);
		newList.add(15);
		
		Iterator<Integer> Iter= newList.iterator();
		
		System.out.println(newList);
		
		while(Iter.hasNext()) {
			Integer list = Iter.next();
			if(list>= 10 && list<=20) {
				Iter.remove();
			}
			
		}
		System.out.println(newList);
		

	}

}
