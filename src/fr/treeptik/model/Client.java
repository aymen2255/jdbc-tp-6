package fr.treeptik.model;

import java.util.List;

public class Client {
	private int codecl;
	private String nomcl;
	private String adresse;
	private String Ville;
	private List<Contrat> listContrats;
	public int getCodecl() {
		return codecl;
	}
	public void setCodecl(int codecl) {
		this.codecl = codecl;
	}
	public String getNomcl() {
		return nomcl;
	}
	public void setNomcl(String nomcl) {
		this.nomcl = nomcl;
	}
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	public String getVille() {
		return Ville;
	}
	public void setVille(String ville) {
		Ville = ville;
	}
	public List<Contrat> getListContrats() {
		return listContrats;
	}
	public void setListContrats(List<Contrat> listContrats) {
		this.listContrats = listContrats;
	}
	
	
}
