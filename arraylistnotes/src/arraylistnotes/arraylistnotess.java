package arraylistnotes;

import java.util.ArrayList;

public class arraylistnotess {
public static void main(String[] args) {
	ArrayList<Integer> myList= new ArrayList<Integer>();
	
	myList.add(8);
	myList.add(18);
	myList.add(28);
	//myList.remove(1);

	//myList.set(1, 52);
	//myList.add(1, 52);
	//myList.get(3);

	//System.out.println(myList);
	//System.out.println(myList.get(3));
	//System.out.println(myList.remove(1));
	
	for(int i=0;i<myList.size(); i++) {
		System.out.println(myList.get(i));
	}
	
	for(Integer num: myList) {
		System.out.println((num));
		myList.remove(1);
	}
  }
}
