package com.nabesh;

import java.util.HashMap;
import java.util.Scanner;

public class Main {

    static boolean isAnagram(String a, String b) {
        // Complete the function
        if (a.length() == b.length()){
            java.util.Map <String, Integer> map = new java.util.HashMap<String, Integer>();
            a = a.toLowerCase();
            b = b.toLowerCase();
            for (int i = 0; i<a.length(); i++){
                map.put(Character.toString(a.charAt(i)), 0);
                map.put(Character.toString(b.charAt(i)), 0);
            }

            for (int i = 0; i<a.length(); i++){
                map.put(Character.toString(a.charAt(i)), map.get(Character.toString(a.charAt(i))) + 1);
                map.put(Character.toString(b.charAt(i)), map.get(Character.toString(b.charAt(i))) + 1);
            }

            for(Integer value : map.values()){
                if (value % 2 == 1){
                    return false;
                }
            }
            return true;
        }else{
            return false;
        }
    }

    public static void main(String[] args) {
	// write your code here
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
