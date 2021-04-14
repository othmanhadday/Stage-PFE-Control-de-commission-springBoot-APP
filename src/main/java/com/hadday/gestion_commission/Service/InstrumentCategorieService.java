package com.hadday.gestion_commission.Service;

import com.hadday.gestion_commission.entities.InstrumentCategorie;

import java.util.List;

public interface InstrumentCategorieService {

    public InstrumentCategorie getCategorieRateById(Long id);

    public List<InstrumentCategorie> getCategorieRates();

    public InstrumentCategorie createUpdateCategorieRate(InstrumentCategorie instrumentCategorie);

    public InstrumentCategorie deleteCategorieRate(Long id);

    public List<InstrumentCategorie> getInstrumentCatByInstrumentType(Long id);

}
