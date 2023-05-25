/*

 */

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {


        ArrayList<ArrayList<Integer>> arrayList = new ArrayList<>();
        ArrayList<Integer> array = new ArrayList<>();
        array.add(200); array.add(104); array.add(478);
        ArrayList<Integer> array2 = new ArrayList<>();
        array2.add(547); array2.add(496); array2.add(100);
        arrayList.add(array2); arrayList.add(array);
        for (int i = 0; i < arrayList.size(); i++){
           ArrayList<Integer> CurrentList = arrayList.get(i);
           for (int j = 0; j < CurrentList.size(); j++){
               System.out.print(CurrentList.get(j) + " ");
           }
            System.out.println();
        }
        System.out.println(arrayList);
    }
}