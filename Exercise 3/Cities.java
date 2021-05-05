import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Cities {
    public Cities() {
    }
    public List<City> readCitiesFromtxt(String fileName){

        List<City> cities = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(fileName))){

            String line = br.readLine();
            // read first line
            if (line != null) {
                line = br.readLine(); // the first real data
            }

        while (line != null) {
            String[] attributes = line.split(",");
            //System.out.println(Arrays.toString(attributes));
            City city=createCity(attributes);

            cities.add (city);
            line = br.readLine();
        }
        }  catch (IOException ioe) {
            ioe.printStackTrace();
        }
        return cities;
    }

    public City createCity(String[] metadata) {
        int code = 0;
        String cityName = metadata[1];
        int population = 0;
        String countryCode= metadata[3];

        if(metadata[0]!=null && metadata[0].length()>0)
            code= Integer.parseInt(metadata[0].trim());

        if(metadata[2]!=null && metadata[2].length()>0)
            population= Integer.parseInt(metadata[2].trim());

        // create and return Pyramid of this metadata
        return new City(code, cityName, population, countryCode);
    }
}