package lk.ijse.gdse.aad.cw.vishmi.cw_backend.controller;

import lk.ijse.gdse.aad.cw.vishmi.cw_backend.dto.PackageDTO;
import lk.ijse.gdse.aad.cw.vishmi.cw_backend.service.PackageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping(value = "api/v1/package")
@CrossOrigin
public class packageController {
    @Autowired
   private PackageService packageService;

    @GetMapping("/getPackage")
    public List<PackageDTO> getPackage(){
        return packageService.getAllPackages();
    }

    @PostMapping("/savePackage")
    public PackageDTO savePackage(@RequestBody PackageDTO packageDTO){
        return packageService.savePackage(packageDTO);
    }

    @PutMapping("/updatePackage")
    public PackageDTO updatePackage(@RequestBody PackageDTO packageDTO){
        return packageService.updatePackage(packageDTO);
    }

    @DeleteMapping("/deletePackage")
    public boolean deletePackage(@RequestBody PackageDTO packageDTO){
        return packageService.deletePackage(packageDTO);
    }

   /* @GetMapping("/getPackageByPackageId/{packageId}")
    public PackageDTO getPackageByPackageId(@PathVariable String packageId){
        return packageService.getPackageByPackageId(packageId);
    }*/

   /* @GetMapping("/getPackageByPackageIdAndType/{packageId}/{type}")
    public PackageDTO getPackagerByPackageIdAndType(@PathVariable String packageId,@PathVariable String type){
        System.out.println("UserId :" + userId + "Type :" + type);
        return packageService.getPackageByPackageIdAndType(packageId,type);
    }*/


}
