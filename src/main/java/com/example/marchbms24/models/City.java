package com.example.marchbms24.models;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Data
@Entity
public class City extends BaseModel{
    private String name;
    @OneToMany
    private List<Screen> screens;

}