package pl.company.model;

import javax.persistence.*;

@Entity
@Table(name = "customers")
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String surname;

    private String city;

    private String street;

    private int phoneNumber;

    private String email;

    private String additionalInfo;

    public Customer() {

    }

    public Customer(String name, String surname, String city, String street, int phoneNumber, String email, String additionalInfo) {

        this.name = name;
        this.surname = surname;
        this.city = city;
        this.street = street;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.additionalInfo = additionalInfo;
    }

    public Long getId() {

        return id;
    }

    public void setId(Long id) {

        this.id = id;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public String getSurname() {

        return surname;
    }

    public void setSurname(String surname) {

        this.surname = surname;
    }

    public String getCity() {

        return city;
    }

    public void setCity(String city) {

        this.city = city;
    }

    public String getStreet() {

        return street;
    }

    public void setStreet(String street) {

        this.street = street;
    }

    public int getPhoneNumber() {

        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {

        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {

        return email;
    }

    public void setEmail(String email) {

        this.email = email;
    }

    public String getAdditionalInfo() {

        return additionalInfo;
    }

    public void setAdditionalInfo(String additionalInfo) {

        this.additionalInfo = additionalInfo;
    }

}
