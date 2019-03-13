package it.polito.tdp.alien;

import java.util.*;

public class AlienDictionary {
	
	List<Word> dizionario=new LinkedList<Word>();
	Map<String,Word> dizionarioMap=new TreeMap<String,Word>();
    
	public void addWord(String alienWord, String translation) {
		Word temp=new Word(alienWord.toLowerCase(),translation.toLowerCase());
		if(dizionarioMap.containsKey(alienWord.toLowerCase())){
			dizionario.remove(dizionarioMap.get(alienWord.toLowerCase()));
			dizionario.add(temp);
			dizionarioMap.remove(alienWord.toLowerCase());
			dizionarioMap.put(alienWord.toLowerCase(),temp);}
		else {dizionario.add(temp);
		dizionarioMap.put(alienWord.toLowerCase(),temp);
		}
	}
	public String translateWord(String alienWord) {
		if(dizionarioMap.containsKey(alienWord.toLowerCase())) {
			return dizionarioMap.get(alienWord.toLowerCase()).getTraslation();
		}
		else {return null;}
	}

}
