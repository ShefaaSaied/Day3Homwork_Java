public class City {
    int code;
    String cityName;
    int population;
    String countryCode;

    public City ( int code, String cityName, int population, String countryCode) {
        // assign parameters to constructor attributes
        this.code = code;
        this.cityName= cityName;
        this.population= population;
        this.countryCode= countryCode;
    }
    @Override
    public String toString() {
        return "City{" + "Code=" + code + ", City_Name=" + cityName + ", Population=" + population + ", Country_Code=" + countryCode + '}';
    }

    public int getCode() { return code; }
    public void setCode(int code) { this.code = code; }

    public String getCityName (){ return cityName; }
    public void setCityName (String cityName){ this.cityName= cityName; }

    public int getPopulation (){ return population; }
    public void setPopulation (int population){ this.population= population;}

    public String getCountryCode (){ return countryCode; }
    public void setCountryCode (String countryCode){ this.countryCode= countryCode;}
}