package com.hadday.gestion_commission.repositories;

import com.hadday.gestion_commission.entities.CategorieFees;
import com.hadday.gestion_commission.entities.FeeType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FeeTypeRepository extends JpaRepository<FeeType, Long> {
    public FeeType findFeeTypeByTypeName(String name);

    public List<FeeType> findFeeTypesByCategorieFees(CategorieFees categorieFees);

    public List<FeeType> findFeeTypesByDeletedIsFalse();
}
