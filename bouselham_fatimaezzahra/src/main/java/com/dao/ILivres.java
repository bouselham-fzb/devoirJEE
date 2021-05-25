package com.dao;

import java.util.List;

import com.model.Livre;

public interface ILivres {

	public List<Livre> allLivres();
	public List<Livre> livreByAuthor(String auteur);
	public List<Livre> livreByCategorie(String categorie);
	
}
