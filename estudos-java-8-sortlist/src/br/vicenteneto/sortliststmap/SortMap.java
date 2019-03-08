package br.vicenteneto.sortliststmap;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class SortMap {
	
	/**
	 * 
	 * @param map
	 */
	private static void ordenarPelaChave(Map<Integer, String> map) {
		
	//---Sort by Map Key
	    map.entrySet()
	    .stream()
	    .sorted(Comparator.comparing(
	    		Map.Entry::getKey))
	    .forEach(e -> System.out.println(
	    		"Key: "+ e.getKey() 
	    		+", Value: "+ e.getValue()));
	        
	} // ordenarPelaChave

	/**
	 * 
	 * @param map
	 */
	private static void ordenarPeloValor(Map<Integer, String> map) {
		
		//Sort by Map Value
        map.entrySet()
        .stream()
        .sorted(Comparator.comparing(
        		Map.Entry::getValue))
        .forEach(e -> System.out.println(
        		"Key: "+ e.getKey() 
        		+ ", Value: "+ e.getValue()));
	        
	} // ordenarPeloValor
	
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		
		Map<Integer, String> map = new HashMap<>();
		map.put(15, "Marilia");
		map.put(10, "Suelly");
		map.put(30, "Natasha");
		map.put(30, "Margarete");
		map.put(30, "Amanda");
		
		ordenarPeloValor(map);
		
		ordenarPelaChave(map);
	} // main
} // SortMap