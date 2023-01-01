package Ex_17_20;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Objects;

public class Addresses implements Serializable {
    
    public String name;
    public String street;
    public String city;
    public String state;
    public String zip;

    public Addresses(String name, String street, String city, String state, String zip) {
        this.name = name.trim();
        this.street = street.trim();
        this.city = city.trim();
        this.state = state.trim();
        this.zip = zip;
    }


    public Addresses() {
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStreet() {
        return this.street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return this.city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return this.state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZip() {
        return this.zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public Addresses name(String name) {
        setName(name);
        return this;
    }

    public Addresses street(String street) {
        setStreet(street);
        return this;
    }

    public Addresses city(String city) {
        setCity(city);
        return this;
    }

    public Addresses state(String state) {
        setState(state);
        return this;
    }

    public Addresses zip(String zip) {
        setZip(zip);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Addresses)) {
            return false;
        }
        Addresses addresses = (Addresses) o;
        return Objects.equals(name, addresses.name) && Objects.equals(street, addresses.street) && Objects.equals(city, addresses.city) && Objects.equals(state, addresses.state) && zip == addresses.zip;
    }

    @Override
    public String toString() {
        return
            " name='" + getName() + "'" +
            ", street='" + getStreet() + "'" +
            ", city='" + getCity() + "'" +
            ", state='" + getState() + "'" +
            ", zip='" + getZip() + "'";
    }

        
       static int search(ArrayList<Addresses> a, String nameToSearch) {
        // Linear Search to check if name is already in the list

        for(int i = 0; i < a.size(); i++) {
            
            if(nameToSearch.toUpperCase().trim().equals(a.get(i).getName().toUpperCase())) {
                return 0;
            }
        }

            return -1;

       }


    
}
