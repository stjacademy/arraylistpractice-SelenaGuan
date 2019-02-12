package arraylistnotes;

import java.util.ArrayList;

public class arraylistnotess {
public static void main(String[] args) {
	ArrayList nums = new ArrayList(); 
	nums.add(2);
	nums.add(3);
	nums.add(5);

	nums.add(7);
	nums.add(11);
	nums.add(13);
	nums.add(17);
	nums.add(19);


	//ArrayList<Integer> ArrayList= new ArrayList<Integer>();
	
	nums.set(nums. size () -2, nums.get(nums.size()-1)); 

	System.out.println((nums));

	//myList.add(8);
	//myList.add(18);
	//myList.add(28);
	
	
	//myList.remove(1);

	//myList.set(1, 52);
	//myList.add(1, 52);
	//myList.get(3);

	//System.out.println(myList);
	//System.out.println(myList.get(3));
	//System.out.println(myList.remove(1));
	
	/*for(int i=0;i<myList.size(); i++) {
		System.out.println(myList.get(i));
	}
	
	for(Integer num: myList) {
		System.out.println((num));
		//myList.remove(1); never remove in a for loop
	}*/
  }
}
