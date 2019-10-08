package com.example.netflix.models;

import jdk.nashorn.internal.objects.annotations.Getter;
import jdk.nashorn.internal.objects.annotations.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id", updatable = false)
    private Long id;

    @Column(name = "name")
    @NotNull
    private String name;

    @Column(name = "id_number", unique = true)
    @NotNull
    private Long idNumber;

    @CreationTimestamp
    private Date created_at;

    @UpdateTimestamp
    private  Date updated_at;

    public User(String name, Long idNumber) {
        this.name = name;
        this.idNumber = idNumber;
    }

    public User() {
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Long getIdNumber() {
        return idNumber;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setIdNumber(Long idNumber) {
        this.idNumber = idNumber;
    }

    public Date getCreated_at() {
        return created_at;
    }

    public void setCreated_at(Date created_at) {
        this.created_at = created_at;
    }

    public Date getUpdated_at() {
        return updated_at;
    }

    public void setUpdated_at(Date updated_at) {
        this.updated_at = updated_at;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", idNumber=" + idNumber +
                ", created_at=" + created_at +
                ", updated_at=" + updated_at +
                '}';
    }
}
