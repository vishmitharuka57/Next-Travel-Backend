package lk.ijse.gdse.aad.coursework.coursework.controller;

import lk.ijse.gdse.aad.coursework.coursework.dto.VehicleDTO;
import lk.ijse.gdse.aad.coursework.coursework.service.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "api/v1/vehicles")
@CrossOrigin
public class VehicleController {
    @Autowired
    private VehicleService vehicleService;

    @PostMapping("/saveVehicle")
    public VehicleDTO saveVehicle(@RequestBody VehicleDTO vehicleDTO){
        return vehicleService.saveVehicle(vehicleDTO);
    }

    @GetMapping("/getVehicle")
    public List<VehicleDTO> getVehicle(){
        return vehicleService.getAllVehicles();
    }
    @PutMapping("/updateVehicle")
    public VehicleDTO updateVehicle(@RequestBody VehicleDTO vehicleDTO){
        return vehicleService.updateVehicle(vehicleDTO);
    }

    @DeleteMapping("/deleteVehicle")
    public boolean deleteVehicle(@RequestBody VehicleDTO vehicleDTO){
        return vehicleService.deleteVehicle(vehicleDTO);
    }


}
