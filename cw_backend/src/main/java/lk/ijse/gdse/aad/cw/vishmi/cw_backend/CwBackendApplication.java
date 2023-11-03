package lk.ijse.gdse.aad.cw.vishmi.cw_backend;



@SpringBootApplication
public class CwBackendApplication {

    public static void main(String[] args) {
        SpringApplication.run(CwBackendApplication.class, args);
    }

    @Bean
    public ModelMapper modelMapper(){
        return new ModelMapper();
    }

}
