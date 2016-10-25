package uebung_3_3;

public class BodyMassIndex {

	public static void main(String[] args) {
		double Gewicht = 90;
		double Körpergröße = 1.81;
		boolean istmännlich = true;
		double Alter = 64;
		
		double BMI = Gewicht/(Körpergröße*Körpergröße);
		
		if (istmännlich == true && Alter > 64) {
			System.out.println( "Sie haben Normalgewicht wenn ihr BMI zwischen 25 und 30 ist");
			System.out.println(BMI); }
		else if(istmännlich && Alter > 54) {
			// Kann ich hier das == true weglassen? weil bei beiden Varainten das gleich Ergebnis erscheint
			System.out.println( "Sie haben Normalgewicht wenn ihr BMI zwischen 24 und 29 ist");
			System.out.println(BMI); }
		else if(istmännlich && Alter > 45) {
			System.out.println( "Sie haben Normalgewicht wenn ihr BMI zwischen 23 und 28 ist");
			System.out.println(BMI); }
		else if (istmännlich && Alter > 35) {
			System.out.println( "Sie haben Normalgewicht wenn ihr BMI zwischen 22 und 27 ist");
			System.out.println(BMI); }
		else if (istmännlich && Alter > 25) {
			System.out.println( "Sie haben Normalgewicht wenn ihr BMI zwischen 21 und 26 ist");
			System.out.println(BMI); }
		else if (istmännlich && Alter > 0) {
			System.out.println( "Sie haben Normalgewicht wenn ihr BMI zwischen 20 und 25 ist");
			System.out.println(BMI); }
		
		if (istmännlich == false && Alter > 64) {
			System.out.println( "Sie haben Normalgewicht wenn ihr BMI zwischen 24 und 29 ist");
			System.out.println(BMI); }
		else if(istmännlich == false && Alter > 54) {
			System.out.println( "Sie haben Normalgewicht wenn ihr BMI zwischen 23 und 28 ist");
			System.out.println(BMI); }
		else if(istmännlich == false && Alter > 45) {
			System.out.println( "Sie haben Normalgewicht wenn ihr BMI zwischen 22 und 27 ist");
			System.out.println(BMI); }
		else if (istmännlich == false && Alter > 35) {
			System.out.println( "Sie haben Normalgewicht wenn ihr BMI zwischen 21 und 26 ist");
			System.out.println(BMI); }
		else if (istmännlich == false && Alter > 25) {
			System.out.println( "Sie haben Normalgewicht wenn ihr BMI zwischen 20 und 25 ist");
			System.out.println(BMI); }
		else if (istmännlich == false && Alter > 0) {
			System.out.println( "Sie haben Normalgewicht wenn ihr BMI zwischen 19 und 24 ist");
			System.out.println(BMI); }
		}
		

	}


