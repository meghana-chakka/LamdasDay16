package ai.jobiak.lamdas;

import java.util.Arrays;
import java.util.List;


public class PracticeLamda {
   public static void main(String args[]) {
	   
	   List<Integer> list=Arrays.asList(3,5,6,4,33,55);
	   for (int i=0;i<list.size();i++) {     //using for loop
		   System.out.println(list.get(i));
	   }
	   for(int i:list) {            //using enhanced for
		   System.out.println(i);
	   }
	   list.forEach(i->System.out.println(i));//lamda exp
    }
}