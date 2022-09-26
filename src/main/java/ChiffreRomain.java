package main.java;

import java.util.ArrayList;
import java.util.Arrays;

public class ChiffreRomain {

	private ArrayList<String> symbols;
	private ArrayList<Integer> number;
	private ArrayList<String> frequency3;
	private ArrayList<Integer> listNumber;

	public ChiffreRomain() {
		// Contains roman symbols
		String[] symbolArray = new String[] { "I", "V", "X", "L", "C", "D", "M"};
		this.symbols = new ArrayList<>(Arrays.asList(symbolArray));
		
		// Contains symbols that can be repeated
		String[] frequency3Array = new String[] { "I", "X", "C"};
		this.frequency3 = new ArrayList<>(Arrays.asList(frequency3Array));
		
		// Contains number replaced symbols
		Integer[] numberArray = new Integer[] {1, 5, 10, 50, 100, 500, 1000};
		this.number = new ArrayList<>(Arrays.asList(numberArray));
		
		// To stock converted numbers
		this.listNumber = new ArrayList<Integer>();
	}
	
	// I, X and C cannot be repeated more than 3 times
	// The repetition of V, L and D is invalid in the formation of numbers.
	// if condition correct false
	// else true
	public boolean isFrequency3(ArrayList<String> list) {
		int repeated=0 ;
		int notrepeated = 0;
		String prevValue = list.get(0);
		for (String l : list) {
			if(!prevValue.equals(l)) {
				notrepeated=0;
				repeated=0;
				prevValue = l;
			}
			if(this.frequency3.contains(l)) {
				repeated++;
			}
			else {
				notrepeated++;
			}
			
			if(repeated>3) {
				return true;
			}
			if(notrepeated>1) {
				return true;
			}
		}
		return false;
	}
	
	// Change symbol by number
	// if a symbol not correct return false
	// else return true
	public boolean isRomain(ArrayList<String> list) {
		int index;
		int number;
		for (String l :list) {
			if(this.symbols.contains(l)) {
				index = this.symbols.indexOf(l);
				number = this.number.get(index);
				this.listNumber.add(number);
			}else {
				return false;
			}
		}
		return true;
	}
	
	// if there is no fequency more than 3 for I, X, C and number is roman
	// return true if return false
	public boolean isValid(ArrayList<String> list) {
		boolean isRomain; 
		boolean isRepeated3;
		
		isRepeated3 = isFrequency3(list);
		isRomain = isRomain(list);
	    if(isRepeated3==true || isRomain==false) {
	    	return false;
	    }
		return true;
	}
	
	// get a string convert in in Array list to do operation 
	// if the format is correct calculate the numbers
	// else return zero because format is not correct and we can't convert it 
	public int convertToNumbers(String numberRomain) {
		int result = 0;

		String[] stringRomain = numberRomain.split("");
		ArrayList<String> listRomain = new ArrayList<>(Arrays.asList(stringRomain));
		
	    if(!isValid(listRomain)) {
			System.out.println("FORMAT NOT VALID!!!!!!!!! ==> Number Romain : "+numberRomain+ " ==> Number : "+result );
	    	return result;
	    }
	    
		for (int i = 0; i<listNumber.size();i++) {
			if(i==listNumber.size()-1) {
				result +=listNumber.get(i) ;
			}else {
				if( listNumber.get(i) < listNumber.get(i+1)) {
				    result += listNumber.get(i+1) - listNumber.get(i)  ;
				    i++;
				}else {
				    result +=listNumber.get(i) ;
			    }
		   }
		}
		System.out.println("Number Romain : "+numberRomain+ " ==> Number : "+result);
		return result;
	}

}
