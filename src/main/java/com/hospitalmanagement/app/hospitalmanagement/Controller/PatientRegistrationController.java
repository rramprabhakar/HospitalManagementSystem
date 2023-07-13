package com.hospitalmanagement.app.hospitalmanagement.Controller;

import com.hospitalmanagement.app.hospitalmanagement.dto.PatientVO;
import com.hospitalmanagement.app.hospitalmanagement.service.PatientRegistrationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


/***
 *
 */
@RestController
public class PatientRegistrationController {

    @Autowired
    PatientRegistrationService patientregistrationService;

    /***
     *
     * @param patientVO
     * @return
     */
    @PostMapping(value = "/patientRegistration")
    public String register(@RequestBody final PatientVO patientVO){


           return patientregistrationService.saveRegistration(patientVO,"hello");

    }
}
