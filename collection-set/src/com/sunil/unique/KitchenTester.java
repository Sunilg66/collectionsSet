package com.sunil.unique;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

import com.sunil.unique.comparator.KitchenByNameComparator;
import com.sunil.unique.comparator.KitchenByPriceComparator;
import com.sunil.unique.comparator.KitchenUsedforComparator;
import com.sunil.unique.dao.KitchenDAO;
import com.sunil.unique.dao.KitchenDAOImpl;
import com.sunil.unique.dto.KitchenDTO;

public class KitchenTester {

	public static void main(String[] args) {
		
		KitchenDTO dto = new KitchenDTO("RiceCooker",2500.00d,"Ricemaking","Silver");
		System.out.println(dto.hashCode());
		System.out.println(System.identityHashCode(dto));
		
		KitchenDTO dto1 = new KitchenDTO("Fryingpan",500.00d,"making curry","Aluminium");
		System.out.println(dto1.hashCode());
		System.out.println(System.identityHashCode(dto1));
		
		KitchenDTO dto2 = new KitchenDTO("VegetableSteamer",1000.00d,"Cuttingvegetables","Steel");
		System.out.println(dto2.hashCode());
		System.out.println(System.identityHashCode(dto2));
		
		KitchenDTO dto3 = new KitchenDTO("VegetableSteamer",1000.00d,"Cuttingvegetables","Steel");
		System.out.println(dto3.hashCode());
		System.out.println(System.identityHashCode(dto3));
		
		KitchenByPriceComparator price = new KitchenByPriceComparator();
		KitchenUsedforComparator c = new KitchenUsedforComparator();
		
		KitchenByNameComparator comp = new KitchenByNameComparator();
		Set<KitchenDTO> set = new TreeSet<KitchenDTO>(c);
		set.add(dto);
		set.add(dto1);
		set.add(dto2);
		set.add(dto3);
		
		Iterator<KitchenDTO> it = set.iterator();
		while(it.hasNext()) {
			KitchenDTO kitchen = (KitchenDTO) it.next();
			System.out.println(kitchen);
		}
		
		KitchenDAO dao = new KitchenDAOImpl();
		boolean save = dao.saveUnique(dto);
		System.out.println(save);
		dao.saveUnique(dto1);
		dao.saveUnique(dto2);
		dao.saveUnique(dto3);
		
		Collection<KitchenDTO> collection = dao.findAllSortByUsedFor();
		for(KitchenDTO temp : collection) {
			System.out.println(temp);
		}
		 
		Collection<KitchenDTO> coll = dao.findAllSortByUsedForDesc();
		for(KitchenDTO dt : coll) {
			System.out.println(dt);
		}
		
		Collection<KitchenDTO> byname  = dao.findAllSortByName();
		for(KitchenDTO kit : byname) {
			System.out.println(kit);
		}
		
		/*Collection<KitchenDTO> byprice  = dao.findAllSortByPriceDesc();
		for(KitchenDTO bypric : byprice) {
			System.out.println(bypric);
		}*/

	}

}
