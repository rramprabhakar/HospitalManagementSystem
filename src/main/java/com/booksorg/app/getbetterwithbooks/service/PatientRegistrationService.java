package com.booksorg.app.getbetterwithbooks.service;


import com.booksorg.app.getbetterwithbooks.dto.PatientVO;
import com.booksorg.app.getbetterwithbooks.enums.RegistrationStatus;

public interface PatientRegistrationService {

    public String saveRegistration(PatientVO patientVO, RegistrationStatus status);

}
