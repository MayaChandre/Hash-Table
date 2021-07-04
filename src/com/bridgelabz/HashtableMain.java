package com.bridgelabz;

public class HashtableMain {

	    public static void main(String[] args) {
	        HashtableImpl<String, Integer> hashImpl = new HashtableImpl();
	        String message = "To be or not to be";

	        //String to String[] conversion.
	        String[] messageArray = message.toLowerCase().split(" ");

	        //Iterate within the array
	        for(String word: messageArray) {
	            Integer value =  hashImpl.get(word);
	            if( value == null)
	                value = 1;
	            else
	                value = value + 1;
	            hashImpl.add(word , value);
	        }
	        //Display the linked list
	        System.out.println(hashImpl);
	    }
	}
