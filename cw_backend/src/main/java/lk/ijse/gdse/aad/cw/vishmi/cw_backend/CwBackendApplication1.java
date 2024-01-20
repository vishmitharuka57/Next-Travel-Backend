package lk.ijse.gdse.aad.cw.vishmi.cw_backend;


import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableDiscoveryClient
public class CwBackendApplication1 {

    public static void main(String[] args) {
        SpringApplication.run(CwBackendApplication1.class, args);
    }

    @Bean
    public ModelMapper modelMapper(){
        return new ModelMapper();
    }

}
