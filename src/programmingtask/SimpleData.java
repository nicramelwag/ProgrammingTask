/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programmingtask;

/**
 *
 * @author Marcin
 */
public class SimpleData {
    public String Country;
    public String City;

    public SimpleData(String Country, String City) {
        this.Country = Country;
        this.City = City;
    }
    
    

    public String getCountry() {
        return Country;
    }

    public String getCity() {
        return City;
    }

    public void setCountry(String Country) {
        this.Country = Country;
    }

    public void setCity(String City) {
        this.City = City;
    }

    @Override
    public String toString() {
        return "SimpleData{" + "Country=" + Country + ", City=" + City + '}';
    }
    
    
}
