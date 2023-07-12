package com.booksorg.app.getbetterwithbooks.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.booksorg.app.getbetterwithbooks.domain.Patient;

@Repository
public interface Patientrepository extends JpaRepository<Patient,Long> {




}
