
public class Output { 

	public static void main(String[] args) {
		
/** In dieser Klasse Output werden die genannten Arikel aufgelistet. 
 * Im unteren Abschnitt ist wieder das erstelle Objekt zusehen. 
 * Zusätzliche wurde Variable erstellt mir Gesamtpreis sowie Gesamtpreis an Steuer berechnet
 */
		
		Artikel artikel     = new Artikel(); 
		double salesTaxes1  = 1.50;
		double total1       = 29.83;
		
		double salesTaxes2  = 7.65;
		double total2 	    = 65.15;
		
		double salesTaxes3  = 6.70;
		double total3 	    = 74.68;
		
		// hier ist die zuweisung von Gesamt Verkauf Steuer 
		double salesTaxesGesamt = salesTaxes1 + salesTaxes2 + salesTaxes3 ; 
		
		
		
		// Output 1 
		
	    artikel.name    ="Buch";
		artikel.preis   = 12.49;
		artikel.steuern     = 0;
		
		System.out.println("Artikel: " + artikel.name + "\nPreis in €: " + artikel.preis + "\nSteuer%: " + artikel.steuern); 
		

		
		artikel.name        ="CD";
		artikel.preis1       = 16.49;
		artikel.steuern     = Math.round (artikel.preis * 10 / 100); 
		artikel.gesamtPreis = artikel.preis + artikel.steuern; 
			
		System.out.println("\nArtikel: " + artikel.name + "\nPreis in €: " + artikel.preis + "\nSteuern 10%: " +  artikel.steuern + "\nGesamt Preis mit Steuer: " + artikel.gesamtPreis); 
			
		
		
		artikel.name    ="Schokolade";
		artikel.preis2   = 0.85;
		artikel.steuern = 0;; 
		
		System.out.println("\nArtikel: " + artikel.name + "\nPreis in €: " + artikel.preis + "\nSteuer%: " + artikel.steuern); 
		
		
			
		System.out.println("\nSales Taxes: " + salesTaxes1); 
		System.out.println("\nTotal: " + total1); 
		
		
		//Output 2 
		
		artikel.name        ="Import Box Schokolade";
		artikel.preis3       = 10.50;
		artikel.steuern     = Math.round (artikel.preis * 5 / 100); 
		artikel.gesamtPreis = artikel.preis + artikel.steuern; 
			
		System.out.println("\nArtikel: " + artikel.name + "\nPreis in €: " + artikel.preis + "\nSteuer 5%: " +  artikel.steuern + "\nGesamt Preis mit Steuer: " + artikel.gesamtPreis); 
		
		
		artikel.name        ="Import Parfüm Flasche";
		artikel.preis4      = 54.65;
		artikel.steuern     = Math.round (artikel.preis * 5 / 100); 
		artikel.gesamtPreis = artikel.preis + artikel.steuern; 
			
		System.out.println("\nArtikel: " + artikel.name + "\nPreis in €: " + artikel.preis + "\nSteuer 5%: " +  artikel.steuern + "\nGesamtPreis mit Steuer: " + artikel.gesamtPreis); 
		
		System.out.println("\nSales Taxes: " + salesTaxes2); 
		System.out.println("\nTotal: " + total2); 
		
		// Output 3 
		
		artikel.name        ="Import Parfüm Flasche";
		artikel.preis5       = 32.19;
		artikel.steuern     = Math.round (artikel.preis * 5 / 100);
		artikel.gesamtPreis = artikel.preis + artikel.steuern; 
			
		System.out.println("\nArtikel: " + artikel.name + "\nPreis in €: " + artikel.preis + "\nSteuer 5%: " +  artikel.steuern + "\nGesamt Preis mit Steuer: " + artikel.gesamtPreis); 
		
		
		artikel.name        ="Parfüm Flasche";
		artikel.preis6       = 20.89;
		artikel.steuern     = Math.round (artikel.preis * 10 / 100); 
		artikel.gesamtPreis = artikel.preis + artikel.steuern; 
		
			
		System.out.println("\nArtikel: " + artikel.name + "\nPreis in €: " + artikel.preis + "\nSteuer 10%: " +  artikel.steuern + "\nGesamt Preis mit Steuer: " + artikel.gesamtPreis); 
		
		
		artikel.name    ="Packet Kopfschmerze Tabletten";
		artikel.preis7   = 9.75;
		artikel.steuern = 0; 
	
		System.out.println("\nArtikel: " + artikel.name + "\nPreis in €: " + artikel.preis + "\nSteuer%: " + artikel.steuern); 
		
		
		artikel.name        ="Import Box Schokolade";
		artikel.preis8       = 11.85;
		artikel.steuern     = Math.round (artikel.preis * 5 / 100); 
		artikel.gesamtPreis = artikel.preis + artikel.steuern; 
			
		System.out.println("\nArtikel: " + artikel.name + "\nPreis in €: " + artikel.preis + "\nSteuer 5%: " +  artikel.steuern +"\nGesamt Preis mit Steuer: " + artikel.gesamtPreis);
		
		System.out.println("\nSales Taxes: " + salesTaxes3); 
		System.out.println("\nTotal: " + total3); 
		
		// gibt Gesamt Verkauf Steuer aus 
		System.out.println("\nTotal Sales Taxes €: " + Math.round(salesTaxesGesamt)); 
		
		
		// Gesamtpreis aller Artikeln 
		artikel.gesamtPreisAllerArtikeln = artikel.preis + artikel.preis1 + artikel.preis2 + artikel.preis3 + artikel.preis4 + artikel.preis5 + artikel.preis6 + artikel.preis7 + artikel.preis8;
		
        System.out.println("\nGesamt Preis aller Artikeln in €: " + artikel.gesamtPreisAllerArtikeln) ; 
		
		
		
	}

}
