package lk.ijse.gdse.aad.cw.vishmi.cw_backend.controller;

import lk.ijse.gdse.aad.cw.vishmi.cw_backend.dto.PackageDTO;
import lk.ijse.gdse.aad.cw.vishmi.cw_backend.service.PackageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "api/v1/packages")
@CrossOrigin
public class packageController {
    @Autowired
    private PackageService packageService;

    @PostMapping("/savePackage")
    public PackageDTO savePackage (@RequestBody PackageDTO packageDTO){
        return packageService.savePackage(packageDTO);
    }

    @GetMapping("/getPackage")
    public List<PackageDTO> getPackage(){
        return packageService.getAllPackages();
    }

    @PutMapping("/updatePackage")
    public PackageDTO updatePackage(@RequestBody PackageDTO packageDTO){
        return packageService.updatePackage(packageDTO);
    }

    @DeleteMapping("/deletePackage")
    public boolean deletePackage (@RequestBody PackageDTO packageDTO){
        return packageService.deletePackage(packageDTO);
    }

}
