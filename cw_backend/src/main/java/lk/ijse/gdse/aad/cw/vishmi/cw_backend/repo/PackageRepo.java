package lk.ijse.gdse.aad.cw.vishmi.cw_backend.repo;


import lk.ijse.gdse.aad.cw.vishmi.cw_backend.entity.Package;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.net.UnknownServiceException;

public interface PackageRepo extends JpaRepository<Package,String> {
@Query("SELECT *FROM User Where id=?1")

}
