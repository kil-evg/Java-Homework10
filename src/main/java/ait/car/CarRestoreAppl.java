package ait.car;

import ait.car.dto.CarDto;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class CarRestoreAppl {
    private  static ObjectMapper mapper = new ObjectMapper();
    public static void main(String[] args) throws IOException {
        CarDto carDto = mapper.readValue(new File("car.json"), CarDto.class);
        System.out.println(carDto);
    }
}
