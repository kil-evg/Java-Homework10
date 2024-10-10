package ait.car;

import ait.car.dto.CarDto;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CarCreationAppl {
    private static ObjectMapper mapper = new ObjectMapper();

    public static void main(String[] args) throws IOException {
        //List<String> models = List.of("Laguna", "Megan", "Clio");
        //CarDto carDto = new CarDto("Renault", 2020, models);
        CarDto carDto = CarDto.builder()
                .manufacturer("Renault")
                .year(2020)
                .model("Laguna")
        .model("Clio")
               // .models(models)
                .build();
        mapper.writeValue(new File("car.json"), carDto);
    }
}
