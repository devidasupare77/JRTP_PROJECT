package com.tcs.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tcs.entity.Plan;

public interface PlanRepo extends JpaRepository<Plan, Integer> {

}
