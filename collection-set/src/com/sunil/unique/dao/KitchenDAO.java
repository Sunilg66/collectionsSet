package com.sunil.unique.dao;

import java.util.Collection;

import com.sunil.unique.dto.KitchenDTO;

public interface KitchenDAO {
	
	boolean saveUnique(KitchenDTO dto);
	
	Collection<KitchenDTO> findAllSortByUsedFor();
	
	Collection<KitchenDTO> findAllSortByUsedForDesc();
	
	Collection<KitchenDTO> findAllSortByName();
	
	//Collection<KitchenDTO> findAllSortByPriceDesc();

}
