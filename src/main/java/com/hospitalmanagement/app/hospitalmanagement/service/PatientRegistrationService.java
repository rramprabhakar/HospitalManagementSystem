package com.hospitalmanagement.app.hospitalmanagement.service;


import com.hospitalmanagement.app.hospitalmanagement.dto.PatientVO;

public interface PatientRegistrationService {

    public String saveRegistration(PatientVO patientVO, String status);

}
