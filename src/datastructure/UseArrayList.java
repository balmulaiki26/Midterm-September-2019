package datastructure;

import databases.ConnectToSqlDB;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class UseArrayList {

    public static void main(String[] args) throws Exception {
        /*
         * Demonstrate how to use ArrayList that includes add,peek,remove,retrieve elements.
         * Use For Each loop and while loop with Iterator to retrieve data.
         * Store all the sorted data into one of the databases.
         *
         */
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(21);
        list1.add(23);
        list1.add(34);
        list1.add(45);
        list1.add(56);
        list1.add(52);

        //Print Array List
        System.out.println("Retrieving elements from ArrayList: " + list1);


        System.out.println("Peek first element: " + list1.get(0));

        System.out.println("Remove element at index 1: " + list1.remove(1));


        System.out.println("Re-retrieving elements from ArrayList: " + list1);


        System.out.println("Use of for-each loop: ");
        for (Integer in : list1) {
            System.out.println(in);
        }

        System.out.println("Use of iterator using while loop: ");
        Iterator it = list1.iterator();
        while (it.hasNext()) {
            Integer i = (Integer) it.next();
            System.out.println(i);
        }
        Collections.sort(list1);
        System.out.println(list1);
        List list = new ArrayList();
        list = list1;


        ConnectToSqlDB connectToSqlDB = new ConnectToSqlDB();


        connectToSqlDB.insertDataFromStringToSqlTable( "List", "array_List","list_Element");

        connectToSqlDB.insertDataFromArrayListToSqlTable(list, "array_list", "list_Element");


        List<String> numbers = connectToSqlDB.readDataBase("array_list", "list_Element");

        for (String st : numbers) {
            System.out.println(st);
        }
    }
}



