package no.hvl.dat100.oppgave4;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

import no.hvl.dat100.common.TODO;
import no.hvl.dat100.oppgave3.*;

public class SkrivBlogg {

	public static boolean skriv(Blogg samling, String mappe, String filnavn) {
		this.mappe = mappe;
		this.filnavn = filnavn;	

	public String toString() {
		return Blogg + "\n" + mappe + "\n" + filnavn;

		throw new UnsupportedOperationException(TODO.method());
	}
}

		try {
			PrintWriter skriver = new PrintWriter(mappe + "/" + filnavn);
			skriver.println(samling.toString());
			skriver.close();
			return true;
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			return false;
		}
	}
