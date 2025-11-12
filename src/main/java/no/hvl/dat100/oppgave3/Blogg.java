package no.hvl.dat100.oppgave3;

import no.hvl.dat100.common.TODO;
import no.hvl.dat100.oppgave1.*;

public class Blogg {
	private Innlegg[] innlegg;
	private int nesteLedig;	
	// TODO: objektvariable 

	public Blogg(int antall) {
		this.antall = antall
		innlegg = new Innlegg[antall];
		nesteLedig = 0;	

		throw new UnsupportedOperationException(TODO.constructor("Blogg"));
	}

	public Blogg(String innlegg) {
		this.innlegg = innlegg;

		throw new UnsupportedOperationException(TODO.constructor("Blogg"));
	}

	public Blogg(int lengde) {
		this.lengde = lengde;

		Blogg bl = new Blogg(lengde);
		lengde = 20;
		throw new UnsupportedOperationException(TODO.constructor("Blogg"));
	}

	public int getAntall() {
		return antall;
		throw new UnsupportedOperationException(TODO.method());
	}
	
	public Innlegg[] getSamling() {
		return samling;
		throw new UnsupportedOperationException(TODO.method());

	}
	
	public int finnInnlegg(Innlegg innlegg) {
		Innlegg i = null;
		int i = 0;
		while (i == id) ) {
			if (innlegg[i] == innlegg) {
				return i;
			}
			i++;
		}

		throw new UnsupportedOperationException(TODO.method());
	}

	public boolean finnes(Innlegg innlegg) {
		if (Innlegg == innlegg) {
			return true;
		}
		 return false;
		throw new UnsupportedOperationException(TODO.method());
	}

	public boolean ledigPlass() {
		if (nesteLedig < innlegg.length) {
			return true;
		}
		return false;

		throw new UnsupportedOperationException(TODO.method());

	}
	
	public boolean leggTil(Innlegg innlegg) {
		if (ledigPlass()) {
			this.innlegg[nesteLedig] = innlegg;
			nesteLedig++;
			return true;
		}
		return false;

		throw new UnsupportedOperationException(TODO.method());
	}
	
	public String toString() {
		return innlegg + "\n" + id + "\n" + bruker + "\n" + dato + "\n" + likes + "\n" + tekst + "\n" + url + "\n";
		
		throw new UnsupportedOperationException(TODO.method());
	}

	// valgfrie oppgaver nedenfor
	
	public void utvid() {
		throw new UnsupportedOperationException(TODO.method());
	}
	
	public boolean leggTilUtvid(Innlegg innlegg) {

		throw new UnsupportedOperationException(TODO.method());
		
	}
	
	public boolean slett(Innlegg innlegg) {
		
		throw new UnsupportedOperationException(TODO.method());
	}
	
	public int[] search(String keyword) {
		
		throw new UnsupportedOperationException(TODO.method());

	}
}