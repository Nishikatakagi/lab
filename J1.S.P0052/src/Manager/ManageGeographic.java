package Manager;

import Object.Country;
import java.util.ArrayList;

public class ManageGeographic extends ArrayList<Country>{

    public ManageGeographic SearchCountryByName(String name) {
        ManageGeographic MC = new ManageGeographic();
        for (Country country : this) {
            if (name.equalsIgnoreCase(country.getCountryName())) {
                MC.add(country);
            }
        }
        return MC;
    }

    public void showAllCountry() {
        for (Country country : this) {
            country.display();
            System.out.println("");
        }
    }

    public void sortedByName() {
        for (int i = 0; i < this.size() - 1; i++) {
            for (int j = 0; j < this.size() - 1 - i; j++) {
                if (this.get(j).getCountryName().compareTo(this.get(j + 1).getCountryName()) > 0) {
                    Country temp = this.get(j);
                    this.set(j, this.get(j + 1));
                    this.set(j + 1, temp);
                }
            }
        }
    }

    public int IndexCountryByName(String name) {
        for (int i = 0; i < this.size(); i++) {
            if (name.equalsIgnoreCase(this.get(i).getCountryName())) {
                return i;
            }
        }
        return 0;
    }
}
