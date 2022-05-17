package ai.jobiak.lamdas;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class TestFunctionals {
	public static void main(String[] args) {
		Function<String,Integer>lengthFunction=(String str)->{return str.length();};
           
		int result=lengthFunction.apply("Jobiak.com");
		System.out.println(result);
		//System.out.println("Jobiak.com".length());
		
		ArrayList<String>fruits=new ArrayList<>();
		fruits.add("mangos");
		fruits.add("Orange");
		fruits.add("pineapples");
		fruits.add("grapes");
		
		List<Integer>lengthList=method(fruits,lengthFunction);
		System.out.println(lengthList);
		List<Integer>lengthList1=methodHalfLength(fruits,lengthFunction);
		System.out.println(lengthList1);
		
		}
	    static List<Integer>method(ArrayList<String>list,Function<String,Integer>functionParam){
	    ArrayList<Integer> intList=new ArrayList<>();
	    for(String str:list)
	    {
	    	int length=functionParam.apply(str);
	    	intList.add(length);
	    }
	    return intList;
	    }
	    static List<Integer>methodHalfLength(ArrayList<String>list,Function<String,Integer>functionParam){
	        ArrayList<Integer> intList1=new ArrayList<>();
	        for(String str:list)
	        {
	        	int length=functionParam.apply(str);
	        	intList1.add(length);
	        }
	        return intList1;

	}
	}