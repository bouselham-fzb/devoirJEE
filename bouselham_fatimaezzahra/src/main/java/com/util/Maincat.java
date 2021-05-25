package com.util;

import java.util.List;

import com.dao.LivreDAO;
import com.model.Livre;

public class Maincat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LivreDAO l = new LivreDAO();

		List<Livre> ls = l.livreByCategorie("promaths") ;
		for(Livre ll : ls) {
			System.out.println(ll.getId());
			System.out.println(ll.getTitre());
			System.out.println(ll.getAuteur());
			System.out.println(ll.getCategorie());




		}
		System.out.println("bien affiché");

	}

	}


