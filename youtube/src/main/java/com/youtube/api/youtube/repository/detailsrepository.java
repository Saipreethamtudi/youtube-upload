package com.youtube.api.youtube.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.youtube.api.youtube.Entity.Employee;

@Repository
public interface detailsrepository extends JpaRepository< Employee, Long> {

}
