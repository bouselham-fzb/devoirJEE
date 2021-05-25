package com.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.model.Etudiant;
import com.util.DBinteraction;

public class EtudiantDAO {
	
	public int addEtudiant(Etudiant e)
	{
		DBinteraction.connect();
		String sql= "INSERT INTO `etudiants` (`nom`, `prenom`, `age`, `login`, `password`) VALUES ('"+e.getNom()+"', '"+e.getPrenom()+"', '"+e.getAge()+"','"+e.getLogin()+"','"+e.getPassword()+"')";
		int nb = DBinteraction.Maj(sql);
		return nb;
		
	}
	
	public int addEtudiant(String nom,String prenom,int age, String login, String password) {
		DBinteraction.connect();
		String sql="insert into etudiants(`nom`, `prenom`, `age`, `login`, `password`) VALUES ('"+nom+"', '"+prenom+"', '"+age+"','"+login+"','"+password+"')";
		int nb=DBinteraction.Maj(sql);
		return nb;
	}
	
	public Etudiant authentification(String login, String password)
	{
		Etudiant e=null;
		DBinteraction.connect();
		ResultSet rs = DBinteraction.select("select * from etudiants where login='"+login+"' and password='"+password+"'");
		try {
			if(rs.next())
			{
				e=new Etudiant(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getInt(4),rs.getString(5),rs.getString(6));
				/*e.setId(rs.getInt(1));
				e.setNom(rs.getString(2));
				e.setPrenom(rs.getString(3));
				e.setAge(rs.getInt(4));
				e.setLogin(rs.getString(5));
				e.setPassword(rs.getString(6));*/
			}
		} catch (SQLException x) {
			// TODO Auto-generated catch block
			x.printStackTrace();
		}
		return e;
		
	}
}
