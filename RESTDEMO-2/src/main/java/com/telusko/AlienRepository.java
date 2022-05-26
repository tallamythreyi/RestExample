package com.telusko;

import java.util.ArrayList;
import java.util.List;

public class AlienRepository {
	List<Alien> list = new ArrayList<Alien>();
	public AlienRepository() {
		
		list = new ArrayList<Alien>();
		System.out.println("inside AlienRepository");
		
		Alien a1 = new Alien();
		a1.setId(101);
		a1.setName("mai");
		a1.setPoints(34);
		
		Alien a2 = new Alien();
		a2.setId(102);
		a2.setName("sari");
		a2.setPoints(43);
		
		Alien a3 = new Alien();
		a3.setId(103);
		a3.setName("vari");
		a3.setPoints(55);
		
		list.add(a1);
		list.add(a2);
		list.add(a3);
		System.out.println(list);
	}
	public List<Alien> getAll() {
		System.out.println("getAll()----");
		return list;
	}
	public Alien getAlienById(int id) {
		for(Alien a: list) {
			if(a.getId() == id) {
				return a;
			}
		}
		return new Alien();
	}
	public Alien createAlien(Alien a) {
		System.out.println("a = "+a);
		System.out.println("Before create Alien--"+list);
		list.add(a);
		System.out.println("After create Alien--"+list);
		return a;
	}
}
