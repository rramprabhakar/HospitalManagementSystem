package com.hospitalmanagement.app.hospitalmanagement.service;


import com.hospitalmanagement.app.hospitalmanagement.dto.PatientVO;

public interface AppointmentService {

    public String savePatientRegistration(PatientVO patient, String status);
}
