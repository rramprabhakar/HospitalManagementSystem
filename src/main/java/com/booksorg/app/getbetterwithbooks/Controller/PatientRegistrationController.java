package com.booksorg.app.getbetterwithbooks.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.booksorg.app.getbetterwithbooks.dto.PatientVO;
import com.booksorg.app.getbetterwithbooks.enums.RegistrationStatus;
import com.booksorg.app.getbetterwithbooks.service.PatientRegistrationService;


/***
 *
 */
@RestController
public class PatientRegistrationController {

    @Autowired
    PatientRegistrationService patientRegistrationService;

    /***
     *
     * @param patientVO
     * @return
     */
    @PostMapping(value = "/patientRegistration")
    public String register(@RequestBody final PatientVO patientVO){


           return patientRegistrationService.saveRegistration(patientVO, RegistrationStatus.REGISTER);

    }
    @GetMapping(value = "/hello")
    public String getHello(){


        return "hello";

    }
}
