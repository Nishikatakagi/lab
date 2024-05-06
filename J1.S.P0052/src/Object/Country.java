package Object;

import Manager.Validation;
import java.util.ArrayList;

public class Country extends EastAsiaCountries{
    private String countryTerrain;

    public Country() {
    }

    public Country(String countryTerrain) {
        this.countryTerrain = countryTerrain;
    }

    public Country(String countryTerrain, String countryCode, String countryName, float totalArea) {
        super(countryCode, countryName, totalArea);
        this.countryTerrain = countryTerrain;
    }

    public String getCountryTerrain() {
        return countryTerrain;
    }

    public void setCountryTerrain(String countryTerrain) {
        this.countryTerrain = countryTerrain;
    }
    
    @Override
    public void display(){
                System.out.printf("%-15s%-15s%-15f%-10s",getCountryCode(),getCountryName(),getTotalArea(),getCountryTerrain());
    }
    
    public void input(ArrayList<Country> list){
        setCountryCode(Validation.getCode("Enter code of country: ", list));
        setCountryName(Validation.getString("Enter name of country: "));
        setTotalArea(Validation.getDouble("Enter total Area: "));
        setCountryTerrain(Validation.getString("Enter terrain of country: "));
    }
}
