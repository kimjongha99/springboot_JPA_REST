package com.apiex.api01.repository;

import com.apiex.api01.domain.APIUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface APIUserRepository extends JpaRepository<APIUser,String > {

}
