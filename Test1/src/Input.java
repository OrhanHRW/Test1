
public class Input {

	public static void main(String[] args) {
		
		/**
		 *  Die Aufgabe wurde jeweils mit Input und Output getrennt. 
		 *  Hierbei handelt es sich um die Klasse Input. 
		 *  Die Klasse beinhaletet Input 1 bis 3
		 */
		
		
		// hier wird ein neues Objekt erzeugt 
		Artikel artikel = new Artikel(); 
		
		artikel.name = "Buch"; 
		artikel.preis = 12.49;
		artikel.steuern = 0;
		
		/* 
		 * Ausgabe gibt den Atikel Name, Gesamtpreis und steuer an.
		 * In den Unteren Abschnitten gilt das selbe verfahren deshalb wurde nur hier kommentiert. 
		 */
	
		System.out.println("Artikel Input 1: " + artikel.name + "\nPreis in €: " + artikel.preis + "\nSteuer%: " + artikel.steuern); 
		
		
		artikel.name    =" CD";
		artikel.preis1   = 14.99;
		artikel.steuern = Math.round (artikel.preis * 10 / 100); 
		artikel.gesamtPreis = artikel.preis + artikel.steuern; 
		
		System.out.println("\nArtikel Input 1: " + artikel.name + "\nPreis in €: " + artikel.preis + "\nSteuern 10%: " +  artikel.steuern + "\nGesamt Preis mit Steuer: " + artikel.gesamtPreis);
		
		
		artikel.name    =" Schokolade";
		artikel.preis2   = 0.85;
		artikel.steuern = 0; 
		
		System.out.println("\nArtikel Input 1: " + artikel.name + "\nPreis in €: " + artikel.preis + "\nSteuer%: " + artikel.steuern); 
		
		
		// Input 2
		
		artikel.name = "Import Box Schokolade"; 
		artikel.preis3 = 10.00;
		artikel.steuern = Math.round (artikel.preis * 5 / 100); 
		artikel.gesamtPreis = artikel.preis + artikel.steuern; 
		
		System.out.println("\nArtikel Input 2: " + artikel.name + "\nPreis in €: " + artikel.preis + "\nSteuern 5%: " +  artikel.steuern + "\nGesamt Preis mit Steuer: " + artikel.gesamtPreis);
		
		
		artikel.name = "Parfüm Flasche"; 
		artikel.preis4 = 47.50;
		artikel.steuern = Math.round (artikel.preis * 10 / 100); 
		artikel.gesamtPreis = artikel.preis + artikel.steuern;
		
		System.out.println("\nArtikel Input 2: " + artikel.name + "\nPreis in €: " + artikel.preis + "\nSteuern 10%: " +  artikel.steuern + "\nGesamt Preis mit Steuer: " + artikel.gesamtPreis);
		
	
		
		// Input 3 
		
		artikel.name = "Import Parfüm Flasche"; 
		artikel.preis5 = 27.99;
		artikel.steuern = Math.round (artikel.preis * 5 / 100); 
		artikel.gesamtPreis = artikel.preis + artikel.steuern;
		
		System.out.println("\nArtikel Input 3: " + artikel.name + "\nPreis in €: " + artikel.preis + "\nSteuern 5%: " +  artikel.steuern + "\nGesamt Preis mit Steuer: " + artikel.gesamtPreis);
		
		
		artikel.name = "Parfüm Flasche"; 
		artikel.preis6 = 18.99;
		artikel.steuern = Math.round (artikel.preis * 10 / 100); 
		artikel.gesamtPreis = artikel.preis + artikel.steuern;
		
		System.out.println("\nArtikel Input 3: " + artikel.name + "\nPreis in €: " + artikel.preis + "\nSteuern 10%: " +  artikel.steuern + "\nGesamt Preis mit Steuer: " + artikel.gesamtPreis);
		
		
		artikel.name = "Packet Kopfschmerz Tabletten"; 
		artikel.preis7 = 9.75;
		artikel.steuern = 0; 
		artikel.gesamtPreis = artikel.preis + artikel.steuern;
		
		System.out.println("\nArtikel Input 3: " + artikel.name + "\nPreis in €: " + artikel.preis + "\nSteuern 5%: " +  artikel.steuern + "\nGesamt Preis mit Steuer: " + artikel.gesamtPreis);
		
		
		artikel.name = "Import Box Schokolade"; 
		artikel.preis8 = 11.85;
		artikel.steuern = Math.round (artikel.preis * 5 / 100); 
		artikel.gesamtPreis = artikel.preis + artikel.steuern;
		
		System.out.println("\nArtikel Input3: " + artikel.name + "\nPreis in €: " + artikel.preis + "\nSteuern 5%: " +  artikel.steuern + "\nGesamt Preis mit Steuer: " + artikel.gesamtPreis);
		
		// Gesamtpreis aller Artikeln 
		
		artikel.gesamtPreisAllerArtikeln = artikel.preis + artikel.preis1 + artikel.preis2 + artikel.preis3 + artikel.preis4 + artikel.preis5 + artikel.preis6 + artikel.preis7 + artikel.preis8;
				
		System.out.println("\nGesamt Preis aller Artikeln in €: " + artikel.gesamtPreisAllerArtikeln) ; 
		
		
	}

}
