package ait.car.dto;

import lombok.*;

import java.util.List;
import java.util.Set;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@ToString
@Builder
public class CarDto {
    private String manufacturer;
    private int year;
    @Singular
    private Set<String> models;
   // private List<String> models;


}
