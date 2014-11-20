package fr.treeptik.Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import fr.treeptik.model.Client;

public class TestJDBC {

	public static void main(String[] args) throws Exception{
		Class.forName("com.mysql.jdbc.Driver");
		String url = "jdbc:mysql://localhost:3306/Location";
		Connection connection = DriverManager.getConnection(url, "root", "root");
		TestJDBC testJDBC = new TestJDBC();
		//testJDBC.getAllClient(connection);
		//testJDBC.getAllContrat(connection);
		testJDBC.getContratOfClient(connection, 2);
		connection.close();

	}
	//Afficher la liste des clients triée par Nom ;
	public void getAllClient(Connection connection)throws Exception{
		
		String q1 = "SELECT * FROM client ORDER BY nomcl";
		PreparedStatement statement = connection.prepareStatement(q1);
		ResultSet res1 = statement.executeQuery();
		while (res1.next()) {
			System.out.println(res1.getString("nomcl"));
		}
	
	}

	
	//Afficher la liste des contrats, triée par Date contrat ;
	public void  getAllContrat(Connection connection)throws Exception{
		
		String q1 = "SELECT * FROM contrat ORDER BY date_contrat";
		PreparedStatement statement = connection.prepareStatement(q1);
		ResultSet res1 = statement.executeQuery();
		while (res1.next()) {
			System.out.println(res1.getString("nocontrat"));
		}
	}
	
	//Afficher la liste des contrats d’un client donné ;
	public void  getContratOfClient(Connection connection, int id)throws Exception{
		
		String q1 = "select * from contrat where codecl= ?";
		PreparedStatement statement = connection.prepareStatement(q1);
		statement.setInt(1, id);
		ResultSet res1 = statement.executeQuery();
		while (res1.next()) {
			System.out.println(res1.getString("nocontrat"));
		}
	}	
	
	//Afficher la liste des voitures disponibles ;
	//select * from voiture where disponible = true;
	
	//Afficher la liste des réparations pour une voiture donnée ;
	//select * from reparations where noimmatriculation = 1;
	
	//f) Afficher la réparation la plus chère;
	//select Max(montant_repa) from reparations;
	
	//g) Afficher le nombre de voiture par type ;
	//select count(*) from voiture group by code_type;
	
	//h) Afficher le nombre de réparations par voiture ;
	//select count(*) from reparations group by noimmatriculation;
	
	//i) Afficher le nombre de réparations par type_voiture ;
	
	//j) Afficher le montant des contrats par client ;
	//select SUM(Montant_Contrat) from client join contrat on contrat.codecl=client.codecl group by client.codecl;
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
