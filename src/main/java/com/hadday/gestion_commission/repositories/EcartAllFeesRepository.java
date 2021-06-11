package com.hadday.gestion_commission.repositories;


import com.hadday.gestion_commission.entities.AllFees;
import com.hadday.gestion_commission.entities.AllFeesGenerated;
import com.hadday.gestion_commission.entities.EcartAllFees;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;

@Repository
public
interface EcartAllFeesRepository extends JpaRepository<EcartAllFees, Long> {

    public boolean existsEcartAllFeesByAllFees(AllFees allFees);

    public boolean existsEcartAllFeesByAllFeesGenerated(AllFeesGenerated allFeesGenerated);

    public Page<EcartAllFees> findEcartAllFeesByDeletedIsFalse(Pageable pageable);

    public Page<EcartAllFees> findEcartAllFeesByDeletedIsFalseAndDateBetween(Pageable pageable, Date date, Date date2);

    public EcartAllFees findEcartAllFeesById(Long id);

}
