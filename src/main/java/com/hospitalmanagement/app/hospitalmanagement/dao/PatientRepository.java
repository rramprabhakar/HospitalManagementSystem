package com.hospitalmanagement.app.hospitalmanagement.dao;


import com.hospitalmanagement.app.hospitalmanagement.domain.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PatientRepository extends JpaRepository<Patient,Long> {


}
