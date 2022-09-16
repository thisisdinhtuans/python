
package dmt.tuan;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.HashMap;
        

public class Tuan {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.skip("\n");
        Map<String,Integer> m=new HashMap<>();
        while(n-->0){
            StringTokenizer s=new StringTokenizer(sc.nextLine());
            ArrayList<String> a=new ArrayList<>();
            while(s.hasMoreTokens()){
                a.add(s.nextToken().toLowerCase());
            }
            String t="";
            t+=a.get(a.size()-1);
            for(int i=0;i<a.size()-1;i++){
                t+=a.get(i).charAt(0);
            }
            System.out.print(t);
            if(m.containsKey(t)){
                System.out.print(m.get(t));
                m.put(t, m.get(t)+1);
            } else {
                m.put(t, 2);
            }
            System.out.println("@ptit.edu.vn");
        }
    }
}
