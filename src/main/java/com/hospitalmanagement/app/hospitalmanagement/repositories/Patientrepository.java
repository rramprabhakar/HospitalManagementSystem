package com.hospitalmanagement.app.hospitalmanagement.repositories;


import com.hospitalmanagement.app.hospitalmanagement.domain.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Patientrepository extends JpaRepository<Patient,Long> {




}
