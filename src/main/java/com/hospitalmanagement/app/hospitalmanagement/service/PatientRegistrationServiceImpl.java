package com.hospitalmanagement.app.hospitalmanagement.service;

import com.hospitalmanagement.app.hospitalmanagement.dao.PatientRepository;
import com.hospitalmanagement.app.hospitalmanagement.domain.Patient;
import com.hospitalmanagement.app.hospitalmanagement.dto.PatientVO;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

import java.util.List;

import static com.hospitalmanagement.app.hospitalmanagement.service.Validation.doValidation;


@Transactional
@Service
public class PatientRegistrationServiceImpl implements PatientRegistrationService {

    @Autowired
    private PatientRepository patientRepository;

    public String saveRegistration(PatientVO patientVO, String status) {

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
