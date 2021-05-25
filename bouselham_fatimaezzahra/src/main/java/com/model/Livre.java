package com.model;

import java.sql.Date;

public class Livre {
	
			int id;
			String ref;
			String titre;
			String auteur;
			String categorie;
			int reservation;
			
			
			public Livre() {
				super();
				// TODO Auto-generated constructor stub
			}


			public int getId() {
				return id;
			}


			public void setId(int id) {
				this.id = id;
			}


			public String getRef() {
				return ref;
			}


			public void setRef(String ref) {
				this.ref = ref;
			}


			public String getTitre() {
				return titre;
			}


			public void setTitre(String titre) {
				this.titre = titre;
			}


			

			public String getAuteur() {
				return auteur;
			}


			public void setAuteur(String auteur) {
				this.auteur = auteur;
			}


			public String getCategorie() {
				return categorie;
			}


			public void setCategorie(String categorie) {
				this.categorie = categorie;
			}


			public int getReservation() {
				return reservation;
			}


			public void setReservation(int reservation) {
				this.reservation = reservation;
			}


			public Livre(int id, String ref, String titre, String auteur, String categorie,
					int reservation) {
				super();
				this.id = id;
				this.ref = ref;
				this.titre = titre;
				this.auteur = auteur;
				this.categorie = categorie;
				this.reservation = reservation;
			}


			public Livre(String ref, String titre, String auteur, String categorie, int reservation) {
				super();
				this.ref = ref;
				this.titre = titre;
				this.auteur = auteur;
				this.categorie = categorie;
				this.reservation = reservation;
			}
			
}
