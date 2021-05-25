package com.dao;

import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import com.model.Etudiant;
import com.model.Livre;
import com.util.DBinteraction;

public class LivreDAO implements ILivres {

	@Override
	public List<Livre> livreByAuthor(String auteur) {
		// TODO Auto-generated method stub
		List<Livre> las=new ArrayList<Livre>();
		DBinteraction.connect();
		ResultSet rs = DBinteraction.select("SELECT * FROM livres WHERE auteur ='" +auteur +"';");
		
		try {
			while(rs.next())
			{
				Livre l = new Livre();
				l.setId(rs.getInt(1));
				l.setRef(rs.getString(2));
				l.setTitre(rs.getString(3));
				l.setAuteur(rs.getString(4));
				l.setCategorie(rs.getString(5));
				l.setReservation(rs.getInt(6));
				las.add(l);

			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return las;

	}

	@Override
	public List<Livre> livreByCategorie(String categorie) {
		// TODO Auto-generated method stub
		Livre l=null;
		List<Livre> lgs=new ArrayList<Livre>();
		DBinteraction.connect();
		ResultSet rs = DBinteraction.select("SELECT * from livres WHERE categorie =  '" +categorie +"'");
		
		try {
			while(rs.next())
			{
				 l = new Livre();
				l.setId(rs.getInt(1));
				l.setRef(rs.getString(2));
				l.setTitre(rs.getString(3));
				l.setAuteur(rs.getString(4));
				l.setCategorie(rs.getString(5));
				l.setReservation(rs.getInt(6));
				lgs.add(l);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("what happen!!");
		}
		return lgs;
	}

	@Override
	public List<Livre> allLivres() {
		// TODO Auto-generated method stub
		Livre l=null;
		List<Livre> ls=new ArrayList<Livre>();
		DBinteraction.connect();
		ResultSet rs = DBinteraction.select("select * from livres;");
		
		try {
			while(rs.next())
			{
				l = new Livre();
				l.setId(rs.getInt(1));
				l.setRef(rs.getString(2));
				l.setTitre(rs.getString(3));
				l.setAuteur(rs.getString(4));
				l.setCategorie(rs.getString(5));
				l.setReservation(rs.getInt(6));
				ls.add(l);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("cooooooooooocooooooooo");
		}
		return ls;
	}	
	
	
	
	
	public int addlivre(Livre l)
	{
		DBinteraction.connect();
		String sql= "INSERT INTO `livres` (`ref`, `titre`, `auteur`, `categorie`,`reservation` ) VALUES ('"+l.getRef()+"', '"+l.getTitre()+"','"+l.getAuteur()+"','"+l.getCategorie()+"','"+0+"')";
		int nb = DBinteraction.Maj(sql);
		return nb;
		
	}
	public int addlivre(String ref,String titre, String auteur, String categorie) {
		DBinteraction.connect();
		String sql="insert into `livres` (`ref`, `titre`, `auteur`, `categorie`,`reservation` ) VALUES ('"+ref+"', '"+titre+"','"+auteur+"','"+categorie+"','"+0+"')";
		int nb=DBinteraction.Maj(sql);
		return nb;
	}
	

}	
 

