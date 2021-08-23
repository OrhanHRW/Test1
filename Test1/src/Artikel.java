/** Bei den 3 Aufgaben wurde die 1. Aufgabe ausgewählt und implementiert
 * In der Aufgabe soll auf alle Waren eine Grundsteuer von 10% erhoben werden
 * Achtung: ausgenommen von der Steuer sind Bücher, Lebensmittel, medinzinsche Produkte
 * Deswegen sind in der Klassen Input und Output die keine Steuer enthalten mit 0 dargestellt. 
 * Einfuhrumsatzsteuer gilt für ALLE Waren von 5% 
 * Sobald ein Artikel gekauft wird erhält man auch eine Quittung mit Name aller Artikel, Preis, mit Steuer und Gesamtkosten
 * Die Aufgabe: Eine Anwendung für die Quittungdetails für den WArenkorb
 * author Orhan Özer
 */


public class Artikel {

	String name; 
	double preis;
	double preis1;
	double preis2;
	double preis3; 
	double preis4; 
	double preis5; 
	double preis6; 
	double preis7; 
	double preis8; 
	 
	
	double steuern; 
	
	String einkauf; //alle gekauften artikeln
	
			
	double gesamtPreis; 	           //Gesamtpreis
	double salesTaxesGesamt; 		  //Gesamtsteuer
	double gesamtPreisAllerArtikeln; //Gesamtpreis aller Artikeln 
	

	
}
