package com.github.ludmilareis.citiesapi.states.repository;


import com.github.ludmilareis.citiesapi.states.entities.State;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StateRepository extends JpaRepository<State, Long> {
}