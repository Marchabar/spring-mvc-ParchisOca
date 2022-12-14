package com.ling1.springmvc.player;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

import com.ling1.springmvc.model.NamedEntity;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "colors")
public class PlayerColor extends NamedEntity {
    
    @Column(unique=true, nullable = false)
    @NotEmpty
    private String rgb;
}


