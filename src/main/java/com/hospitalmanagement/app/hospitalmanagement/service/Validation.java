package com.hospitalmanagement.app.hospitalmanagement.service;
import com.hospitalmanagement.app.hospitalmanagement.dto.PatientVO;

import java.util.ArrayList;
import java.util.List;

public class Validation {

    public static List<String> doValidation(PatientVO p) {
        List<String> errorMessages = new ArrayList<>();
        if (p.getName() == null) {
            errorMessages.add("name is null");
        }
        if (p.getFatherName() == null) {
            errorMessages.add("enter father name");
        }
        if (p.getMobileNum() == null) {
            errorMessages.add("enter mobile number");
        }
        if (p.getDob() == null) {
            errorMessages.add("enter dob");
        }
        if (p.getGender() == null) {
            errorMessages.add("enter gender");
        }
        if (p.getMaritalStatus() == null) {
            errorMessages.add("enter marital status");
        }
        if (p.getBloodGroup() == null) {
            errorMessages.add("enter bloodgroup");
        }
        if (p.getType() == null) {
            errorMessages.add("enter type of patient");
        }
        return errorMessages;
    }
}
