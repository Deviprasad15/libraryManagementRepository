package com.kcdc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kcdc.entity.LibraryStaffDetails;

@Repository
public interface AdminRepository extends JpaRepository<LibraryStaffDetails,String> {

}
