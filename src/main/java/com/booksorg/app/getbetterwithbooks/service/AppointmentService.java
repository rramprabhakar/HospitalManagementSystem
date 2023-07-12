package com.booksorg.app.getbetterwithbooks.service;


import com.booksorg.app.getbetterwithbooks.dto.PatientVO;

public interface AppointmentService {

    public String savePatientRegistration(PatientVO patient, String status);
}
