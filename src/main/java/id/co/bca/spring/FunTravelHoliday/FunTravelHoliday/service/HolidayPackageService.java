package id.co.bca.spring.FunTravelHoliday.FunTravelHoliday.service;

import id.co.bca.spring.FunTravelHoliday.FunTravelHoliday.repository.HolidayPackageSDJRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HolidayPackageService {

    @Autowired
    HolidayPackageSDJRepository holidayPackageSDJRepository;
}
