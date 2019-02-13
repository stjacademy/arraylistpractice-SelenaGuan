package arraylistnotes;

import java.util.ArrayList;

public class ArrayListproject {
public static void main(String[] args) {
	ArrayList<Integer> ArrayList= new ArrayList<Integer>();
	ArrayList.add(2);
	ArrayList.add(6);
	ArrayList.add(8);
	System.out.println(getListOfFactors(12));
	System.out.println(keepOnlyCompositeNumber(36));
}
public static ArrayList<Integer> getListOfFactors(int number)
{            
	ArrayList<Integer> keepOnlyCompositeNumbers= new ArrayList<Integer>();
	
	for(int j = 2; j < number; j++) {
        if (number % j == 0) {
        	keepOnlyCompositeNumbers.add(j);
	}
	} 
return keepOnlyCompositeNumbers;
}

public static void keepOnlyCompositeNumbers( ArrayList<Integer> nums )
{	
	for(int i=0; i<=nums.size();i++) {
		if (getListOfFactors(nums.get(i)).size()<=0) {
	            nums.remove(i);
	              i--;}

}
}
}


