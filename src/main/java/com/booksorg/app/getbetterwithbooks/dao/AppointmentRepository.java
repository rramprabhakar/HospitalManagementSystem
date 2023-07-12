package com.booksorg.app.getbetterwithbooks.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.booksorg.app.getbetterwithbooks.domain.Patient;

@Repository
public interface AppointmentRepository extends JpaRepository<Patient,Long> {
}
