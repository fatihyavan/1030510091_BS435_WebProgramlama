package org.webp.entity;

import javax.persistence.*;

@Table(name = "Doctor")
@Entity
public class Doctor {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    @Column(name = "Name",length = 20)
    private String name;

    @Column(name = "Salary")
    private Integer salary;

    @OneToMany
    private Patient patient;

    public Doctor(){
    }

    public Doctor(String name, Integer salary) {
        this.name = name;
        this.salary = salary;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }
}