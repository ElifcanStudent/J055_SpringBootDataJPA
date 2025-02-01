package com.elifcan.j055_springbootdatajpa.repository;

import com.elifcan.j055_springbootdatajpa.entity.UserProfile;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Interfaceler new() lenebilir mi?
 * HAYIR!!! Construsterları yoktur
 */

public interface UserProfileRepository extends JpaRepository<UserProfile, Long> {
}
