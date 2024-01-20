package lk.ijse.gdse.aad.cw.vishmi.cw_backend.service;

import jakarta.transaction.Transactional;
import lk.ijse.gdse.aad.cw.vishmi.cw_backend.dto.PackageDTO;
import lk.ijse.gdse.aad.cw.vishmi.cw_backend.entity.Package;
import lk.ijse.gdse.aad.cw.vishmi.cw_backend.repo.PackageRepo;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
@Transactional
public class PackageService {
    @Autowired
    private PackageRepo packageRepo;

    @Autowired
    private ModelMapper modelMapper;

   public PackageDTO savePackage(PackageDTO packageDTO){
       packageRepo.save(modelMapper.map(packageDTO, Package.class));
       return packageDTO;
   }

    public List<PackageDTO> getAllPackages(){
        List<Package> packageList =packageRepo.findAll();
        return modelMapper.map(packageList,new TypeToken<List<PackageDTO>>(){}.getType());
    }

    public PackageDTO updatePackage(PackageDTO packageDTO){
        packageRepo.save(modelMapper.map(packageDTO , Package.class));
        return packageDTO;
    }

    public boolean deletePackage(PackageDTO packageDTO){
        packageRepo.delete(modelMapper.map(packageDTO , Package.class));
        return true;
    }


    /* public PackageDTO getPackageByPackageId(String packageId){
        Package package = packageRepo.getPackageByPackageId(packageId);
        return  modelMapper.map(package,PackageDTO.class);
    }*/
    /*

    public PackageDTO getPackageByPackageIdAndType(String packageId,String type){
        Package package = packageRepo.getPackageByPackageIdAndType(packageId,type);
        return  modelMapper.map(package,PackageDTO.class);
    }
*/




}
