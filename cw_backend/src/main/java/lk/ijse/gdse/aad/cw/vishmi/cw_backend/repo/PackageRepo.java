package lk.ijse.gdse.aad.cw.vishmi.cw_backend.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface PackageRepo extends JpaRepository<Package,String> {
  /*  @Query(value = "SELECT * FROM PACKAGE WHERE packageId = ?1",nativeQuery = true)
    Package getPackageByPackageId(String packageId);

    @Query(value = "SELECT * FROM PACKAGE WHERE packageId =?1 AND type =?2" , nativeQuery = true)
    Package getPackageByPackageIdAndType(String packageId , String type);
*/


}
