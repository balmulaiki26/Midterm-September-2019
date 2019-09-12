package datastructure;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class UseMap {

    public static void main(String[] args) {
        /*
         * Demonstrate how to use Map that includes storing and retrieving elements.
         * Add List<String> into a Map. Like, Map<String, List<string>> list = new HashMap<String, List<String>>();
         * Use For Each loop and while loop with Iterator to retrieve data.
         *
         * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
         */

        List<String> boroughOfNyc = new ArrayList<String>();
        boroughOfNyc.add("queens");
        boroughOfNyc.add("bronx");
        boroughOfNyc.add("Brooklyn");

        List<String> StateOfUSA = new ArrayList<String>();
        StateOfUSA.add("ny");
        StateOfUSA.add("nj");
        StateOfUSA.add("PA");

        List<String> CityOfCanada = new ArrayList<String>();
        CityOfCanada.add("Montreal");
        CityOfCanada.add("Toronto");
        CityOfCanada.add("voncouver");

        Map<String, List<String>> map = new LinkedHashMap<String,List<String>>();
        map.put("NYC", boroughOfNyc);
        map.put("USA", StateOfUSA);
        map.put("Canada", CityOfCanada);

        for(Map.Entry<String, List<String>> country:map.entrySet()) {
            System.out.println(country.getKey()+ " " + country.getValue());
        }
    }

}