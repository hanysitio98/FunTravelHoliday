package id.co.bca.spring.FunTravelHoliday.FunTravelHoliday.repository;

import id.co.bca.spring.FunTravelHoliday.FunTravelHoliday.model.Packages;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface HolidayPackageSDJRepository extends JpaRepository<Packages, Integer> {

    Packages findPackagesById(Integer aInteger);
    List<Packages> findAllByOrderByHolidayPackage();
}
