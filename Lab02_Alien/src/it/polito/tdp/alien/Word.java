package it.polito.tdp.alien;

public class Word {
	private String alienWord;
	private String traslation;
	
	
public Word(String alienWord, String traslation) {
		super();
		this.alienWord = alienWord;
		this.traslation = traslation;
	}


public String getAlienWord() {
		return alienWord;
	}


	public void setAlienWord(String alienWord) {
		this.alienWord = alienWord;
	}


	public String getTraslation() {
		return traslation;
	}


	public void setTraslation(String traslation) {
		this.traslation = traslation;
	}


public boolean equals(Object obj) {
  Word s=(Word)obj;
  if(this.alienWord.toLowerCase().compareTo(s.getAlienWord().toLowerCase())==0) {
	  return true;
  }else {return false;}

}
}
