package com.dev.api.entity;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table
@JsonIgnoreProperties(ignoreUnknown = true)
public class Character {
    @Id
    private Long id;
    @Column
    private String name;
    @Column
    private String birth_year;
    @Column
    private String gender;
    @Column
    private String hair_color;
    @Column
    private String eye_color;
    @Column
    private String height;
    @Column
    private String homeworld;
    @Column
    private String mass;
    @Column
    private String skinColor;
    @Column
    private String created;
    @Column
    private String edited;
    @Column
    private String url;



}
