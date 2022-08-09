package com.anderson.email.repositories;

import com.anderson.email.models.Email;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmailRepository extends JpaRepository<Email,Long> {
}
