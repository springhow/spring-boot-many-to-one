package com.springhow.examples.jpa.domain.repositories;

import com.springhow.examples.jpa.domain.entities.Account;
import com.springhow.examples.jpa.domain.entities.Branch;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BranchRepository extends JpaRepository<Branch, Integer> {

    Branch findBranchById(Integer id);

}
