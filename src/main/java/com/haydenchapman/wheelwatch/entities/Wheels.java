package com.haydenchapman.wheelwatch.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.haydenchapman.wheelwatch.dtos.WheelDto;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "Wheels")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Wheels {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "diameter")
    private Integer diameter;

    @Column(name = "width")
    private Double width;

    @Column(name = "offset")
    private Integer offset;

    @Column(name = "brand")
    private String brand;

    @Column(name = "model")
    private String model;

    @Column(name = "material")
    private String material;

    @Column(name = "finish")
    private String finish;

    @Column(name = "boltPattern")
    private Float boltPattern;

    public Wheels(WheelDto wheelDto){
        if (wheelDto.getDiameter() != null){
            this.diameter = wheelDto.getDiameter();
        }

        if (wheelDto.getWidth() != null){
            this.width = wheelDto.getWidth();
        }

        if(wheelDto.getOffset() != null){
            this.offset = wheelDto.getOffset();
        }

        if(wheelDto.getBrand() != null){
            this.brand = wheelDto.getBrand();
        }

        if(wheelDto.getModel() != null){
            this.model = wheelDto.getModel();
        }

        if(wheelDto.getMaterial() != null){
            this.material = wheelDto.getMaterial();
        }

        if(wheelDto.getBoltPattern() != null){
            this.boltPattern = wheelDto.getBoltPattern();
        }
    }
    @ManyToOne
    @JsonBackReference
    private User user;
}
