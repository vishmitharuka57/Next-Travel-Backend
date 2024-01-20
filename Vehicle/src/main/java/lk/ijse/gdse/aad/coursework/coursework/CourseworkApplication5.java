package lk.ijse.gdse.aad.coursework.coursework;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CourseworkApplication5 {

    public static void main(String[] args) {
        SpringApplication.run(CourseworkApplication5.class, args);
    }

    @Bean
    public ModelMapper modelMapper(){
        return new ModelMapper();
    }


}
