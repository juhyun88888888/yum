package com.example.yum.food;

import com.example.yum.category.Category;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
public class Food {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String foodName;

    private List<String> material;

    @OneToOne
    private Category category;

}
