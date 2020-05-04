package day8dictionariesandmaps;

//Complete this code or write your own from scratch
import java.util.*;

class Solution{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();   // n - how many input name/phone
        HashMap<String, Integer> map = new HashMap<String, Integer>(); // create HashMap
        for(int i = 0; i < n; i++){
            String name = in.next();
            int phone = in.nextInt();
            // Write code here
            map.put(name, phone);   // put name/phone to HashMap
        }

        while(in.hasNext()){
            String s = in.next();
            // Write code here
            if (map.containsKey(s)) {   // if in map has s
                System.out.println(s + "=" + map.get(s));   // get Value from map
            } else {
                System.out.println("Not found");
            }
        }
        in.close();
    }
}