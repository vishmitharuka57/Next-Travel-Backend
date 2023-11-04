package lk.ijse.gdse.aad.coursework.coursework.service;

import jakarta.transaction.Transactional;
import lk.ijse.gdse.aad.coursework.coursework.dto.VehicleDTO;
import lk.ijse.gdse.aad.coursework.coursework.entity.Vehicle;
import lk.ijse.gdse.aad.coursework.coursework.repo.VehicleRepo;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import java.util.List;

@Service
@Transactional
public class VehicleService {
    @Autowired
    private VehicleRepo vehicleRepo;

    @Autowired
    private ModelMapper modelMapper;

    public VehicleDTO saveVehicle(VehicleDTO vehicleDTO){
        vehicleRepo.save(modelMapper.map(vehicleDTO , Vehicle.class));
        return vehicleDTO;
    }

    public List<VehicleDTO> getAllVehicles(){
        List<Vehicle>vehicleList=vehicleRepo.findAll();
        return modelMapper.map(vehicleList,new TypeToken<List<VehicleDTO>>(){}.getType());
    }

    public VehicleDTO updateVehicle(VehicleDTO vehicleDTO){
        vehicleRepo.save(modelMapper.map(vehicleDTO,Vehicle.class));
        return vehicleDTO;
    }

    public boolean deleteVehicle(VehicleDTO vehicleDTO){
        vehicleRepo.delete(modelMapper.map(vehicleDTO,Vehicle.class));
        return true;
    }

}
