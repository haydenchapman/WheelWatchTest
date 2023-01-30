package com.haydenchapman.wheelwatch.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.haydenchapman.wheelwatch.dtos.TireDto;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "Tires")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Tires {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "diameter")
    private Integer diameter;

    @Column(name = "width")
    private Double width;

    @Column(name = "aspectRatio")
    private Integer aspectRatio;

    @Column(name = "tireType")
    private String tireType;

    @Column(name = "brand")
    private String brand;

    @Column(name = "model")
    private String model;

    @Column(name = "price")
    private Double price;

    public Tires(TireDto tireDto){
        if(tireDto.getDiameter() != null){
            this.diameter = tireDto.getDiameter();
        }

        if(tireDto.getWidth() != null){
            this.width = tireDto.getWidth();
        }

        if(tireDto.getAspectRatio() != null){
            this.aspectRatio = tireDto.getAspectRatio();
        }

        if(tireDto.getTireType() != null){
            this.tireType = tireDto.getTireType();
        }
    }
    @ManyToOne
    @JsonBackReference
    private User user;
}
