package com.sunil.unique.dao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import com.sunil.unique.dto.KitchenDTO;

public class KitchenDAOImpl implements KitchenDAO{
	
	private List<KitchenDTO> list = new ArrayList<KitchenDTO>();

	@Override
	public boolean saveUnique(KitchenDTO dto) {
		boolean added = list.add(dto);
		System.out.println("dto : " + dto);
		System.out.println("dto added : " + added);
		
		return added;
	}

	@Override
	public Collection<KitchenDTO> findAllSortByUsedFor() {
		Collection<KitchenDTO> coll = new ArrayList<KitchenDTO>();
		Iterator<KitchenDTO> dt = this.list.iterator();
		while(dt.hasNext()) {
			KitchenDTO usedfor = dt.next();
			coll.add(usedfor);
		}
	
		return coll;
	}

	@Override
	public Collection<KitchenDTO> findAllSortByUsedForDesc() {
		Collection<KitchenDTO> desc = new ArrayList<KitchenDTO>();
		Iterator<KitchenDTO> dto = this.list.iterator();
		while(dto.hasNext()) {
			KitchenDTO usedfor = dto.next();
			desc.add(usedfor);
		}
		
		return desc;
	}

	@Override
	public Collection<KitchenDTO> findAllSortByName() {
		Iterator<KitchenDTO> byname = this.list.iterator();
		Collection<KitchenDTO> dt= new ArrayList<KitchenDTO>();
		while(byname.hasNext()) {
			KitchenDTO sortbyname = byname.next();
			System.out.println("sort by name : " + sortbyname.getName());
		}
		
		return dt;
	}

	/*@Override
	public Collection<KitchenDTO> findAllSortByPriceDesc() {

		
	         
		return null;
	}*/
	
	}	


