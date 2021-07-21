package com.sunil.unique.comparator;

import java.util.Comparator;

import com.sunil.unique.dto.KitchenDTO;

public class KitchenByPriceComparator implements Comparator<KitchenDTO>{

	@Override
	public int compare(KitchenDTO o1, KitchenDTO o2) {
		
		Double price1 = o1.getPrice();
		Double price2 = o2.getPrice();
		
		return price1.compareTo(price2);
	}

}
