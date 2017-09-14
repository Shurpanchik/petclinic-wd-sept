package ru.pflb.wd;

import java.util.Random;

import static com.sun.xml.internal.ws.util.StringUtils.capitalize;
import static org.apache.commons.lang3.RandomStringUtils.randomAlphabetic;
import static org.apache.commons.lang3.RandomStringUtils.randomNumeric;

public class Owner {
   private String firstName;
   private String lastName ;
   private String address ;
   private String city ;
   private String telephone;

   public Owner(){
       firstName = capitalize(randomAlphabetic(4 + new Random().nextInt(5)));
       lastName = capitalize(randomAlphabetic(4 + new Random().nextInt(5)));
       address = capitalize(randomAlphabetic(4 + new Random().nextInt(5)));
       city = capitalize(randomAlphabetic(4 + new Random().nextInt(5)));
       telephone = capitalize(randomNumeric(1 + new Random().nextInt(10)));
   }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getAddress() {
        return address;
    }

    public String getCity() {
        return city;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }
}
