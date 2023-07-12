package com.booksorg.app.getbetterwithbooks.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.booksorg.app.getbetterwithbooks.dao.PatientRepository;
import com.booksorg.app.getbetterwithbooks.domain.Patient;
import com.booksorg.app.getbetterwithbooks.dto.PatientVO;
import com.booksorg.app.getbetterwithbooks.enums.RegistrationStatus;

import javax.transaction.Transactional;

import static com.booksorg.app.getbetterwithbooks.service.Validation.doValidation;

import java.util.List;


@Transactional
@Service
public class PatientRegistrationServiceImpl implements PatientRegistrationService {

    @Autowired
    private PatientRepository patientRepository;

    public String saveRegistration(PatientVO patientVO, RegistrationStatus status) {

        List<String> errorMessages = Validation.doValidation(patientVO);
        Patient patient = new Patient();
        BeanUtils.copyProperties(patientVO, patient);
        if (errorMessages.isEmpty()) {
            try {
                patientRepository.save(patient);

            } catch (Exception ex) {
                System.out.println("exception");
            }
        } else {
            return "invalid patient info" + errorMessages;
        }
        return null;
    }
}
