package com.github.ludmilareis.citiesapi.countries.repository;

import com.github.ludmilareis.citiesapi.countries.entities.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {
}
