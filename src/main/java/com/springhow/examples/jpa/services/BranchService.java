package com.springhow.examples.jpa.services;

import com.springhow.examples.jpa.domain.entities.Branch;
import com.springhow.examples.jpa.domain.repositories.BranchRepository;
import org.springframework.stereotype.Service;

@Service
public class BranchService {

    private final BranchRepository branchRepository;

    public BranchService(BranchRepository branchRepository) {

        this.branchRepository = branchRepository;
    }

    public Branch getBranch(Integer id) {
        return branchRepository.findBranchById(id);
    }
}
