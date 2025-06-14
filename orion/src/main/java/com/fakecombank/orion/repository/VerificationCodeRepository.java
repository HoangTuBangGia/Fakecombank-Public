package com.fakecombank.orion.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fakecombank.orion.model.VerificationCode;

public interface VerificationCodeRepository extends JpaRepository<VerificationCode, Long> {
    public VerificationCode findByUserId(Long userId);
}
