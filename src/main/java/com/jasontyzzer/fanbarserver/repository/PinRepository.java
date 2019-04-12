package com.jasontyzzer.fanbarserver.repository;

import com.jasontyzzer.fanbarserver.model.Pin;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PinRepository extends JpaRepository<Pin, Long> {
}
