import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.*;

public class MainClass {
    public static void main(String[] args) throws IOException {
        Cities cty = new Cities();
        List<City> cities = cty.readCitiesFromtxt("Cities.txt");

        SortedMap<String, List<String>> map = new TreeMap<>();

        System.out.println("City entries:");
        for(int i = 0; i < cities.size();i++) {
            // Printing all Cities entries
            System.out.println(cities.get(i));

            // Constructing the HashMap
            // Checking if the key already exists in the Map
            boolean isKeyExist = map.containsKey(cities.get(i).countryCode);

            if (isKeyExist == true) {
                map.get(cities.get(i).countryCode).add(cities.get(i).cityName);
            } else {
                List<Integer> popList = new ArrayList<>();
                List<String> newList = new ArrayList<>();

                newList.add(cities.get(i).cityName);
                map.put(cities.get(i).countryCode, newList);
                popList.add(cities.get(i).population);
            }
        }

        System.out.println("Country codes Map:");
        Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry pair = (Map.Entry)it.next();
            System.out.println(pair.getKey() + " = " + pair.getValue());
            it.remove(); // avoids a ConcurrentModificationException
        }
    }
}