package com.shubhangi.cardatabase.domain;

import org.springframework.data.repository.PagingAndSortingRepository;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
public class Owner {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long ownerId;
    private String firstName, lastName;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "owner") //default fetch type
    private List<Car> cars;

    public Owner(String firstName, String lastName) {
        super();
        this.firstName = firstName;
        this.lastName = lastName;
    }
    public Owner() {
        super();
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public List<Car> getCars() {
        return cars;
    }

    public void setCars(List<Car> cars) {
        this.cars = cars;
    }
}
